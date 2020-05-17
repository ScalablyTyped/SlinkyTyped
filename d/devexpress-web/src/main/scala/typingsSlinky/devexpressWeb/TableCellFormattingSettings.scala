package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings to define the table cell formatting.
  */
@js.native
trait TableCellFormattingSettings extends js.Object {
  /**
    * Gets or sets a table cell's bottom margin in twips.
    */
  var marginBottom: Double = js.native
  /**
    * Gets or sets a table cell's left margin in twips.
    */
  var marginLeft: Double = js.native
  /**
    * Gets or sets a table cell's right margin in twips.
    */
  var marginRight: Double = js.native
  /**
    * Gets or sets a table cell's top margin in twips.
    */
  var marginTop: Double = js.native
  /**
    * Specifies whether a table cell's margins are inherited from the table level settings.
    */
  var marginsSameAsTable: Boolean = js.native
  /**
    * Sspecifies whether text is wrapped in a table cell.
    */
  var noWrap: Boolean = js.native
  /**
    * Gets or sets a table cell's preferred width.
    */
  var preferredWidth: TableWidthUnit = js.native
  /**
    * Gets or sets the vertical alignment of a table cell's content.
    */
  var verticalAlignment: TableCellVerticalAlignment = js.native
}

object TableCellFormattingSettings {
  @scala.inline
  def apply(
    marginBottom: Double,
    marginLeft: Double,
    marginRight: Double,
    marginTop: Double,
    marginsSameAsTable: Boolean,
    noWrap: Boolean,
    preferredWidth: TableWidthUnit,
    verticalAlignment: TableCellVerticalAlignment
  ): TableCellFormattingSettings = {
    val __obj = js.Dynamic.literal(marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], marginsSameAsTable = marginsSameAsTable.asInstanceOf[js.Any], noWrap = noWrap.asInstanceOf[js.Any], preferredWidth = preferredWidth.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellFormattingSettings]
  }
  @scala.inline
  implicit class TableCellFormattingSettingsOps[Self <: TableCellFormattingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginsSameAsTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginsSameAsTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredWidth(value: TableWidthUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: TableCellVerticalAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

