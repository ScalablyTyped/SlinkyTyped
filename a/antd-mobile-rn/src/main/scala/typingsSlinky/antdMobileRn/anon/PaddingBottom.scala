package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingBottom extends js.Object {
  var backgroundColor: String = js.native
  var borderColor: String = js.native
  var borderRadius: Double = js.native
  var borderWidth: Double = js.native
  var flexDirection: String = js.native
  var paddingBottom: Double = js.native
}

object PaddingBottom {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    flexDirection: String,
    paddingBottom: Double
  ): PaddingBottom = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottom]
  }
  @scala.inline
  implicit class PaddingBottomOps[Self <: PaddingBottom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

