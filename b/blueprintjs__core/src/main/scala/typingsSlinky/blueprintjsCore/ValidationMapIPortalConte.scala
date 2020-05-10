package typingsSlinky.blueprintjsCore

import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined prop-types.prop-types.ValidationMap<@blueprintjs/core.@blueprintjs/core/lib/esm/components/portal/portal.IPortalContext> */
@js.native
trait ValidationMapIPortalConte extends js.Object {
  var blueprintPortalClassName: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
}

object ValidationMapIPortalConte {
  @scala.inline
  def apply(): ValidationMapIPortalConte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMapIPortalConte]
  }
  @scala.inline
  implicit class ValidationMapIPortalConteOps[Self <: ValidationMapIPortalConte] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlueprintPortalClassName(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintPortalClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueprintPortalClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintPortalClassName")(js.undefined)
        ret
    }
  }
  
}

