package typingsSlinky.pulumiAws.outputMod.neptune

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroupParameter extends js.Object {
  /**
    * The apply method of the Neptune parameter. Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
    */
  var applyMethod: js.UndefOr[String] = js.native
  /**
    * The name of the Neptune parameter.
    */
  var name: String = js.native
  /**
    * The value of the Neptune parameter.
    */
  var value: String = js.native
}

object ParameterGroupParameter {
  @scala.inline
  def apply(name: String, value: String): ParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupParameter]
  }
  @scala.inline
  implicit class ParameterGroupParameterOps[Self <: ParameterGroupParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMethod")(js.undefined)
        ret
    }
  }
  
}

