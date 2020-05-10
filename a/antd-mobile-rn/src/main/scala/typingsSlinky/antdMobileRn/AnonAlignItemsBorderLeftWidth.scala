package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlignItemsBorderLeftWidth extends js.Object {
  var alignItems: String = js.native
  var borderLeftWidth: Double = js.native
  var borderRightWidth: Double = js.native
  var borderStyle: String = js.native
  var flex: Double = js.native
  var justifyContent: String = js.native
  var paddingVertical: Double = js.native
}

object AnonAlignItemsBorderLeftWidth {
  @scala.inline
  def apply(
    alignItems: String,
    borderLeftWidth: Double,
    borderRightWidth: Double,
    borderStyle: String,
    flex: Double,
    justifyContent: String,
    paddingVertical: Double
  ): AnonAlignItemsBorderLeftWidth = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], borderLeftWidth = borderLeftWidth.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignItemsBorderLeftWidth]
  }
  @scala.inline
  implicit class AnonAlignItemsBorderLeftWidthOps[Self <: AnonAlignItemsBorderLeftWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderLeftWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderRightWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJustifyContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingVertical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingVertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

