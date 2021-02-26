package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationVersionLifecycleConfig extends StObject {
  
  /**
    * Specify a max age rule to restrict the length of time that application versions are retained for an application.
    */
  var MaxAgeRule: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.MaxAgeRule] = js.native
  
  /**
    * Specify a max count rule to restrict the number of application versions that are retained for an application.
    */
  var MaxCountRule: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.MaxCountRule] = js.native
}
object ApplicationVersionLifecycleConfig {
  
  @scala.inline
  def apply(): ApplicationVersionLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionLifecycleConfig]
  }
  
  @scala.inline
  implicit class ApplicationVersionLifecycleConfigMutableBuilder[Self <: ApplicationVersionLifecycleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAgeRule(value: MaxAgeRule): Self = StObject.set(x, "MaxAgeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeRuleUndefined: Self = StObject.set(x, "MaxAgeRule", js.undefined)
    
    @scala.inline
    def setMaxCountRule(value: MaxCountRule): Self = StObject.set(x, "MaxCountRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCountRuleUndefined: Self = StObject.set(x, "MaxCountRule", js.undefined)
  }
}
