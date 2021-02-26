package typingsSlinky.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Words extends StObject {
  
  var words: String = js.native
}
object Words {
  
  @scala.inline
  def apply(words: String): Words = {
    val __obj = js.Dynamic.literal(words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Words]
  }
  
  @scala.inline
  implicit class WordsMutableBuilder[Self <: Words] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWords(value: String): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
  }
}
