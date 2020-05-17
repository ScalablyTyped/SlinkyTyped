package typingsSlinky.json5.anon

import typingsSlinky.json5.mod.JSONReplacer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quote extends js.Object {
  var quote: js.UndefOr[String] = js.native
  var replacer: js.UndefOr[JSONReplacer] = js.native
  var space: js.UndefOr[Double | String] = js.native
}

object Quote {
  @scala.inline
  def apply(): Quote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quote]
  }
  @scala.inline
  implicit class QuoteOps[Self <: Quote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any | (js.Array[Double | String]) | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
  }
  
}

