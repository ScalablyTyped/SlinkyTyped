package typingsSlinky.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveResult extends StObject {
  
  var fileProperties: js.Array[FileProperties] = js.native
  
  var id: String = js.native
  
  var messages: js.Array[RetrieveMessage] = js.native
  
  var zipFile: String = js.native
}
object RetrieveResult {
  
  @scala.inline
  def apply(
    fileProperties: js.Array[FileProperties],
    id: String,
    messages: js.Array[RetrieveMessage],
    zipFile: String
  ): RetrieveResult = {
    val __obj = js.Dynamic.literal(fileProperties = fileProperties.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], zipFile = zipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveResult]
  }
  
  @scala.inline
  implicit class RetrieveResultMutableBuilder[Self <: RetrieveResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileProperties(value: js.Array[FileProperties]): Self = StObject.set(x, "fileProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePropertiesVarargs(value: FileProperties*): Self = StObject.set(x, "fileProperties", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: js.Array[RetrieveMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: RetrieveMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setZipFile(value: String): Self = StObject.set(x, "zipFile", value.asInstanceOf[js.Any])
  }
}
