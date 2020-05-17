package typingsSlinky.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LengthNumber extends js.Object {
  val length: js.UndefOr[Double] = js.native
}

object LengthNumber {
  @scala.inline
  def apply(): LengthNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LengthNumber]
  }
  @scala.inline
  implicit class LengthNumberOps[Self <: LengthNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
  }
  
}

