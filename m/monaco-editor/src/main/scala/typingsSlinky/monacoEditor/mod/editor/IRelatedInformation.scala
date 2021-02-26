package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRelatedInformation extends StObject {
  
  var endColumn: Double = js.native
  
  var endLineNumber: Double = js.native
  
  var message: String = js.native
  
  var resource: Uri = js.native
  
  var startColumn: Double = js.native
  
  var startLineNumber: Double = js.native
}
object IRelatedInformation {
  
  @scala.inline
  def apply(
    endColumn: Double,
    endLineNumber: Double,
    message: String,
    resource: Uri,
    startColumn: Double,
    startLineNumber: Double
  ): IRelatedInformation = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLineNumber = endLineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLineNumber = startLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRelatedInformation]
  }
  
  @scala.inline
  implicit class IRelatedInformationMutableBuilder[Self <: IRelatedInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLineNumber(value: Double): Self = StObject.set(x, "endLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Uri): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLineNumber(value: Double): Self = StObject.set(x, "startLineNumber", value.asInstanceOf[js.Any])
  }
}
