package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventFeedbackType extends StObject {
  
  /**
    * The event feedback date.
    */
  var FeedbackDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The event feedback value.
    */
  var FeedbackValue: FeedbackValueType = js.native
  
  /**
    * The provider.
    */
  var Provider: StringType = js.native
}
object EventFeedbackType {
  
  @scala.inline
  def apply(FeedbackValue: FeedbackValueType, Provider: StringType): EventFeedbackType = {
    val __obj = js.Dynamic.literal(FeedbackValue = FeedbackValue.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFeedbackType]
  }
  
  @scala.inline
  implicit class EventFeedbackTypeMutableBuilder[Self <: EventFeedbackType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedbackDate(value: js.Date): Self = StObject.set(x, "FeedbackDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackDateUndefined: Self = StObject.set(x, "FeedbackDate", js.undefined)
    
    @scala.inline
    def setFeedbackValue(value: FeedbackValueType): Self = StObject.set(x, "FeedbackValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: StringType): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
  }
}
