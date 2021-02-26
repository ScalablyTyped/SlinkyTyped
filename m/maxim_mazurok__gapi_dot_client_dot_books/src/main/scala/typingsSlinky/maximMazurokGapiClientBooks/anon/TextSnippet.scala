package typingsSlinky.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSnippet extends StObject {
  
  /** A text snippet containing the search query. */
  var textSnippet: js.UndefOr[String] = js.native
}
object TextSnippet {
  
  @scala.inline
  def apply(): TextSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSnippet]
  }
  
  @scala.inline
  implicit class TextSnippetMutableBuilder[Self <: TextSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextSnippet(value: String): Self = StObject.set(x, "textSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSnippetUndefined: Self = StObject.set(x, "textSnippet", js.undefined)
  }
}
