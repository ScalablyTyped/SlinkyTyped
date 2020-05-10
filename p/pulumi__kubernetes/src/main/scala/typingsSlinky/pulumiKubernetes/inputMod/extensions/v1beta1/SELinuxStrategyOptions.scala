package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiKubernetes.inputMod.core.v1.SELinuxOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
  * Deprecated: use SELinuxStrategyOptions from policy API Group instead.
  */
@js.native
trait SELinuxStrategyOptions extends js.Object {
  /**
    * rule is the strategy that will dictate the allowable labels that may be set.
    */
  var rule: Input[String] = js.native
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptions]] = js.native
}

object SELinuxStrategyOptions {
  @scala.inline
  def apply(rule: Input[String]): SELinuxStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxStrategyOptions]
  }
  @scala.inline
  implicit class SELinuxStrategyOptionsOps[Self <: SELinuxStrategyOptions] (val x: Self) extends AnyVal {
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
    def withSeLinuxOptions(value: Input[SELinuxOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seLinuxOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeLinuxOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seLinuxOptions")(js.undefined)
        ret
    }
  }
  
}

