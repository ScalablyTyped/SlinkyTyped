package typingsSlinky.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends StObject {
  
  var Content: String = js.native
  
  val ContentControl: typingsSlinky.activexWord.Word.ContentControl = js.native
}
object Content {
  
  @scala.inline
  def apply(Content: String, ContentControl: typingsSlinky.activexWord.Word.ContentControl): Content = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentControl(value: typingsSlinky.activexWord.Word.ContentControl): Self = StObject.set(x, "ContentControl", value.asInstanceOf[js.Any])
  }
}
