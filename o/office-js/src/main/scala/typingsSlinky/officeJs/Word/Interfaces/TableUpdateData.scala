package typingsSlinky.officeJs.Word.Interfaces

import typingsSlinky.officeJs.Word.Alignment
import typingsSlinky.officeJs.Word.VerticalAlignment
import typingsSlinky.officeJs.officeJsStrings.Bottom
import typingsSlinky.officeJs.officeJsStrings.Center
import typingsSlinky.officeJs.officeJsStrings.Centered
import typingsSlinky.officeJs.officeJsStrings.Justified
import typingsSlinky.officeJs.officeJsStrings.Left
import typingsSlinky.officeJs.officeJsStrings.Mixed
import typingsSlinky.officeJs.officeJsStrings.Right
import typingsSlinky.officeJs.officeJsStrings.Top
import typingsSlinky.officeJs.officeJsStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Table object, for use in "table.set({ ... })". */
@js.native
trait TableUpdateData extends js.Object {
  /**
    *
    * Gets or sets the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
    *
    * [Api set: WordApi 1.3]
    */
  var alignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.native
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontUpdateData] = js.native
  /**
    *
    * Gets and sets the number of header rows.
    *
    * [Api set: WordApi 1.3]
    */
  var headerRowCount: js.UndefOr[Double] = js.native
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.native
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.3]
    */
  var style: js.UndefOr[String] = js.native
  /**
    *
    * Gets and sets whether the table has banded columns.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets and sets whether the table has banded rows.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.native
  /**
    *
    * Gets and sets whether the table has a first column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets and sets whether the table has a last column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets and sets whether the table has a total (last) row with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets and sets the text values in the table, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    *
    * Gets and sets the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Mixed | Top | Center | Bottom] = js.native
  /**
    *
    * Gets and sets the width of the table in points.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Double] = js.native
}

object TableUpdateData {
  @scala.inline
  def apply(): TableUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableUpdateData]
  }
  @scala.inline
  implicit class TableUpdateDataOps[Self <: TableUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: FontUpdateData): Self = {
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
    def withHeaderRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = {
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
    def withShadingColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleBandedColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBandedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleBandedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBandedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleBandedRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBandedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleBandedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBandedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleBuiltIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBuiltIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleBuiltIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBuiltIn")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleFirstColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleFirstColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleFirstColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleFirstColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleLastColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleLastColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleLastColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleLastColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleTotalRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTotalRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleTotalRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTotalRow")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: VerticalAlignment | Mixed | Top | Center | Bottom): Self = {
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

