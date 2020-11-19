package typingsSlinky.jupyterlabServices.mod

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.jupyterlabServices.anon.PartialISettings
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services", "ServerConnection")
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
    * A wrapped error for a network error.
    */
  @js.native
  class NetworkError protected ()
    extends typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.NetworkError {
    /**
      * Create a new network error.
      */
    def this(original: js.TypeError) = this()
  }
  
  /**
    * A wrapped error for a fetch response.
    */
  @js.native
  class ResponseError protected ()
    extends typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ResponseError {
    /**
      * Create a new response error.
      */
    def this(response: Response) = this()
    def this(response: Response, message: String) = this()
    def this(response: Response, message: js.UndefOr[scala.Nothing], traceback: String) = this()
    def this(response: Response, message: String, traceback: String) = this()
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
    def create(response: Response): js.Promise[
        typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ResponseError
      ] = js.native
  }
}
