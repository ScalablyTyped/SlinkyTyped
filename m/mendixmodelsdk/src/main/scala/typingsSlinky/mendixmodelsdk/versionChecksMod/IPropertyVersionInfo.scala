package typingsSlinky.mendixmodelsdk.versionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyVersionInfo extends ILifeCycle {
  var public: js.UndefOr[IModifierValueHistory] = js.native
  var required: js.UndefOr[IModifierValueHistory] = js.native
}

object IPropertyVersionInfo {
  @scala.inline
  def apply(): IPropertyVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPropertyVersionInfo]
  }
  @scala.inline
  implicit class IPropertyVersionInfoOps[Self <: IPropertyVersionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublic(value: IModifierValueHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: IModifierValueHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

