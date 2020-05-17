package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginTopNumber extends js.Object {
  var fontSize: Double = js.native
  var marginTop: Double = js.native
}

object MarginTopNumber {
  @scala.inline
  def apply(fontSize: Double, marginTop: Double): MarginTopNumber = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginTopNumber]
  }
  @scala.inline
  implicit class MarginTopNumberOps[Self <: MarginTopNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

