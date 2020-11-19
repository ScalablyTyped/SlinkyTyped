package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexpTokenizer extends Tokenizer
object RegexpTokenizer {
  
  @scala.inline
  def apply(tokenize: String => js.Array[String]): RegexpTokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[RegexpTokenizer]
  }
}
