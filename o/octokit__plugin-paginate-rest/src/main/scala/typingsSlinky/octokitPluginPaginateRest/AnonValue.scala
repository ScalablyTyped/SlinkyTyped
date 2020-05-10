package typingsSlinky.octokitPluginPaginateRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValue extends js.Object {
  var value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<any> */ js.Any = js.native
}

object AnonValue {
  @scala.inline
  def apply(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<any> */ js.Any
  ): AnonValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
  @scala.inline
  implicit class AnonValueOps[Self <: AnonValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

