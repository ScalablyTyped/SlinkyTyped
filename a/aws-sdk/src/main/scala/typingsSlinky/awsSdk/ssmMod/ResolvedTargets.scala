package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedTargets extends js.Object {
  /**
    * A list of parameter values sent to targets that resolved during the Automation execution.
    */
  var ParameterValues: js.UndefOr[TargetParameterList] = js.native
  /**
    * A boolean value indicating whether the resolved target list is truncated.
    */
  var Truncated: js.UndefOr[Boolean] = js.native
}

object ResolvedTargets {
  @scala.inline
  def apply(): ResolvedTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedTargets]
  }
  @scala.inline
  implicit class ResolvedTargetsOps[Self <: ResolvedTargets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterValues(value: TargetParameterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterValues")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Truncated")(js.undefined)
        ret
    }
  }
  
}

