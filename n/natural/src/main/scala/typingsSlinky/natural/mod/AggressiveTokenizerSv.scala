package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggressiveTokenizerSv extends Tokenizer
object AggressiveTokenizerSv {
  
  @scala.inline
  def apply(tokenize: String => js.Array[String]): AggressiveTokenizerSv = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[AggressiveTokenizerSv]
  }
}
