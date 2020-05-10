package typingsSlinky.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenizerBuilder[T] extends js.Object {
  def build(callback: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit]): Unit = js.native
}

object TokenizerBuilder {
  @scala.inline
  def apply[T](build: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): TokenizerBuilder[T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
    __obj.asInstanceOf[TokenizerBuilder[T]]
  }
  @scala.inline
  implicit class TokenizerBuilderOps[Self[t] <: TokenizerBuilder[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBuild(value: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

