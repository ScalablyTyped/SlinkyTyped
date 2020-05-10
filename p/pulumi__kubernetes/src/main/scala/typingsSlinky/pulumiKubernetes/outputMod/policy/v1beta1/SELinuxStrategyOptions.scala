package typingsSlinky.pulumiKubernetes.outputMod.policy.v1beta1

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.SELinuxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
  */
@js.native
trait SELinuxStrategyOptions extends js.Object {
  /**
    * rule is the strategy that will dictate the allowable labels that may be set.
    */
  val rule: String = js.native
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  val seLinuxOptions: SELinuxOptions = js.native
}

object SELinuxStrategyOptions {
  @scala.inline
  def apply(rule: String, seLinuxOptions: SELinuxOptions): SELinuxStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], seLinuxOptions = seLinuxOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxStrategyOptions]
  }
  @scala.inline
  implicit class SELinuxStrategyOptionsOps[Self <: SELinuxStrategyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeLinuxOptions(value: SELinuxOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seLinuxOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

