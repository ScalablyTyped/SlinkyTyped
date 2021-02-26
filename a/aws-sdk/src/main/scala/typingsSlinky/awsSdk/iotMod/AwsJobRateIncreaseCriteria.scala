package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsJobRateIncreaseCriteria extends StObject {
  
  /**
    * When this number of things have been notified, it will initiate an increase in the rollout rate.
    */
  var numberOfNotifiedThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.native
  
  /**
    * When this number of things have succeeded in their job execution, it will initiate an increase in the rollout rate.
    */
  var numberOfSucceededThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.native
}
object AwsJobRateIncreaseCriteria {
  
  @scala.inline
  def apply(): AwsJobRateIncreaseCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobRateIncreaseCriteria]
  }
  
  @scala.inline
  implicit class AwsJobRateIncreaseCriteriaMutableBuilder[Self <: AwsJobRateIncreaseCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfNotifiedThings(value: AwsJobRateIncreaseCriteriaNumberOfThings): Self = StObject.set(x, "numberOfNotifiedThings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNotifiedThingsUndefined: Self = StObject.set(x, "numberOfNotifiedThings", js.undefined)
    
    @scala.inline
    def setNumberOfSucceededThings(value: AwsJobRateIncreaseCriteriaNumberOfThings): Self = StObject.set(x, "numberOfSucceededThings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfSucceededThingsUndefined: Self = StObject.set(x, "numberOfSucceededThings", js.undefined)
  }
}
