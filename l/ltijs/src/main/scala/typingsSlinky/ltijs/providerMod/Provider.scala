package typingsSlinky.ltijs.providerMod

import typingsSlinky.express.mod.Express
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.ltijs.anon.Method
import typingsSlinky.ltijs.databaseMod.DatabaseOptions
import typingsSlinky.ltijs.deepLinkingMod.DeepLinkingService
import typingsSlinky.ltijs.gradeServiceMod.GradeService
import typingsSlinky.ltijs.ltijsBooleans.`false`
import typingsSlinky.ltijs.ltijsBooleans.`true`
import typingsSlinky.ltijs.namesAndRolesMod.NamesAndRolesService
import typingsSlinky.ltijs.platformMod.Platform
import typingsSlinky.ltijs.platformMod.PlatformConfig
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ltijs/lib/Provider/Provider", "Provider")
@js.native
class Provider protected () extends js.Object {
  def this(encryptionKey: String, database: DatabaseOptions) = this()
  def this(encryptionKey: String, database: DatabaseOptions, options: ProviderOptions) = this()
  
  var Database: typingsSlinky.ltijs.databaseMod.Database = js.native
  
  var DeepLinking: DeepLinkingService = js.native
  
  var Grade: GradeService = js.native
  
  var NamesAndRoles: NamesAndRolesService = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  
  def appUrl(): String = js.native
  
  @JSName("app")
  var app_Original: Express = js.native
  
  def close(): js.Promise[Boolean] = js.native
  
  def deletePlatform(url: String): js.Promise[Boolean] = js.native
  
  def deploy(): js.Promise[js.UndefOr[`true`]] = js.native
  def deploy(options: DeploymentOptions): js.Promise[js.UndefOr[`true`]] = js.native
  
  def getAllPlatforms(): js.Promise[js.Array[Platform] | `false`] = js.native
  
  def getPlatform(url: String): js.Promise[Platform | `false`] = js.native
  
  def invalidTokenUrl(): String = js.native
  
  def keysetUrl(): String = js.native
  
  def loginUrl(): String = js.native
  
  def onConnect(_connectCallback: OnConnectCallback): `true` = js.native
  def onConnect(_connectCallback: OnConnectCallback, options: OnConnectOptions): `true` = js.native
  
  def onDeepLinking(_connectCallback: OnConnectCallback): `true` = js.native
  def onDeepLinking(_connectCallback: OnConnectCallback, options: OnConnectOptions): `true` = js.native
  
  def redirect(response: Response_[_], path: String): Unit = js.native
  def redirect(response: Response_[_], path: String, options: RedirectOptions): Unit = js.native
  
  def registerPlatform(config: PlatformConfig): js.Promise[Platform | `false`] = js.native
  
  def sessionTimeoutUrl(): String = js.native
  
  def whitelist(urls: (String | Method)*): `true` = js.native
}
