package typingsSlinky.pulumiAws.inputMod.docdb

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroupParameter extends js.Object {
  /**
    * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
    */
  var applyMethod: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the documentDB parameter.
    */
  var name: Input[String] = js.native
  /**
    * The value of the documentDB parameter.
    */
  var value: Input[String] = js.native
}

object ClusterParameterGroupParameter {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): ClusterParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroupParameter]
  }
  @scala.inline
  implicit class ClusterParameterGroupParameterOps[Self <: ClusterParameterGroupParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyMethod(value: Input[String]): Self = {
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

