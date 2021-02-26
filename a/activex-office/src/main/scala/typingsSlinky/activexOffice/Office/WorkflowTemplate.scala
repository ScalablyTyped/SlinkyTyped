package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTemplate extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val Description: String = js.native
  
  val DocumentLibraryName: String = js.native
  
  val DocumentLibraryURL: String = js.native
  
  val Id: String = js.native
  
  val Name: String = js.native
  
  @JSName("Office.WorkflowTemplate_typekey")
  var OfficeDotWorkflowTemplate_typekey: WorkflowTemplate = js.native
  
  def Show(): Double = js.native
}
object WorkflowTemplate {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Description: String,
    DocumentLibraryName: String,
    DocumentLibraryURL: String,
    Id: String,
    Name: String,
    OfficeDotWorkflowTemplate_typekey: WorkflowTemplate,
    Show: () => Double
  ): WorkflowTemplate = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DocumentLibraryName = DocumentLibraryName.asInstanceOf[js.Any], DocumentLibraryURL = DocumentLibraryURL.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Show = js.Any.fromFunction0(Show))
    __obj.updateDynamic("Office.WorkflowTemplate_typekey")(OfficeDotWorkflowTemplate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTemplate]
  }
  
  @scala.inline
  implicit class WorkflowTemplateMutableBuilder[Self <: WorkflowTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentLibraryName(value: String): Self = StObject.set(x, "DocumentLibraryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentLibraryURL(value: String): Self = StObject.set(x, "DocumentLibraryURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotWorkflowTemplate_typekey(value: WorkflowTemplate): Self = StObject.set(x, "Office.WorkflowTemplate_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Double): Self = StObject.set(x, "Show", js.Any.fromFunction0(value))
  }
}
