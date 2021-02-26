package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFEmailImportance
import typingsSlinky.mfiles.MFiles.MFEmailSensitivity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEmailMessageInformation extends StObject {
  
  var Cc: IStrings = js.native
  
  def Clone(): IEmailMessageInformation = js.native
  
  def CloneFrom(EmailMessageInformation: IEmailMessageInformation): Unit = js.native
  
  var From: String = js.native
  
  var Importance: MFEmailImportance = js.native
  
  var InReplyTo: String = js.native
  
  var MessageID: String = js.native
  
  var Received: ITimestamp = js.native
  
  var Sensitivity: MFEmailSensitivity = js.native
  
  var Sent: ITimestamp = js.native
  
  var Subject: String = js.native
  
  var To: IStrings = js.native
}
object IEmailMessageInformation {
  
  @scala.inline
  def apply(
    Cc: IStrings,
    Clone: () => IEmailMessageInformation,
    CloneFrom: IEmailMessageInformation => Unit,
    From: String,
    Importance: MFEmailImportance,
    InReplyTo: String,
    MessageID: String,
    Received: ITimestamp,
    Sensitivity: MFEmailSensitivity,
    Sent: ITimestamp,
    Subject: String,
    To: IStrings
  ): IEmailMessageInformation = {
    val __obj = js.Dynamic.literal(Cc = Cc.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), From = From.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], InReplyTo = InReplyTo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], Sensitivity = Sensitivity.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEmailMessageInformation]
  }
  
  @scala.inline
  implicit class IEmailMessageInformationMutableBuilder[Self <: IEmailMessageInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCc(value: IStrings): Self = StObject.set(x, "Cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IEmailMessageInformation): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IEmailMessageInformation => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportance(value: MFEmailImportance): Self = StObject.set(x, "Importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInReplyTo(value: String): Self = StObject.set(x, "InReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceived(value: ITimestamp): Self = StObject.set(x, "Received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivity(value: MFEmailSensitivity): Self = StObject.set(x, "Sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSent(value: ITimestamp): Self = StObject.set(x, "Sent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: IStrings): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
