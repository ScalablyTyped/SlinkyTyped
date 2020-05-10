package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTargetdefaults extends js.Object {
  var target_defaults: AnonCflags = js.native
  var variables: AnonClang = js.native
}

object AnonTargetdefaults {
  @scala.inline
  def apply(target_defaults: AnonCflags, variables: AnonClang): AnonTargetdefaults = {
    val __obj = js.Dynamic.literal(target_defaults = target_defaults.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargetdefaults]
  }
  @scala.inline
  implicit class AnonTargetdefaultsOps[Self <: AnonTargetdefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget_defaults(value: AnonCflags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: AnonClang): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

