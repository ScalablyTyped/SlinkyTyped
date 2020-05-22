package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeSaveDialog event.
  */
@JSGlobal("ASPxClientReportDesignerCustomizeSaveDialogEventArgs")
@js.native
class ASPxClientReportDesignerCustomizeSaveDialogEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientReportDesignerCustomizeSaveDialogEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerCustomizeSaveDialogEventArgs class with the specified settings.
    * @param popup An object that specifies the Save dialog.
    */
  def this(popup: typingsSlinky.devexpressWeb.ASPxDesignerSaveDialog) = this()
  /**
    * Provides access to the Save dialog.
    */
  /* CompleteClass */
  override var Popup: typingsSlinky.devexpressWeb.ASPxDesignerSaveDialog = js.native
  /**
    * Customizes the Save dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save dialog.
    */
  /* CompleteClass */
  override def Customize(template: String, model: typingsSlinky.devexpressWeb.ASPxDesignerDialogModel): Unit = js.native
}

