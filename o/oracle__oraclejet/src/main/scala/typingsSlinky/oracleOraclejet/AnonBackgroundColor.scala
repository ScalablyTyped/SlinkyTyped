package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.asNeeded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackgroundColor extends js.Object {
  var backgroundColor: String = js.native
  var borderColor: String = js.native
  var maxSize: String = js.native
  var position: start | end | bottom | top | auto = js.native
  var referenceObjectSection: AnonTitle = js.native
  var rendered: on | off | auto = js.native
  var scrolling: off | asNeeded = js.native
  var sections: js.Array[AnonItems] = js.native
  var seriesSection: AnonTitle = js.native
  var size: String = js.native
  var symbolHeight: Double = js.native
  var symbolWidth: Double = js.native
  var textStyle: js.Object = js.native
  var title: String = js.native
  var titleHalign: center | end | start = js.native
  var titleStyle: js.Object = js.native
}

object AnonBackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    maxSize: String,
    position: start | end | bottom | top | auto,
    referenceObjectSection: AnonTitle,
    rendered: on | off | auto,
    scrolling: off | asNeeded,
    sections: js.Array[AnonItems],
    seriesSection: AnonTitle,
    size: String,
    symbolHeight: Double,
    symbolWidth: Double,
    textStyle: js.Object,
    title: String,
    titleHalign: center | end | start,
    titleStyle: js.Object
  ): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], referenceObjectSection = referenceObjectSection.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], seriesSection = seriesSection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], symbolHeight = symbolHeight.asInstanceOf[js.Any], symbolWidth = symbolWidth.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColor]
  }
  @scala.inline
  implicit class AnonBackgroundColorOps[Self <: AnonBackgroundColor] (val x: Self) extends AnyVal {
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
    def withMaxSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: start | end | bottom | top | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceObjectSection(value: AnonTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceObjectSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendered(value: on | off | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrolling(value: off | asNeeded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSections(value: js.Array[AnonItems]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesSection(value: AnonTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleHalign(value: center | end | start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHalign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

