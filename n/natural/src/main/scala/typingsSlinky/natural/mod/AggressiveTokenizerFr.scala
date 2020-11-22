package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggressiveTokenizerFr extends Tokenizer
object AggressiveTokenizerFr {
  
  @scala.inline
  def apply(tokenize: String => js.Array[String]): AggressiveTokenizerFr = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[AggressiveTokenizerFr]
  }
}
