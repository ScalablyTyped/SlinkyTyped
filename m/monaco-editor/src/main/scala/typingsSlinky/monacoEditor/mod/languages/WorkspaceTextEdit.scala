package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceTextEdit extends StObject {
  
  var edit: TextEdit = js.native
  
  var metadata: js.UndefOr[WorkspaceEditMetadata] = js.native
  
  var modelVersionId: js.UndefOr[Double] = js.native
  
  var resource: Uri = js.native
}
object WorkspaceTextEdit {
  
  @scala.inline
  def apply(edit: TextEdit, resource: Uri): WorkspaceTextEdit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceTextEdit]
  }
  
  @scala.inline
  implicit class WorkspaceTextEditMutableBuilder[Self <: WorkspaceTextEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdit(value: TextEdit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: WorkspaceEditMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setModelVersionId(value: Double): Self = StObject.set(x, "modelVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionIdUndefined: Self = StObject.set(x, "modelVersionId", js.undefined)
    
    @scala.inline
    def setResource(value: Uri): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
