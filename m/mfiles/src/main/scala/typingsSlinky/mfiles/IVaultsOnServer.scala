package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultsOnServer extends js.Object {
  val Count: Double = js.native
  def GetVaultByGUID(GUID: String): IVaultOnServer = js.native
  def GetVaultByName(Name: String): IVaultOnServer = js.native
  def GetVaultIndexByGUID(GUID: String): Double = js.native
  def GetVaultIndexByName(Name: String): Double = js.native
  def Item(Index: Double): IVaultOnServer = js.native
}

object IVaultsOnServer {
  @scala.inline
  def apply(
    Count: Double,
    GetVaultByGUID: String => IVaultOnServer,
    GetVaultByName: String => IVaultOnServer,
    GetVaultIndexByGUID: String => Double,
    GetVaultIndexByName: String => Double,
    Item: Double => IVaultOnServer
  ): IVaultsOnServer = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], GetVaultByGUID = js.Any.fromFunction1(GetVaultByGUID), GetVaultByName = js.Any.fromFunction1(GetVaultByName), GetVaultIndexByGUID = js.Any.fromFunction1(GetVaultIndexByGUID), GetVaultIndexByName = js.Any.fromFunction1(GetVaultIndexByName), Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IVaultsOnServer]
  }
  @scala.inline
  implicit class IVaultsOnServerOps[Self <: IVaultsOnServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetVaultByGUID(value: String => IVaultOnServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVaultByGUID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVaultByName(value: String => IVaultOnServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVaultByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVaultIndexByGUID(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVaultIndexByGUID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVaultIndexByName(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVaultIndexByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => IVaultOnServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

