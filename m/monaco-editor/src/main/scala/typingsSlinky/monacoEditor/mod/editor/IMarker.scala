package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.anon.Target
import typingsSlinky.monacoEditor.mod.MarkerSeverity
import typingsSlinky.monacoEditor.mod.MarkerTag
import typingsSlinky.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMarker extends StObject {
  
  var code: js.UndefOr[String | Target] = js.native
  
  var endColumn: Double = js.native
  
  var endLineNumber: Double = js.native
  
  var message: String = js.native
  
  var owner: String = js.native
  
  var relatedInformation: js.UndefOr[js.Array[IRelatedInformation]] = js.native
  
  var resource: Uri = js.native
  
  var severity: MarkerSeverity = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var startColumn: Double = js.native
  
  var startLineNumber: Double = js.native
  
  var tags: js.UndefOr[js.Array[MarkerTag]] = js.native
}
object IMarker {
  
  @scala.inline
  def apply(
    endColumn: Double,
    endLineNumber: Double,
    message: String,
    owner: String,
    resource: Uri,
    severity: MarkerSeverity,
    startColumn: Double,
    startLineNumber: Double
  ): IMarker = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLineNumber = endLineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLineNumber = startLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarker]
  }
  
  @scala.inline
  implicit class IMarkerMutableBuilder[Self <: IMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String | Target): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLineNumber(value: Double): Self = StObject.set(x, "endLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedInformation(value: js.Array[IRelatedInformation]): Self = StObject.set(x, "relatedInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedInformationUndefined: Self = StObject.set(x, "relatedInformation", js.undefined)
    
    @scala.inline
    def setRelatedInformationVarargs(value: IRelatedInformation*): Self = StObject.set(x, "relatedInformation", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: Uri): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: MarkerSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLineNumber(value: Double): Self = StObject.set(x, "startLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[MarkerTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: MarkerTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
