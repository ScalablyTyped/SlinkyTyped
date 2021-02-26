package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SsmControls extends StObject {
  
  /**
    * The maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources for that specific rule. You can specify a percentage, such as 10%. The default value is 10. 
    */
  var ConcurrentExecutionRatePercentage: js.UndefOr[Percentage] = js.native
  
  /**
    * The percentage of errors that are allowed before SSM stops running automations on non-compliant resources for that specific rule. You can specify a percentage of errors, for example 10%. If you do not specifiy a percentage, the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant resources, then SSM stops running the automations when the fifth error is received. 
    */
  var ErrorPercentage: js.UndefOr[Percentage] = js.native
}
object SsmControls {
  
  @scala.inline
  def apply(): SsmControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmControls]
  }
  
  @scala.inline
  implicit class SsmControlsMutableBuilder[Self <: SsmControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcurrentExecutionRatePercentage(value: Percentage): Self = StObject.set(x, "ConcurrentExecutionRatePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentExecutionRatePercentageUndefined: Self = StObject.set(x, "ConcurrentExecutionRatePercentage", js.undefined)
    
    @scala.inline
    def setErrorPercentage(value: Percentage): Self = StObject.set(x, "ErrorPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorPercentageUndefined: Self = StObject.set(x, "ErrorPercentage", js.undefined)
  }
}
