package typingsSlinky.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaseFontSizeNumber extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.native
  var spacing: js.UndefOr[js.Object] = js.native
}

object AnonBaseFontSizeNumber {
  @scala.inline
  def apply(): AnonBaseFontSizeNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBaseFontSizeNumber]
  }
  @scala.inline
  implicit class AnonBaseFontSizeNumberOps[Self <: AnonBaseFontSizeNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
  }
  
}

