package typingsSlinky.jupyterlabServices

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.jupyterlabServices.anon.CLOSED
import typingsSlinky.jupyterlabServices.anon.Instantiable
import typingsSlinky.jupyterlabServices.anon.InstantiableRequest
import typingsSlinky.jupyterlabServices.anon.PartialISettings
import typingsSlinky.std.Error
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/serverconnection", JSImport.Namespace)
@js.native
object serverconnectionMod extends js.Object {
  
  @js.native
  object ServerConnection extends js.Object {
    
    /**
      * Make an request to the notebook server.
      *
      * @param url - The url for the request.
      *
      * @param init - The initialization options for the request.
      *
      * @param settings - The server settings to apply to the request.
      *
      * @returns a Promise that resolves with the response.
      *
      * @throws If the url of the request is not a notebook server url.
      *
      * #### Notes
      * The `url` must start with `settings.baseUrl`.  The `init` settings are
      * merged with `settings.init`, with `init` taking precedence.
      * The headers in the two objects are not merged.
      * If there is no body data, we set the content type to `application/json`
      * because it is required by the Notebook server.
      */
    def makeRequest(url: String, init: RequestInit, settings: ISettings): js.Promise[Response] = js.native
    
    /**
      * Create a settings object given a subset of options.
      *
      * @param options - An optional partial set of options.
      *
      * @returns The full settings object.
      */
    def makeSettings(): ISettings = js.native
    def makeSettings(options: PartialISettings): ISettings = js.native
    
    /**
      * A Jupyter server settings object.
      * Note that all of the settings are optional when passed to
      * [[makeSettings]].  The default settings are given in [[defaultSettings]].
      */
    @js.native
    trait ISettings extends js.Object {
      
      /**
        * The `Headers` object constructor.
        */
      val Headers: Instantiable with Instantiable0[org.scalajs.dom.experimental.Headers] = js.native
      
      /**
        * The `Request` object constructor.
        */
      val Request: InstantiableRequest with (Instantiable1[/* input */ RequestInfo, org.scalajs.dom.experimental.Request]) = js.native
      
      /**
        * The `WebSocket` object constructor.
        */
      val WebSocket: CLOSED with (Instantiable1[/* url */ String, org.scalajs.dom.raw.WebSocket]) = js.native
      
      /**
        * The app url of the JupyterLab application.
        */
      val appUrl: String = js.native
      
      /**
        * The base url of the server.
        */
      val baseUrl: String = js.native
      
      /**
        * The `fetch` method to use.
        */
      def fetch(input: RequestInfo): js.Promise[Response] = js.native
      def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
      
      /**
        * The default request init options.
        */
      val init: RequestInit = js.native
      
      /**
        * The authentication token for requests.  Use an empty string to disable.
        */
      val token: String = js.native
      
      /**
        * The base ws url of the server.
        */
      val wsUrl: String = js.native
    }
    
    /**
      * A wrapped error for a network error.
      */
    @js.native
    class NetworkError protected () extends Error {
      /**
        * Create a new network error.
        */
      def this(original: js.TypeError) = this()
    }
    
    /**
      * A wrapped error for a fetch response.
      */
    @js.native
    class ResponseError protected () extends Error {
      /**
        * Create a new response error.
        */
      def this(response: Response) = this()
      def this(response: Response, message: String) = this()
      def this(response: Response, message: js.UndefOr[scala.Nothing], traceback: String) = this()
      def this(response: Response, message: String, traceback: String) = this()
      
      /**
        * The response associated with the error.
        */
      var response: Response = js.native
      
      /**
        * The traceback associated with the error.
        */
      var traceback: String = js.native
    }
    /* static members */
    @js.native
    object ResponseError extends js.Object {
      
      /**
        * Create a ResponseError from a response, handling the traceback and message
        * as appropriate.
        *
        * @param response The response object.
        *
        * @returns A promise that resolves with a `ResponseError` object.
        */
      def create(response: Response): js.Promise[ResponseError] = js.native
    }
  }
}
