package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentInspector extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val Description: String = js.native
  
  def Fix(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
  
  def Inspect(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
  
  val Name: String = js.native
  
  @JSName("Office.DocumentInspector_typekey")
  var OfficeDotDocumentInspector_typekey: DocumentInspector = js.native
  
  val Parent: js.Any = js.native
}
object DocumentInspector {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Description: String,
    Fix: (MsoDocInspectorStatus, String) => Unit,
    Inspect: (MsoDocInspectorStatus, String) => Unit,
    Name: String,
    OfficeDotDocumentInspector_typekey: DocumentInspector,
    Parent: js.Any
  ): DocumentInspector = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Fix = js.Any.fromFunction2(Fix), Inspect = js.Any.fromFunction2(Inspect), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.DocumentInspector_typekey")(OfficeDotDocumentInspector_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInspector]
  }
  
  @scala.inline
  implicit class DocumentInspectorMutableBuilder[Self <: DocumentInspector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFix(value: (MsoDocInspectorStatus, String) => Unit): Self = StObject.set(x, "Fix", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInspect(value: (MsoDocInspectorStatus, String) => Unit): Self = StObject.set(x, "Inspect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotDocumentInspector_typekey(value: DocumentInspector): Self = StObject.set(x, "Office.DocumentInspector_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
