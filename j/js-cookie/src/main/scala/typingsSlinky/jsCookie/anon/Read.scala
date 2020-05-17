package typingsSlinky.jsCookie.anon

import typingsSlinky.jsCookie.mod.CookieReadConverter
import typingsSlinky.jsCookie.mod.CookieWriteConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Read[TConv /* <: js.Object */] extends js.Object {
  var read: js.UndefOr[CookieReadConverter] = js.native
  var write: js.UndefOr[CookieWriteConverter[TConv]] = js.native
}

object Read {
  @scala.inline
  def apply[TConv](): Read[TConv] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Read[TConv]]
  }
  @scala.inline
  implicit class ReadOps[Self[tconv] <: Read[tconv], TConv] (val x: Self[TConv]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TConv] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TConv]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TConv] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TConv] with Other]
    @scala.inline
    def withRead(value: (/* value */ String, /* name */ String) => String): Self[TConv] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRead: Self[TConv] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: (/* value */ String | TConv, /* name */ String) => String): Self[TConv] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWrite: Self[TConv] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
  }
  
}

