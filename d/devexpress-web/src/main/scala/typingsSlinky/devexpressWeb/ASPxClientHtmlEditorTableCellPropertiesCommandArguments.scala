package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECELLPROPERTIES_DIALOG_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorTableCellPropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Gets or sets a value that indicates whether the cell settings should be applied to all cells in the table.
    */
  var applyForAll: Boolean = js.native
  /**
    * Contains the style settings defining the appearance of the target cell element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
}

object ASPxClientHtmlEditorTableCellPropertiesCommandArguments {
  @scala.inline
  def apply(
    applyForAll: Boolean,
    selectedElement: js.Any,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorTableCellPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(applyForAll = applyForAll.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTableCellPropertiesCommandArguments]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorTableCellPropertiesCommandArgumentsOps[Self <: ASPxClientHtmlEditorTableCellPropertiesCommandArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyForAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyForAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

