package typingsSlinky.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenizerBuilder[T] extends StObject {
  
  def build(callback: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit]): Unit = js.native
}
object TokenizerBuilder {
  
  @scala.inline
  def apply[T](build: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): TokenizerBuilder[T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
    __obj.asInstanceOf[TokenizerBuilder[T]]
  }
  
  @scala.inline
  implicit class TokenizerBuilderMutableBuilder[Self <: TokenizerBuilder[_], T] (val x: Self with TokenizerBuilder[T]) extends AnyVal {
    
    @scala.inline
    def setBuild(value: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
  }
}
