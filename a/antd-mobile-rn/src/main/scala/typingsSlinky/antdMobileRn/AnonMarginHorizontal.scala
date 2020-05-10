package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMarginHorizontal extends js.Object {
  var marginHorizontal: Double = js.native
  var marginVertical: Double = js.native
}

object AnonMarginHorizontal {
  @scala.inline
  def apply(marginHorizontal: Double, marginVertical: Double): AnonMarginHorizontal = {
    val __obj = js.Dynamic.literal(marginHorizontal = marginHorizontal.asInstanceOf[js.Any], marginVertical = marginVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarginHorizontal]
  }
  @scala.inline
  implicit class AnonMarginHorizontalOps[Self <: AnonMarginHorizontal] (val x: Self) extends AnyVal {
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

