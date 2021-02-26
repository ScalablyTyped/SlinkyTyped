package typingsSlinky.devexpressWeb.global

import typingsSlinky.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typingsSlinky.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typingsSlinky.devexpressWeb.ASPxClientEndCallbackEventHandler
import typingsSlinky.devexpressWeb.MVCxClientBeginCallbackEventHandler
import org.scalablytyped.runtime.StObject
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
object MVCxClientGlobalEvents {
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.BeginCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  /* static member */
  @JSGlobal("MVCxClientGlobalEvents.AddBeginCallbackEventHandler")
  @js.native
  def AddBeginCallbackEventHandler(
    handler: typingsSlinky.devexpressWeb.ASPxClientEvent[
      MVCxClientBeginCallbackEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.CallbackError client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  /* static member */
  @JSGlobal("MVCxClientGlobalEvents.AddCallbackErrorHandler")
  @js.native
  def AddCallbackErrorHandler(
    handler: typingsSlinky.devexpressWeb.ASPxClientEvent[
      ASPxClientCallbackErrorEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.ControlsInitialized client event with an appropriate event handler function.
    * @param handler A object representing the event handling function's content.
    */
  /* static member */
  @JSGlobal("MVCxClientGlobalEvents.AddControlsInitializedEventHandler")
  @js.native
  def AddControlsInitializedEventHandler(
    handler: typingsSlinky.devexpressWeb.ASPxClientEvent[
      ASPxClientControlsInitializedEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.EndCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  /* static member */
  @JSGlobal("MVCxClientGlobalEvents.AddEndCallbackEventHandler")
  @js.native
  def AddEndCallbackEventHandler(
    handler: typingsSlinky.devexpressWeb.ASPxClientEvent[
      ASPxClientEndCallbackEventHandler[typingsSlinky.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
}
