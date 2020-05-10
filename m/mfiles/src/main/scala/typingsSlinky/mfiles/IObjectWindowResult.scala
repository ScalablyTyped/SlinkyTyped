package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFObjectWindowResultCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectWindowResult extends js.Object {
  val AccessControlList: IAccessControlList = js.native
  val ObjVer: IObjVer = js.native
  val Properties: IPropertyValues = js.native
  val Result: MFObjectWindowResultCode = js.native
  val SelectedFileClass: IFileClass = js.native
  val UseAsDefaults: Boolean = js.native
  val Visible: Boolean = js.native
}

object IObjectWindowResult {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    ObjVer: IObjVer,
    Properties: IPropertyValues,
    Result: MFObjectWindowResultCode,
    SelectedFileClass: IFileClass,
    UseAsDefaults: Boolean,
    Visible: Boolean
  ): IObjectWindowResult = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], SelectedFileClass = SelectedFileClass.asInstanceOf[js.Any], UseAsDefaults = UseAsDefaults.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWindowResult]
  }
  @scala.inline
  implicit class IObjectWindowResultOps[Self <: IObjectWindowResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlList(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjVer(value: IObjVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjVer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IPropertyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: MFObjectWindowResultCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedFileClass(value: IFileClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedFileClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseAsDefaults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseAsDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

