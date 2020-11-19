package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.anon.PickIModelidDeepPartialOm
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.sessionManagerMod.SessionManager.IOptions
import typingsSlinky.jupyterlabServices.sessionSessionMod.IModel
import typingsSlinky.jupyterlabServices.sessionSessionMod.ISessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/session", JSImport.Namespace)
@js.native
object sessionMod extends js.Object {
  
  @js.native
  object SessionAPI extends js.Object {
    
    val SESSION_SERVICE_URL: /* "api/sessions" */ String = js.native
    
    def getSessionModel(id: String): js.Promise[IModel] = js.native
    def getSessionModel(id: String, settings: ISettings): js.Promise[IModel] = js.native
    
    def getSessionUrl(baseUrl: String, id: String): String = js.native
    
    def listRunning(): js.Promise[js.Array[IModel]] = js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
    
    def shutdownSession(id: String): js.Promise[Unit] = js.native
    def shutdownSession(id: String, settings: ISettings): js.Promise[Unit] = js.native
    
    def startSession(options: ISessionOptions): js.Promise[IModel] = js.native
    def startSession(options: ISessionOptions, settings: ISettings): js.Promise[IModel] = js.native
    
    def updateSession(model: PickIModelidDeepPartialOm): js.Promise[IModel] = js.native
    def updateSession(model: PickIModelidDeepPartialOm, settings: ISettings): js.Promise[IModel] = js.native
  }
  
  @js.native
  class SessionManager protected ()
    extends typingsSlinky.jupyterlabServices.sessionManagerMod.SessionManager {
    /**
      * Construct a new session manager.
      *
      * @param options - The default options for each session.
      */
    def this(options: IOptions) = this()
  }
}
