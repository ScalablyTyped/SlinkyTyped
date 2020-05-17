package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings to format a table.
  */
@js.native
trait TableFormattingSettings extends js.Object {
  /**
    * Gets or sets the alignment of table rows.
    */
  var alignment: TableRowAlignment = js.native
  /**
    * Gets or sets a value specifying whether spacing is allowed between table cells.
    */
  var allowSpacingBetweenCells: Boolean = js.native
  /**
    * Gets or sets the default bottom margin for cells in the table in twips.
    */
  var defaultCellMarginBottom: Double = js.native
  /**
    * Gets or sets the default left margin for cells in the table in twips.
    */
  var defaultCellMarginLeft: Double = js.native
  /**
    * Gets or sets the default right margin for cells in the table in twips.
    */
  var defaultCellMarginRight: Double = js.native
  /**
    * Gets or sets the default top margin for cells in the table in twips.
    */
  var defaultCellMarginTop: Double = js.native
  /**
    * Gets or sets the table's left indent in twips.
    */
  var indent: Double = js.native
  /**
    * Gets or sets the preferred width of cells in the table.
    */
  var preferredWidth: TableWidthUnit = js.native
  /**
    * Gets or sets a value that specifying whether to allow automatic resizing of table cells to fit their contents.
    */
  var resizeToFitContent: Boolean = js.native
  /**
    * Gets or sets the spacing between table cells in twips.
    */
  var spacingBetweenCells: Double = js.native
}

object TableFormattingSettings {
  @scala.inline
  def apply(
    alignment: TableRowAlignment,
    allowSpacingBetweenCells: Boolean,
    defaultCellMarginBottom: Double,
    defaultCellMarginLeft: Double,
    defaultCellMarginRight: Double,
    defaultCellMarginTop: Double,
    indent: Double,
    preferredWidth: TableWidthUnit,
    resizeToFitContent: Boolean,
    spacingBetweenCells: Double
  ): TableFormattingSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], allowSpacingBetweenCells = allowSpacingBetweenCells.asInstanceOf[js.Any], defaultCellMarginBottom = defaultCellMarginBottom.asInstanceOf[js.Any], defaultCellMarginLeft = defaultCellMarginLeft.asInstanceOf[js.Any], defaultCellMarginRight = defaultCellMarginRight.asInstanceOf[js.Any], defaultCellMarginTop = defaultCellMarginTop.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], preferredWidth = preferredWidth.asInstanceOf[js.Any], resizeToFitContent = resizeToFitContent.asInstanceOf[js.Any], spacingBetweenCells = spacingBetweenCells.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFormattingSettings]
  }
  @scala.inline
  implicit class TableFormattingSettingsOps[Self <: TableFormattingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: TableRowAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowSpacingBetweenCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSpacingBetweenCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCellMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCellMarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCellMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCellMarginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCellMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCellMarginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCellMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCellMarginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredWidth(value: TableWidthUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeToFitContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeToFitContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacingBetweenCells(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingBetweenCells")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

