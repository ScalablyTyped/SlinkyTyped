package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Bottom
import typingsSlinky.officeJs.officeJsStrings.Center
import typingsSlinky.officeJs.officeJsStrings.CenterAcrossSelection
import typingsSlinky.officeJs.officeJsStrings.Context
import typingsSlinky.officeJs.officeJsStrings.Distributed
import typingsSlinky.officeJs.officeJsStrings.Fill
import typingsSlinky.officeJs.officeJsStrings.General
import typingsSlinky.officeJs.officeJsStrings.Justify
import typingsSlinky.officeJs.officeJsStrings.Left
import typingsSlinky.officeJs.officeJsStrings.LeftToRight
import typingsSlinky.officeJs.officeJsStrings.Right
import typingsSlinky.officeJs.officeJsStrings.RightToLeft
import typingsSlinky.officeJs.officeJsStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the returned format properties of getCellProperties or format input parameter of setCellProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesFormat extends js.Object {
  /**
    *
    * Represents the `autoIndent` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `borders` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var borders: js.UndefOr[CellBorderCollection] = js.native
  /**
    *
    * Represents the `fill` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[CellPropertiesFill] = js.native
  /**
    *
    * Represents the `font` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[CellPropertiesFont] = js.native
  /**
    *
    * Represents the `horizontalAlignment` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[
    HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
  ] = js.native
  /**
    *
    * Represents the `indentLevel` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var indentLevel: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the `protection` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var protection: js.UndefOr[CellPropertiesProtection] = js.native
  /**
    *
    * Represents the `readingOrder` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[ReadingOrder | Context | LeftToRight | RightToLeft] = js.native
  /**
    *
    * Represents the `shrinkToFit` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `textOrientation` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textOrientation: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the `useStandardHeight` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useStandardHeight: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `useStandardWidth` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useStandardWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `verticalAlignment` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Top | Center | Bottom | Justify | Distributed] = js.native
  /**
    *
    * Represents the `wrapText` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var wrapText: js.UndefOr[Boolean] = js.native
}

object CellPropertiesFormat {
  @scala.inline
  def apply(): CellPropertiesFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFormat]
  }
  @scala.inline
  implicit class CellPropertiesFormatOps[Self <: CellPropertiesFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withBorders(value: CellBorderCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: CellPropertiesFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: CellPropertiesFont): Self = {
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
    def withHorizontalAlignment(
      value: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
    ): Self = {
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
    def withIndentLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection(value: CellPropertiesProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(js.undefined)
        ret
    }
    @scala.inline
    def withReadingOrder(value: ReadingOrder | Context | LeftToRight | RightToLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadingOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkToFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkToFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkToFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkToFit")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStandardHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStandardHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStandardHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStandardHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStandardWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStandardWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStandardWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStandardWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: VerticalAlignment | Top | Center | Bottom | Justify | Distributed): Self = {
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
    @scala.inline
    def withWrapText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapText")(js.undefined)
        ret
    }
  }
  
}

