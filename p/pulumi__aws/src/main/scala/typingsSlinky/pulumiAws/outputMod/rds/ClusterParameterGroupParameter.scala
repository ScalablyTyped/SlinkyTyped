package typingsSlinky.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroupParameter extends js.Object {
  /**
    * "immediate" (default), or "pending-reboot". Some
    * engines can't apply some parameters without a reboot, and you will need to
    * specify "pending-reboot" here.
    */
  var applyMethod: js.UndefOr[String] = js.native
  /**
    * The name of the DB parameter.
    */
  var name: String = js.native
  /**
    * The value of the DB parameter.
    */
  var value: String = js.native
}

object ClusterParameterGroupParameter {
  @scala.inline
  def apply(name: String, value: String): ClusterParameterGroupParameter = {
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

