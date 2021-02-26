package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiKubernetes.inputMod.core.v1.SELinuxOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy. Deprecated: use SELinuxStrategyOptions from policy API Group instead.
  */
@js.native
trait SELinuxStrategyOptions extends StObject {
  
  /**
    * rule is the strategy that will dictate the allowable labels that may be set.
    */
  var rule: Input[String] = js.native
  
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
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
  implicit class SELinuxStrategyOptionsMutableBuilder[Self <: SELinuxStrategyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeLinuxOptions(value: Input[SELinuxOptions]): Self = StObject.set(x, "seLinuxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeLinuxOptionsUndefined: Self = StObject.set(x, "seLinuxOptions", js.undefined)
  }
}
