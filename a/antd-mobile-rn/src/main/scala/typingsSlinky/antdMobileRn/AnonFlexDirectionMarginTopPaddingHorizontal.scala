package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlexDirectionMarginTopPaddingHorizontal extends js.Object {
  var flexDirection: String = js.native
  var marginTop: Double = js.native
  var paddingHorizontal: Double = js.native
}

object AnonFlexDirectionMarginTopPaddingHorizontal {
  @scala.inline
  def apply(flexDirection: String, marginTop: Double, paddingHorizontal: Double): AnonFlexDirectionMarginTopPaddingHorizontal = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlexDirectionMarginTopPaddingHorizontal]
  }
  @scala.inline
  implicit class AnonFlexDirectionMarginTopPaddingHorizontalOps[Self <: AnonFlexDirectionMarginTopPaddingHorizontal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlexDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingHorizontal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

