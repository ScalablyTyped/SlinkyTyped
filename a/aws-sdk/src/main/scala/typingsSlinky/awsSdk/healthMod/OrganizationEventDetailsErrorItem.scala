package typingsSlinky.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationEventDetailsErrorItem extends StObject {
  
  /**
    * Error information returned when a DescribeEventDetailsForOrganization operation cannot find a specified event.
    */
  var awsAccountId: js.UndefOr[accountId] = js.native
  
  /**
    * A message that describes the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * The name of the error.
    */
  var errorName: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typingsSlinky.awsSdk.healthMod.eventArn] = js.native
}
object OrganizationEventDetailsErrorItem {
  
  @scala.inline
  def apply(): OrganizationEventDetailsErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEventDetailsErrorItem]
  }
  
  @scala.inline
  implicit class OrganizationEventDetailsErrorItemMutableBuilder[Self <: OrganizationEventDetailsErrorItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: accountId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setErrorName(value: String): Self = StObject.set(x, "errorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNameUndefined: Self = StObject.set(x, "errorName", js.undefined)
    
    @scala.inline
    def setEventArn(value: eventArn): Self = StObject.set(x, "eventArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventArnUndefined: Self = StObject.set(x, "eventArn", js.undefined)
  }
}
