package typingsSlinky.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubReport extends StObject {
  
  @JSName("Access.SubReport_typekey")
  var AccessDotSubReport_typekey: SubReport = js.native
  
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  
  val Form: typingsSlinky.activexAccess.Access.Form = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Parent: js.Any = js.native
  
  val Report: typingsSlinky.activexAccess.Access.Report = js.native
}
object SubReport {
  
  @scala.inline
  def apply(
    AccessDotSubReport_typekey: SubReport,
    Application: Application,
    Form: Form,
    IsMemberSafe: Double => Boolean,
    Parent: js.Any,
    Report: Report
  ): SubReport = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Parent = Parent.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SubReport_typekey")(AccessDotSubReport_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubReport]
  }
  
  @scala.inline
  implicit class SubReportMutableBuilder[Self <: SubReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotSubReport_typekey(value: SubReport): Self = StObject.set(x, "Access.SubReport_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForm(value: Form): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReport(value: Report): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
  }
}
