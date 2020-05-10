package typingsSlinky.pulumiKubernetes.inputMod.policy.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the
  * strategy.
  */
@js.native
trait SupplementalGroupsStrategyOptions extends js.Object {
  /**
    * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
    * supplemental group then supply a single range with the same start and end. Required for
    * MustRunAs.
    */
  var ranges: js.UndefOr[Input[js.Array[Input[IDRange]]]] = js.native
  /**
    * rule is the strategy that will dictate what supplemental groups is used in the
    * SecurityContext.
    */
  var rule: js.UndefOr[Input[String]] = js.native
}

object SupplementalGroupsStrategyOptions {
  @scala.inline
  def apply(): SupplementalGroupsStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplementalGroupsStrategyOptions]
  }
  @scala.inline
  implicit class SupplementalGroupsStrategyOptionsOps[Self <: SupplementalGroupsStrategyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRanges(value: Input[js.Array[Input[IDRange]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
  }
  
}

