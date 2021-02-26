package typingsSlinky.activexExcel.Excel

import typingsSlinky.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Macintosh only */
@js.native
trait Mailer extends StObject {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  var BCCRecipients: js.Any = js.native
  
  var CCRecipients: js.Any = js.native
  
  val Creator: XlCreator = js.native
  
  var Enclosures: js.Any = js.native
  
  @JSName("Excel.Mailer_typekey")
  var ExcelDotMailer_typekey: Mailer = js.native
  
  val Parent: js.Any = js.native
  
  val Received: Boolean = js.native
  
  val SendDateTime: VarDate = js.native
  
  val Sender: String = js.native
  
  var Subject: String = js.native
  
  var ToRecipients: js.Any = js.native
  
  var WhichAddress: js.Any = js.native
}
object Mailer {
  
  @scala.inline
  def apply(
    Application: Application,
    BCCRecipients: js.Any,
    CCRecipients: js.Any,
    Creator: XlCreator,
    Enclosures: js.Any,
    ExcelDotMailer_typekey: Mailer,
    Parent: js.Any,
    Received: Boolean,
    SendDateTime: VarDate,
    Sender: String,
    Subject: String,
    ToRecipients: js.Any,
    WhichAddress: js.Any
  ): Mailer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BCCRecipients = BCCRecipients.asInstanceOf[js.Any], CCRecipients = CCRecipients.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enclosures = Enclosures.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], SendDateTime = SendDateTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], ToRecipients = ToRecipients.asInstanceOf[js.Any], WhichAddress = WhichAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Mailer_typekey")(ExcelDotMailer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mailer]
  }
  
  @scala.inline
  implicit class MailerMutableBuilder[Self <: Mailer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBCCRecipients(value: js.Any): Self = StObject.set(x, "BCCRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCCRecipients(value: js.Any): Self = StObject.set(x, "CCRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnclosures(value: js.Any): Self = StObject.set(x, "Enclosures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotMailer_typekey(value: Mailer): Self = StObject.set(x, "Excel.Mailer_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceived(value: Boolean): Self = StObject.set(x, "Received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendDateTime(value: VarDate): Self = StObject.set(x, "SendDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: String): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToRecipients(value: js.Any): Self = StObject.set(x, "ToRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhichAddress(value: js.Any): Self = StObject.set(x, "WhichAddress", value.asInstanceOf[js.Any])
  }
}
