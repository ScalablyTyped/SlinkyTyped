package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginHorizontal extends js.Object {
  var marginHorizontal: Double = js.native
  var marginVertical: Double = js.native
}

object MarginHorizontal {
  @scala.inline
  def apply(marginHorizontal: Double, marginVertical: Double): MarginHorizontal = {
    val __obj = js.Dynamic.literal(marginHorizontal = marginHorizontal.asInstanceOf[js.Any], marginVertical = marginVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginHorizontal]
  }
  @scala.inline
  implicit class MarginHorizontalOps[Self <: MarginHorizontal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarginHorizontal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginVertical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginVertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

