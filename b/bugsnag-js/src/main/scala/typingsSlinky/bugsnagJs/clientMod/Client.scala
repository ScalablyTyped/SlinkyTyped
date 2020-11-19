package typingsSlinky.bugsnagJs.clientMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.bugsnagJs.anon.Instantiable
import typingsSlinky.bugsnagJs.commonMod.BeforeSession
import typingsSlinky.bugsnagJs.commonMod.IConfig
import typingsSlinky.bugsnagJs.commonMod.IFinalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bugsnag-js/types/client", "Client")
@js.native
class Client () extends js.Object {
  
  var BugsnagBreadcrumb: Instantiable4[
    /* name */ String, 
    /* metaData */ js.UndefOr[js.Object], 
    /* type */ js.UndefOr[String], 
    /* timestamp */ js.UndefOr[String], 
    typingsSlinky.bugsnagJs.breadcrumbMod.default
  ] = js.native
  
  var BugsnagReport: Instantiable = js.native
  
  var BugsnagSession: Instantiable0[typingsSlinky.bugsnagJs.sessionMod.default] = js.native
  
  var app: js.Object = js.native
  
  var beforeSession: js.Array[BeforeSession] = js.native
  
  var config: IFinalConfig = js.native
  
  def configure(opts: IConfig): Client = js.native
  
  var context: String | Unit = js.native
  
  var device: js.Object = js.native
  
  def leaveBreadcrumb(name: String): Client = js.native
  def leaveBreadcrumb(
    name: String,
    metaData: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    timestamp: String
  ): Client = js.native
  def leaveBreadcrumb(name: String, metaData: js.UndefOr[scala.Nothing], `type`: String): Client = js.native
  def leaveBreadcrumb(name: String, metaData: js.UndefOr[scala.Nothing], `type`: String, timestamp: String): Client = js.native
  def leaveBreadcrumb(name: String, metaData: js.Any): Client = js.native
  def leaveBreadcrumb(name: String, metaData: js.Any, `type`: js.UndefOr[scala.Nothing], timestamp: String): Client = js.native
  def leaveBreadcrumb(name: String, metaData: js.Any, `type`: String): Client = js.native
  def leaveBreadcrumb(name: String, metaData: js.Any, `type`: String, timestamp: String): Client = js.native
  
  def logger(logger: ILogger): Client = js.native
  
  var metaData: js.Object = js.native
  
  def notify(error: NotifiableError): Boolean = js.native
  def notify(error: NotifiableError, opts: INotifyOpts): Boolean = js.native
  
  def sessionDelegate(sessionDelegate: ISessionDelegate): Client = js.native
  
  def startSession(): Client = js.native
  
  def transport(transport: ITransport): Client = js.native
  
  def use(plugin: IPlugin): js.Any = js.native
  
  var user: js.Object = js.native
}
