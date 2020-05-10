package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartColorScheme
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ColorfulPalette1
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ColorfulPalette2
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ColorfulPalette3
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ColorfulPalette4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette1
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette10
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette11
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette12
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette13
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette2
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette3
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette5
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette6
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette7
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette8
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette9
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartAreaFormat.toJSON()`. */
@js.native
trait ChartAreaFormatData extends js.Object {
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderData] = js.native
  /**
    *
    * Returns or sets color scheme of the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[
    ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
  ] = js.native
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.native
  /**
    *
    * Specifies whether or not chart area of the chart has rounded corners. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[Boolean] = js.native
}

object ChartAreaFormatData {
  @scala.inline
  def apply(): ChartAreaFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAreaFormatData]
  }
  @scala.inline
  implicit class ChartAreaFormatDataOps[Self <: ChartAreaFormatData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: ChartBorderData): Self = {
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
    def withColorScheme(
      value: ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: ChartFontData): Self = {
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
    def withRoundedCorners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedCorners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundedCorners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedCorners")(js.undefined)
        ret
    }
  }
  
}

