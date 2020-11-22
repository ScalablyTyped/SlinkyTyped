package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrthographyTokenizer extends Tokenizer
object OrthographyTokenizer {
  
  @scala.inline
  def apply(tokenize: String => js.Array[String]): OrthographyTokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[OrthographyTokenizer]
  }
}
