package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottomColor extends js.Object {
  var alignItems: String = js.native
  var borderBottomColor: String = js.native
  var borderBottomWidth: Double = js.native
  var flexDirection: String = js.native
  var height: Double = js.native
  var marginBottom: Double = js.native
  var marginLeft: Double = js.native
  var marginTop: Double = js.native
  var paddingRight: Double = js.native
}

object BorderBottomColor {
  @scala.inline
  def apply(
    alignItems: String,
    borderBottomColor: String,
    borderBottomWidth: Double,
    flexDirection: String,
    height: Double,
    marginBottom: Double,
    marginLeft: Double,
    marginTop: Double,
    paddingRight: Double
  ): BorderBottomColor = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomColor]
  }
  @scala.inline
  implicit class BorderBottomColorOps[Self <: BorderBottomColor] (val x: Self) extends AnyVal {
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
    def withBorderBottomColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderBottomWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

