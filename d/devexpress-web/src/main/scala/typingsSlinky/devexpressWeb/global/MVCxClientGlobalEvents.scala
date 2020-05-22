package typingsSlinky.devexpressWeb.global

import typingsSlinky.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typingsSlinky.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typingsSlinky.devexpressWeb.ASPxClientEndCallbackEventHandler
import typingsSlinky.devexpressWeb.ASPxClientGlobalCallbackErrorEventHandler
import typingsSlinky.devexpressWeb.ASPxClientGlobalEndCallbackEventHandler
import typingsSlinky.devexpressWeb.MVCxClientBeginCallbackEventHandler
import typingsSlinky.devexpressWeb.MVCxClientGlobalBeginCallbackEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ASP.NET MVC equivalent of the client ASPxClientGlobalEvents component.
  */
@JSGlobal("MVCxClientGlobalEvents")
@js.native
class MVCxClientGlobalEvents ()
  extends typingsSlinky.devexpressWeb.MVCxClientGlobalEvents {
  /**
    * Occurs on the client when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  override var BeginCallback: typingsSlinky.devexpressWeb.ASPxClientEvent[
    MVCxClientGlobalBeginCallbackEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by a DevExpress MVC extension.
    */
  /* CompleteClass */
  override var CallbackError: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalCallbackErrorEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs on the client side after client object models of all DevExpress MVC extensions contained within the page have been initialized.
    */
  /* CompleteClass */
  override var ControlsInitialized: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientControlsInitializedEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  override var EndCallback: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalEndCallbackEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
}

/* static members */
@JSGlobal("MVCxClientGlobalEvents")
@js.native
object MVCxClientGlobalEvents extends js.Object {
  /**
    * Dynamically connects the MVCxClientGlobalEvents.BeginCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddBeginCallbackEventHandler(
    handler: typingsSlinky.devexpressWeb.ASPxClientEvent[
      MVCxClientBeginCallbackEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  /**
    * Dynamically connects the MVCxClientGlobalEvents.CallbackError client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddCallbackErrorHandler(
    handler: typingsSlinky.devexpressWeb.ASPxClientEvent[
      ASPxClientCallbackErrorEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  /**
    * Dynamically connects the MVCxClientGlobalEvents.ControlsInitialized client event with an appropriate event handler function.
    * @param handler A object representing the event handling function's content.
    */
  def AddControlsInitializedEventHandler(
    handler: typingsSlinky.devexpressWeb.ASPxClientEvent[
      ASPxClientControlsInitializedEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  /**
    * Dynamically connects the MVCxClientGlobalEvents.EndCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddEndCallbackEventHandler(
    handler: typingsSlinky.devexpressWeb.ASPxClientEvent[
      ASPxClientEndCallbackEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
}

