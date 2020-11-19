package typingsSlinky.devexpressWeb.global

import typingsSlinky.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typingsSlinky.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typingsSlinky.devexpressWeb.ASPxClientEndCallbackEventHandler
import typingsSlinky.devexpressWeb.MVCxClientBeginCallbackEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ASP.NET MVC equivalent of the client ASPxClientGlobalEvents component.
  */
@JSGlobal("MVCxClientGlobalEvents")
@js.native
class MVCxClientGlobalEvents ()
  extends typingsSlinky.devexpressWeb.MVCxClientGlobalEvents
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
