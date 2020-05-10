package typingsSlinky.pulumiKubernetes.outputMod.policy.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RunAsGroupStrategyOptions defines the strategy type and any options used to create the
  * strategy.
  */
@js.native
trait RunAsGroupStrategyOptions extends js.Object {
  /**
    * ranges are the allowed ranges of gids that may be used. If you would like to force a single
    * gid then supply a single range with the same start and end. Required for MustRunAs.
    */
  val ranges: js.Array[IDRange] = js.native
  /**
    * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
    */
  val rule: String = js.native
}

object RunAsGroupStrategyOptions {
  @scala.inline
  def apply(ranges: js.Array[IDRange], rule: String): RunAsGroupStrategyOptions = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunAsGroupStrategyOptions]
  }
  @scala.inline
  implicit class RunAsGroupStrategyOptionsOps[Self <: RunAsGroupStrategyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRanges(value: js.Array[IDRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

