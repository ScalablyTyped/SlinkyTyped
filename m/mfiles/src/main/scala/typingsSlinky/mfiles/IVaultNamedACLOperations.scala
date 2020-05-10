package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFNamedACLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultNamedACLOperations extends js.Object {
  def AddNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): INamedACLAdmin = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL = js.native
  def GetNamedACL(NamedACLID: Double): INamedACL = js.native
  def GetNamedACLAdmin(NamedACLID: Double): INamedACLAdmin = js.native
  def GetNamedACLIDByAlias(Alias: String): Double = js.native
  def GetNamedACLIDByGUID(NamedACLGUID: String): Double = js.native
  def GetNamedACLWithRefresh(NamedACLID: Double, RefreshFromServer: Boolean): INamedACL = js.native
  def GetNamedACLs(): INamedACLs = js.native
  def GetNamedACLsByTypeAdmin(Type: MFNamedACLType): INamedACLsAdmin = js.native
  def GetNamedACLsWithRefresh(RefreshFromServer: Boolean): INamedACLs = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: Double): Boolean = js.native
  def RemoveNamedACLWithPropagationAdmin(NamedACLID: Double, AllowPropagation: Boolean): Unit = js.native
  def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(NamedACLAdmin: INamedACLAdmin, MaintainLinks: Boolean, AllowPropagation: Boolean): Unit = js.native
}

object IVaultNamedACLOperations {
  @scala.inline
  def apply(
    AddNamedACLAdmin: INamedACLAdmin => INamedACLAdmin,
    GetMatchingNamedACLForAccessControlList: (IAccessControlList, Boolean, Boolean, Boolean) => INamedACL,
    GetMatchingNamedACLForAccessControlListComponent: (IAccessControlListComponent, Boolean, Boolean) => INamedACL,
    GetNamedACL: Double => INamedACL,
    GetNamedACLAdmin: Double => INamedACLAdmin,
    GetNamedACLIDByAlias: String => Double,
    GetNamedACLIDByGUID: String => Double,
    GetNamedACLWithRefresh: (Double, Boolean) => INamedACL,
    GetNamedACLs: () => INamedACLs,
    GetNamedACLsByTypeAdmin: MFNamedACLType => INamedACLsAdmin,
    GetNamedACLsWithRefresh: Boolean => INamedACLs,
    IsNamedACLUsedInAutomaticPermissionsAdmin: Double => Boolean,
    RemoveNamedACLWithPropagationAdmin: (Double, Boolean) => Unit,
    UpdateNamedACLAdmin: INamedACLAdmin => Unit,
    UpdateNamedACLWithPropagationAdmin: (INamedACLAdmin, Boolean, Boolean) => Unit
  ): IVaultNamedACLOperations = {
    val __obj = js.Dynamic.literal(AddNamedACLAdmin = js.Any.fromFunction1(AddNamedACLAdmin), GetMatchingNamedACLForAccessControlList = js.Any.fromFunction4(GetMatchingNamedACLForAccessControlList), GetMatchingNamedACLForAccessControlListComponent = js.Any.fromFunction3(GetMatchingNamedACLForAccessControlListComponent), GetNamedACL = js.Any.fromFunction1(GetNamedACL), GetNamedACLAdmin = js.Any.fromFunction1(GetNamedACLAdmin), GetNamedACLIDByAlias = js.Any.fromFunction1(GetNamedACLIDByAlias), GetNamedACLIDByGUID = js.Any.fromFunction1(GetNamedACLIDByGUID), GetNamedACLWithRefresh = js.Any.fromFunction2(GetNamedACLWithRefresh), GetNamedACLs = js.Any.fromFunction0(GetNamedACLs), GetNamedACLsByTypeAdmin = js.Any.fromFunction1(GetNamedACLsByTypeAdmin), GetNamedACLsWithRefresh = js.Any.fromFunction1(GetNamedACLsWithRefresh), IsNamedACLUsedInAutomaticPermissionsAdmin = js.Any.fromFunction1(IsNamedACLUsedInAutomaticPermissionsAdmin), RemoveNamedACLWithPropagationAdmin = js.Any.fromFunction2(RemoveNamedACLWithPropagationAdmin), UpdateNamedACLAdmin = js.Any.fromFunction1(UpdateNamedACLAdmin), UpdateNamedACLWithPropagationAdmin = js.Any.fromFunction3(UpdateNamedACLWithPropagationAdmin))
    __obj.asInstanceOf[IVaultNamedACLOperations]
  }
  @scala.inline
  implicit class IVaultNamedACLOperationsOps[Self <: IVaultNamedACLOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNamedACLAdmin(value: INamedACLAdmin => INamedACLAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddNamedACLAdmin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMatchingNamedACLForAccessControlList(value: (IAccessControlList, Boolean, Boolean, Boolean) => INamedACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMatchingNamedACLForAccessControlList")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetMatchingNamedACLForAccessControlListComponent(value: (IAccessControlListComponent, Boolean, Boolean) => INamedACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMatchingNamedACLForAccessControlListComponent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetNamedACL(value: Double => INamedACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNamedACL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNamedACLAdmin(value: Double => INamedACLAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNamedACLAdmin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNamedACLIDByAlias(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNamedACLIDByAlias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNamedACLIDByGUID(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNamedACLIDByGUID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNamedACLWithRefresh(value: (Double, Boolean) => INamedACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNamedACLWithRefresh")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNamedACLs(value: () => INamedACLs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNamedACLs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNamedACLsByTypeAdmin(value: MFNamedACLType => INamedACLsAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNamedACLsByTypeAdmin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNamedACLsWithRefresh(value: Boolean => INamedACLs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNamedACLsWithRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsNamedACLUsedInAutomaticPermissionsAdmin(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsNamedACLUsedInAutomaticPermissionsAdmin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveNamedACLWithPropagationAdmin(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveNamedACLWithPropagationAdmin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateNamedACLAdmin(value: INamedACLAdmin => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateNamedACLAdmin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateNamedACLWithPropagationAdmin(value: (INamedACLAdmin, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateNamedACLWithPropagationAdmin")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

