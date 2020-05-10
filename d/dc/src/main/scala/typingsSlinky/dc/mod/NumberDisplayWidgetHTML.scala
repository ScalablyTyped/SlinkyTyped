package typingsSlinky.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberDisplayWidgetHTML extends js.Object {
  var none: String = js.native
  var one: String = js.native
  var some: String = js.native
}

object NumberDisplayWidgetHTML {
  @scala.inline
  def apply(none: String, one: String, some: String): NumberDisplayWidgetHTML = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberDisplayWidgetHTML]
  }
  @scala.inline
  implicit class NumberDisplayWidgetHTMLOps[Self <: NumberDisplayWidgetHTML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOne(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("some")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

