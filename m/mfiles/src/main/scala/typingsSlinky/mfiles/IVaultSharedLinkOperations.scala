package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultSharedLinkOperations extends js.Object {
  def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): ISharedLinkInfo = js.native
  def DeleteSharedLink(AccessKey: String): Unit = js.native
  def GetSharedLink(AccessKey: String): ISharedLinkInfo = js.native
  def GetSharedLinks(CreatedByUser: Double): ISharedLinkInfos = js.native
  def GetSharedLinksByObject(ObjID: IObjID): ISharedLinkInfos = js.native
}

object IVaultSharedLinkOperations {
  @scala.inline
  def apply(
    CreateSharedLink: ISharedLinkInfo => ISharedLinkInfo,
    DeleteSharedLink: String => Unit,
    GetSharedLink: String => ISharedLinkInfo,
    GetSharedLinks: Double => ISharedLinkInfos,
    GetSharedLinksByObject: IObjID => ISharedLinkInfos
  ): IVaultSharedLinkOperations = {
    val __obj = js.Dynamic.literal(CreateSharedLink = js.Any.fromFunction1(CreateSharedLink), DeleteSharedLink = js.Any.fromFunction1(DeleteSharedLink), GetSharedLink = js.Any.fromFunction1(GetSharedLink), GetSharedLinks = js.Any.fromFunction1(GetSharedLinks), GetSharedLinksByObject = js.Any.fromFunction1(GetSharedLinksByObject))
    __obj.asInstanceOf[IVaultSharedLinkOperations]
  }
  @scala.inline
  implicit class IVaultSharedLinkOperationsOps[Self <: IVaultSharedLinkOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateSharedLink(value: ISharedLinkInfo => ISharedLinkInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateSharedLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteSharedLink(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteSharedLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSharedLink(value: String => ISharedLinkInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSharedLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSharedLinks(value: Double => ISharedLinkInfos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSharedLinks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSharedLinksByObject(value: IObjID => ISharedLinkInfos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSharedLinksByObject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

