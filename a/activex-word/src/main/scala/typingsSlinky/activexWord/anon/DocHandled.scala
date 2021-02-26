package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocHandled extends StObject {
  
  val Doc: Document = js.native
  
  var Handled: Boolean = js.native
}
object DocHandled {
  
  @scala.inline
  def apply(Doc: Document, Handled: Boolean): DocHandled = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocHandled]
  }
  
  @scala.inline
  implicit class DocHandledMutableBuilder[Self <: DocHandled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "Handled", value.asInstanceOf[js.Any])
  }
}
