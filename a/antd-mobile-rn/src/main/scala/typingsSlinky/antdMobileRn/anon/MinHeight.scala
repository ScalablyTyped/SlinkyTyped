package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinHeight extends js.Object {
  var alignItems: String = js.native
  var borderBottomColor: String = js.native
  var borderBottomWidth: Double = js.native
  var flex: Double = js.native
  var flexDirection: String = js.native
  var minHeight: Double = js.native
  var paddingRight: Double = js.native
  var paddingVertical: Double = js.native
}

object MinHeight {
  @scala.inline
  def apply(
    alignItems: String,
    borderBottomColor: String,
    borderBottomWidth: Double,
    flex: Double,
    flexDirection: String,
    minHeight: Double,
    paddingRight: Double,
    paddingVertical: Double
  ): MinHeight = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinHeight]
  }
  @scala.inline
  implicit class MinHeightOps[Self <: MinHeight] (val x: Self) extends AnyVal {
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
    def withFlex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(value.asInstanceOf[js.Any])
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

