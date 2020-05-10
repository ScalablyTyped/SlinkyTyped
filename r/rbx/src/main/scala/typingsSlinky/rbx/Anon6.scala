package typingsSlinky.rbx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon6 extends js.Object {
  var `data-tooltip`: js.UndefOr[String | Double] = js.native
}

object Anon6 {
  @scala.inline
  def apply(): Anon6 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon6]
  }
  @scala.inline
  implicit class Anon6Ops[Self <: Anon6] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withData-tooltip`(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutData-tooltip`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-tooltip")(js.undefined)
        ret
    }
  }
  
}

