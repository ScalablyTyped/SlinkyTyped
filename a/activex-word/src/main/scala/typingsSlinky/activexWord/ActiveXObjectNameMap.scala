package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Application
import typingsSlinky.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
  @JSName("Word.Application")
  var WordDotApplication: Application = js.native
  
  @JSName("Word.Document")
  var WordDotDocument: Document = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(WordDotApplication: Application, WordDotDocument: Document): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Word.Application")(WordDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Document")(WordDotDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWordDotApplication(value: Application): Self = StObject.set(x, "Word.Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotDocument(value: Document): Self = StObject.set(x, "Word.Document", value.asInstanceOf[js.Any])
  }
}
