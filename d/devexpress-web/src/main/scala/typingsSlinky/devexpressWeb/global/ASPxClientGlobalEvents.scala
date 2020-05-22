package typingsSlinky.devexpressWeb.global

import typingsSlinky.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typingsSlinky.devexpressWeb.ASPxClientEventHandler
import typingsSlinky.devexpressWeb.ASPxClientGlobalBeginCallbackEventHandler
import typingsSlinky.devexpressWeb.ASPxClientGlobalCallbackErrorEventHandler
import typingsSlinky.devexpressWeb.ASPxClientGlobalEndCallbackEventHandler
import typingsSlinky.devexpressWeb.ASPxClientValidationCompletedEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxGlobalEvents component.
  */
@JSGlobal("ASPxClientGlobalEvents")
@js.native
class ASPxClientGlobalEvents ()
  extends typingsSlinky.devexpressWeb.ASPxClientGlobalEvents {
  /**
    * Occurs when a callback for server-side processing is initiated by any DevExpress control.
    */
  /* CompleteClass */
  override var BeginCallback: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalBeginCallbackEventHandler[typingsSlinky.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs when the browser window is being resized.
    */
  /* CompleteClass */
  override var BrowserWindowResized: typingsSlinky.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsSlinky.devexpressWeb.ASPxClientGlobalEvents]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by any of DevExpress web controls.
    */
  /* CompleteClass */
  override var CallbackError: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalCallbackErrorEventHandler[typingsSlinky.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs on the client side after client object models of all DevExpress web controls contained within the page have been initialized.
    */
  /* CompleteClass */
  override var ControlsInitialized: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientControlsInitializedEventHandler[typingsSlinky.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs on the client side, after server-side processing of a callback initiated by any DevExpress web control, has been completed.
    */
  /* CompleteClass */
  override var EndCallback: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalEndCallbackEventHandler[typingsSlinky.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs on the client side after the validation initiated for a DevExpress web control (or a group of DevExpress web controls) has been completed.
    */
  /* CompleteClass */
  override var ValidationCompleted: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientValidationCompletedEventHandler[typingsSlinky.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
}

