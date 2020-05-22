package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.DialogClosing event.
  */
@JSGlobal("ASPxClientHtmlEditorDialogClosingEventArgs")
@js.native
class ASPxClientHtmlEditorDialogClosingEventArgs ()
  extends typingsSlinky.devexpressWeb.ASPxClientHtmlEditorDialogClosingEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the dialog object related to the event.
    */
  /* CompleteClass */
  override var dialog: typingsSlinky.devexpressWeb.ASPxClientHtmlEditorDialogBase = js.native
  /**
    * Gets the dialog name related to the event.
    */
  /* CompleteClass */
  override var dialogName: String = js.native
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  /* CompleteClass */
  override var parameter: js.Any = js.native
}

