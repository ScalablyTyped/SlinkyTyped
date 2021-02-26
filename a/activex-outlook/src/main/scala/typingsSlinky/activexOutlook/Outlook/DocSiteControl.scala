package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocSiteControl extends StObject {
  
  @JSName("Outlook._DocSiteControl_typekey")
  var OutlookDot_DocSiteControl_typekey: DocSiteControl = js.native
  
  var ReadOnly: Double = js.native
  
  var SuppressAttachments: Double = js.native
}
object DocSiteControl {
  
  @scala.inline
  def apply(OutlookDot_DocSiteControl_typekey: DocSiteControl, ReadOnly: Double, SuppressAttachments: Double): DocSiteControl = {
    val __obj = js.Dynamic.literal(ReadOnly = ReadOnly.asInstanceOf[js.Any], SuppressAttachments = SuppressAttachments.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook._DocSiteControl_typekey")(OutlookDot_DocSiteControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocSiteControl]
  }
  
  @scala.inline
  implicit class DocSiteControlMutableBuilder[Self <: DocSiteControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutlookDot_DocSiteControl_typekey(value: DocSiteControl): Self = StObject.set(x, "Outlook._DocSiteControl_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Double): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressAttachments(value: Double): Self = StObject.set(x, "SuppressAttachments", value.asInstanceOf[js.Any])
  }
}
