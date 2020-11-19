package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreebankWordTokenizer extends Tokenizer
object TreebankWordTokenizer {
  
  @scala.inline
  def apply(tokenize: String => js.Array[String]): TreebankWordTokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[TreebankWordTokenizer]
  }
}
