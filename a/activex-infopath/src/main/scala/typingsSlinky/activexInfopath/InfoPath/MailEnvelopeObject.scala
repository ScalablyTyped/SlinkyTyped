package typingsSlinky.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailEnvelopeObject extends StObject {
  
  var BCC: String = js.native
  
  var CC: String = js.native
  
  @JSName("InfoPath.MailEnvelopeObject_typekey")
  var InfoPathDotMailEnvelopeObject_typekey: MailEnvelopeObject = js.native
  
  var Subject: String = js.native
  
  var To: String = js.native
  
  var Visible: Boolean = js.native
}
object MailEnvelopeObject {
  
  @scala.inline
  def apply(
    BCC: String,
    CC: String,
    InfoPathDotMailEnvelopeObject_typekey: MailEnvelopeObject,
    Subject: String,
    To: String,
    Visible: Boolean
  ): MailEnvelopeObject = {
    val __obj = js.Dynamic.literal(BCC = BCC.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.MailEnvelopeObject_typekey")(InfoPathDotMailEnvelopeObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailEnvelopeObject]
  }
  
  @scala.inline
  implicit class MailEnvelopeObjectMutableBuilder[Self <: MailEnvelopeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBCC(value: String): Self = StObject.set(x, "BCC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCC(value: String): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotMailEnvelopeObject_typekey(value: MailEnvelopeObject): Self = StObject.set(x, "InfoPath.MailEnvelopeObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
