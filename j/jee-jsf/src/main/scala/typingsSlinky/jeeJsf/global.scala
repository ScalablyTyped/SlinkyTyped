package typingsSlinky.jeeJsf

import typingsSlinky.jeeJsf.jsf.ajax.RequestData
import typingsSlinky.jeeJsf.jsf.ajax.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object jsf extends js.Object {
    
    @js.native
    object ajax extends js.Object {
      
      /**
        * Register a callback for error handling.
        * @param callback a reference to a function to call on an error
        */
      def addOnError(callback: js.Function1[/* data */ RequestData, Unit]): Unit = js.native
      
      /**
        * Register a callback for event handling.
        * @param callback a reference to a function to call on an event
        */
      def addOnEvent(callback: js.Function1[/* data */ RequestData, Unit]): Unit = js.native
      
      /**
        * Send an asynchronous Ajax request to the server.
        * @param source The DOM element that triggered this Ajax request, or an id string of the element to use as the triggering element.
        * @param event The DOM event that triggered this Ajax request. The event argument is optional.
        * @param options The set of available options that can be sent as request parameters to control client and/or server side request processing.
        */
      def request(source: js.Any): Unit = js.native
      def request(source: js.Any, event: js.UndefOr[scala.Nothing], options: RequestOptions): Unit = js.native
      def request(source: js.Any, event: String): Unit = js.native
      def request(source: js.Any, event: String, options: RequestOptions): Unit = js.native
      
      /**
        * Receive an Ajax response from the server.
        * @param request The XMLHttpRequest instance that contains the status code and response message from the server.
        * @param context An object containing the request context, including the following properties: the source element, per call onerror callback function, and per call onevent callback function.
        * @throws EmptyResponse error if request contains no data
        */
      def response(request: js.Any, context: js.Any): Unit = js.native
    }
  }
}
