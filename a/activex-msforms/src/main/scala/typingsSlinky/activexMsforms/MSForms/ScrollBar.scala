package typingsSlinky.activexMsforms.MSForms

import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollBar extends js.Object {
  var BackColor: Double = js.native
  var Delay: Double = js.native
  var Enabled: Boolean = js.native
  var ForeColor: Double = js.native
  var LargeChange: Double = js.native
  @JSName("MSForms.ScrollBar_typekey")
  var MSFormsDotScrollBar_typekey: ScrollBar = js.native
  var Max: Double = js.native
  var Min: Double = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var Orientation: fmOrientation = js.native
  var ProportionalThumb: Boolean = js.native
  var SmallChange: Double = js.native
  var Value: Double = js.native
}

object ScrollBar {
  @scala.inline
  def apply(
    BackColor: Double,
    Delay: Double,
    Enabled: Boolean,
    ForeColor: Double,
    LargeChange: Double,
    MSFormsDotScrollBar_typekey: ScrollBar,
    Max: Double,
    Min: Double,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Orientation: fmOrientation,
    ProportionalThumb: Boolean,
    SmallChange: Double,
    Value: Double
  ): ScrollBar = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], Delay = Delay.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], LargeChange = LargeChange.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ProportionalThumb = ProportionalThumb.asInstanceOf[js.Any], SmallChange = SmallChange.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ScrollBar_typekey")(MSFormsDotScrollBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBar]
  }
  @scala.inline
  implicit class ScrollBarOps[Self <: ScrollBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LargeChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSFormsDotScrollBar_typekey(value: ScrollBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.ScrollBar_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseIcon(value: StdPicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MouseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousePointer(value: fmMousePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MousePointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: fmOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProportionalThumb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProportionalThumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmallChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

