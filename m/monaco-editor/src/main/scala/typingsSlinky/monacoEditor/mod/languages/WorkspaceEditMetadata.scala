package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.anon.Dark
import typingsSlinky.monacoEditor.anon.Id
import typingsSlinky.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceEditMetadata extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var iconPath: js.UndefOr[Id | Uri | Dark] = js.native
  
  var label: String = js.native
  
  var needsConfirmation: Boolean = js.native
}
object WorkspaceEditMetadata {
  
  @scala.inline
  def apply(label: String, needsConfirmation: Boolean): WorkspaceEditMetadata = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], needsConfirmation = needsConfirmation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEditMetadata]
  }
  
  @scala.inline
  implicit class WorkspaceEditMetadataMutableBuilder[Self <: WorkspaceEditMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIconPath(value: Id | Uri | Dark): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsConfirmation(value: Boolean): Self = StObject.set(x, "needsConfirmation", value.asInstanceOf[js.Any])
  }
}
