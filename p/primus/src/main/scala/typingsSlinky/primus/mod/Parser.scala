package typingsSlinky.primus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  def decoder(data: js.Any, fn: js.Function2[/* error */ js.Error, /* response */ js.Any, Unit]): Unit = js.native
  def encoder(data: js.Any, fn: js.Function2[/* error */ js.Error, /* response */ js.Any, Unit]): Unit = js.native
}

object Parser {
  @scala.inline
  def apply(
    decoder: (js.Any, js.Function2[/* error */ js.Error, /* response */ js.Any, Unit]) => Unit,
    encoder: (js.Any, js.Function2[/* error */ js.Error, /* response */ js.Any, Unit]) => Unit
  ): Parser = {
    val __obj = js.Dynamic.literal(decoder = js.Any.fromFunction2(decoder), encoder = js.Any.fromFunction2(encoder))
    __obj.asInstanceOf[Parser]
  }
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecoder(value: (js.Any, js.Function2[/* error */ js.Error, /* response */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEncoder(value: (js.Any, js.Function2[/* error */ js.Error, /* response */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoder")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

