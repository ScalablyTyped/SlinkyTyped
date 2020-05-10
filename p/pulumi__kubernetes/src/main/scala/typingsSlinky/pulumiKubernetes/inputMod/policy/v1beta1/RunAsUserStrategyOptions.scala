package typingsSlinky.pulumiKubernetes.inputMod.policy.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RunAsUserStrategyOptions defines the strategy type and any options used to create the
  * strategy.
  */
@js.native
trait RunAsUserStrategyOptions extends js.Object {
  /**
    * ranges are the allowed ranges of uids that may be used. If you would like to force a single
    * uid then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.UndefOr[Input[js.Array[Input[IDRange]]]] = js.native
  /**
    * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var rule: Input[String] = js.native
}

object RunAsUserStrategyOptions {
  @scala.inline
  def apply(rule: Input[String]): RunAsUserStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunAsUserStrategyOptions]
  }
  @scala.inline
  implicit class RunAsUserStrategyOptionsOps[Self <: RunAsUserStrategyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

