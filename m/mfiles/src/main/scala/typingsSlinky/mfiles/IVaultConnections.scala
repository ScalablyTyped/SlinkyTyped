package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultConnections extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, VaultConnection: IVaultConnection): Unit = js.native
  def GetVaultConnectionByName(VaultConnectionName: String): IVaultConnection = js.native
  def GetVaultConnectionIndexByName(VaultConnectionName: String): Double = js.native
  def Item(Index: Double): IVaultConnection = js.native
  def Remove(Index: Double): Unit = js.native
}

object IVaultConnections {
  @scala.inline
  def apply(
    Add: (Double, IVaultConnection) => Unit,
    Count: Double,
    GetVaultConnectionByName: String => IVaultConnection,
    GetVaultConnectionIndexByName: String => Double,
    Item: Double => IVaultConnection,
    Remove: Double => Unit
  ): IVaultConnections = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], GetVaultConnectionByName = js.Any.fromFunction1(GetVaultConnectionByName), GetVaultConnectionIndexByName = js.Any.fromFunction1(GetVaultConnectionIndexByName), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IVaultConnections]
  }
  @scala.inline
  implicit class IVaultConnectionsOps[Self <: IVaultConnections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, IVaultConnection) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetVaultConnectionByName(value: String => IVaultConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVaultConnectionByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVaultConnectionIndexByName(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVaultConnectionIndexByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => IVaultConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

