package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLEPROPERTIES_DIALOG_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorTablePropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Determines the position of the target table element.
    */
  var align: String = js.native
  /**
    * Gets or sets a value that is the table caption.
    */
  var caption: String = js.native
  /**
    * Gets or sets a table cell padding.
    */
  var cellPadding: Double = js.native
  /**
    * Gets or sets the table cell spacing.
    */
  var cellSpacing: Double = js.native
  /**
    * Gets or sets a value indicating whether the first row/column serves as the table's header.
    */
  var headers: String = js.native
  /**
    * Contains the style settings defining the appearance of the target table element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Gets or sets the table's summary.
    */
  var summary: String = js.native
}

object ASPxClientHtmlEditorTablePropertiesCommandArguments {
  @scala.inline
  def apply(
    align: String,
    caption: String,
    cellPadding: Double,
    cellSpacing: Double,
    headers: String,
    selectedElement: js.Any,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    summary: String
  ): ASPxClientHtmlEditorTablePropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], cellPadding = cellPadding.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTablePropertiesCommandArguments]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorTablePropertiesCommandArgumentsOps[Self <: ASPxClientHtmlEditorTablePropertiesCommandArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

