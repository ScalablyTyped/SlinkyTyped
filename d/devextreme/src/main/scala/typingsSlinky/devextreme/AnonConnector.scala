package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.breakWord
import typingsSlinky.devextreme.devextremeStrings.columns
import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.inside
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.devextremeStrings.outside
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import typingsSlinky.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnector extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var border: js.UndefOr[AnonColorDashStyle] = js.native
  var connector: js.UndefOr[AnonColorOpacity] = js.native
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ AnonPercent, String]] = js.native
  var font: js.UndefOr[Font] = js.native
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  var horizontalAlignment: js.UndefOr[left | right] = js.native
  var horizontalOffset: js.UndefOr[Double] = js.native
  var position: js.UndefOr[columns | inside | outside] = js.native
  var showForZeroValues: js.UndefOr[Boolean] = js.native
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}

object AnonConnector {
  @scala.inline
  def apply(): AnonConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConnector]
  }
  @scala.inline
  implicit class AnonConnectorOps[Self <: AnonConnector] (val x: Self) extends AnyVal {
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
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: AnonColorDashStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withConnector(value: AnonColorOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeText(value: /* itemInfo */ AnonPercent => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
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
    def withFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: left | right): Self = {
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
    def withHorizontalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: columns | inside | outside): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShowForZeroValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForZeroValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowForZeroValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForZeroValues")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverflow(value: ellipsis | hide | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrap(value: normal | breakWord | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
  }
  
}

