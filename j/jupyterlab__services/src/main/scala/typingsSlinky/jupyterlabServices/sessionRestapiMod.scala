package typingsSlinky.jupyterlabServices

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabServices.anon.PickIModelidDeepPartialOm
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.sessionSessionMod.IModel
import typingsSlinky.jupyterlabServices.sessionSessionMod.ISessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/session/restapi", JSImport.Namespace)
@js.native
object sessionRestapiMod extends js.Object {
  
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
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @jupyterlab/services.@jupyterlab/services/lib/session/restapi.DeepPartial<T[P]> * / object}
    */ typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.DeepPartial with TopLevel[js.Any]
}
