package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECOLUMNPROPERTIES_DIALOG_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorTableColumnPropertiesCommandArguments")
@js.native
class ASPxClientHtmlEditorTableColumnPropertiesCommandArguments protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientHtmlEditorTableColumnPropertiesCommandArguments {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorTableColumnPropertiesCommandArguments class with specified settings.
    * @param htmlEditor The HTML editor executing a command.
    * @param selectedElement An object containing the currently selected element in the HTML editor.
    */
  def this(htmlEditor: typingsSlinky.devexpressWeb.ASPxClientHtmlEditor, selectedElement: js.Any) = this()
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  override var selectedElement: js.Any = js.native
  /**
    * Contains the style settings defining the appearance of the target column element.
    */
  /* CompleteClass */
  override var styleSettings: typingsSlinky.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
}

