package typingsSlinky.pulumiKubernetes.outputMod.policy.v1beta1

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.SELinuxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
  */
@js.native
trait SELinuxStrategyOptions extends StObject {
  
  /**
    * rule is the strategy that will dictate the allowable labels that may be set.
    */
  var rule: String = js.native
  
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var seLinuxOptions: SELinuxOptions = js.native
}
object SELinuxStrategyOptions {
  
  @scala.inline
  def apply(rule: String, seLinuxOptions: SELinuxOptions): SELinuxStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], seLinuxOptions = seLinuxOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxStrategyOptions]
  }
  
  @scala.inline
  implicit class SELinuxStrategyOptionsMutableBuilder[Self <: SELinuxStrategyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeLinuxOptions(value: SELinuxOptions): Self = StObject.set(x, "seLinuxOptions", value.asInstanceOf[js.Any])
  }
}
