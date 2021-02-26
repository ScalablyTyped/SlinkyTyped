package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprecateActivityTypeInput extends StObject {
  
  /**
    * The activity type to deprecate.
    */
  var activityType: ActivityType = js.native
  
  /**
    * The name of the domain in which the activity type is registered.
    */
  var domain: DomainName = js.native
}
object DeprecateActivityTypeInput {
  
  @scala.inline
  def apply(activityType: ActivityType, domain: DomainName): DeprecateActivityTypeInput = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateActivityTypeInput]
  }
  
  @scala.inline
  implicit class DeprecateActivityTypeInputMutableBuilder[Self <: DeprecateActivityTypeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
