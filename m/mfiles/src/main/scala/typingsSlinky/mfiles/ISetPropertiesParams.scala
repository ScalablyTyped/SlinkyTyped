package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFACLEnforcingMode
import typingsSlinky.mfiles.MFiles.MFObjectOperationFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetPropertiesParams extends js.Object {
  var AccessControlListEnforcingMode: MFACLEnforcingMode = js.native
  var AccessControlListProvidedForEnforcing: IAccessControlList = js.native
  var AllowModifyingCheckedInObject: Boolean = js.native
  var FailIfNotLatestCheckedInVersion: Boolean = js.native
  var FullSet: Boolean = js.native
  var ObjVer: IObjVer = js.native
  var PropertyValuesToRemove: IIDs = js.native
  var PropertyValuesToSet: IPropertyValues = js.native
  def Clone(): ISetPropertiesParams = js.native
  def SetWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    FailIfNotLatestCheckedInVersion: Boolean,
    PropertyValuesToSet: IPropertyValues,
    FullSet: Boolean,
    PropertyValuesToRemove: IIDs,
    ObjectOperationFlags: MFObjectOperationFlags,
    AccessControlListEnforcingMode: MFACLEnforcingMode,
    AccessControlListProvidedForEnforcing: IAccessControlList
  ): Unit = js.native
}

object ISetPropertiesParams {
  @scala.inline
  def apply(
    AccessControlListEnforcingMode: MFACLEnforcingMode,
    AccessControlListProvidedForEnforcing: IAccessControlList,
    AllowModifyingCheckedInObject: Boolean,
    Clone: () => ISetPropertiesParams,
    FailIfNotLatestCheckedInVersion: Boolean,
    FullSet: Boolean,
    ObjVer: IObjVer,
    PropertyValuesToRemove: IIDs,
    PropertyValuesToSet: IPropertyValues,
    SetWithPermissions: (IObjVer, Boolean, Boolean, IPropertyValues, Boolean, IIDs, MFObjectOperationFlags, MFACLEnforcingMode, IAccessControlList) => Unit
  ): ISetPropertiesParams = {
    val __obj = js.Dynamic.literal(AccessControlListEnforcingMode = AccessControlListEnforcingMode.asInstanceOf[js.Any], AccessControlListProvidedForEnforcing = AccessControlListProvidedForEnforcing.asInstanceOf[js.Any], AllowModifyingCheckedInObject = AllowModifyingCheckedInObject.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), FailIfNotLatestCheckedInVersion = FailIfNotLatestCheckedInVersion.asInstanceOf[js.Any], FullSet = FullSet.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], PropertyValuesToRemove = PropertyValuesToRemove.asInstanceOf[js.Any], PropertyValuesToSet = PropertyValuesToSet.asInstanceOf[js.Any], SetWithPermissions = js.Any.fromFunction9(SetWithPermissions))
    __obj.asInstanceOf[ISetPropertiesParams]
  }
  @scala.inline
  implicit class ISetPropertiesParamsOps[Self <: ISetPropertiesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlListEnforcingMode(value: MFACLEnforcingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlListEnforcingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessControlListProvidedForEnforcing(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlListProvidedForEnforcing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowModifyingCheckedInObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowModifyingCheckedInObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => ISetPropertiesParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFailIfNotLatestCheckedInVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailIfNotLatestCheckedInVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjVer(value: IObjVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjVer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyValuesToRemove(value: IIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyValuesToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyValuesToSet(value: IPropertyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyValuesToSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetWithPermissions(
      value: (IObjVer, Boolean, Boolean, IPropertyValues, Boolean, IIDs, MFObjectOperationFlags, MFACLEnforcingMode, IAccessControlList) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWithPermissions")(js.Any.fromFunction9(value))
        ret
    }
  }
  
}

