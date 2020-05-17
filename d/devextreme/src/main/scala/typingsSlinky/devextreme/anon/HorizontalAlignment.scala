package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalAlignment extends js.Object {
  var font: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.viz.Font] = js.native
  var horizontalAlignment: js.UndefOr[center | left | right] = js.native
  var margin: js.UndefOr[Bottom] = js.native
  var placeholderSize: js.UndefOr[Double] = js.native
  var subtitle: js.UndefOr[Font | String] = js.native
  var text: js.UndefOr[String] = js.native
  var verticalAlignment: js.UndefOr[bottom | top] = js.native
}

object HorizontalAlignment {
  @scala.inline
  def apply(): HorizontalAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalAlignment]
  }
  @scala.inline
  implicit class HorizontalAlignmentOps[Self <: HorizontalAlignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: typingsSlinky.devextreme.mod.DevExpress.viz.Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: center | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: Font | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
  }
  
}

