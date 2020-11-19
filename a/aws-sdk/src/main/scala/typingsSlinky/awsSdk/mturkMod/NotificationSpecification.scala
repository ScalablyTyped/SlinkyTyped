package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationSpecification extends js.Object {
  
  /**
    *  The target for notification messages. The Destination’s format is determined by the specified Transport:    When Transport is Email, the Destination is your email address.   When Transport is SQS, the Destination is your queue URL.   When Transport is SNS, the Destination is the ARN of your topic.  
    */
  var Destination: String = js.native
  
  /**
    *  The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted | AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved | HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid for the SendTestEventNotification operation. 
    */
  var EventTypes: EventTypeList = js.native
  
  /**
    *  The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS. 
    */
  var Transport: NotificationTransport = js.native
  
  /**
    * The version of the Notification API to use. Valid value is 2006-05-05.
    */
  var Version: String = js.native
}
object NotificationSpecification {
  
  @scala.inline
  def apply(Destination: String, EventTypes: EventTypeList, Transport: NotificationTransport, Version: String): NotificationSpecification = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], EventTypes = EventTypes.asInstanceOf[js.Any], Transport = Transport.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSpecification]
  }
  
  @scala.inline
  implicit class NotificationSpecificationOps[Self <: NotificationSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestination(value: String): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypesVarargs(value: EventType*): Self = this.set("EventTypes", js.Array(value :_*))
    
    @scala.inline
    def setEventTypes(value: EventTypeList): Self = this.set("EventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: NotificationTransport): Self = this.set("Transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
}
