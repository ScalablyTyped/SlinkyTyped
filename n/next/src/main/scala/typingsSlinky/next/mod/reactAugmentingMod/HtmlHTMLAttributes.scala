package typingsSlinky.next.mod.reactAugmentingMod

import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// <html amp=""> support
@js.native
trait HtmlHTMLAttributes[T] extends HTMLAttributes[T] {
  var amp: js.UndefOr[String] = js.native
}

object HtmlHTMLAttributes {
  @scala.inline
  def apply[T](): HtmlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlHTMLAttributes[T]]
  }
  @scala.inline
  implicit class HtmlHTMLAttributesOps[Self[t] <: HtmlHTMLAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAmp(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmp: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amp")(js.undefined)
        ret
    }
  }
  
}

