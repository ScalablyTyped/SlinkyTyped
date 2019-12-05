package typingsSlinky.bugsnagDashJs

import typingsSlinky.bugsnagDashJs.typesClientMod.Client
import typingsSlinky.bugsnagDashJs.typesClientMod.IPlugin
import typingsSlinky.bugsnagDashJs.typesCommonMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js", JSImport.Namespace)
@js.native
object bugsnagDashJsMod extends js.Object {
  // two ways to call the exported function: apiKey or config object
  def default(apiKeyOrOpts: String): Client = js.native
  def default(apiKeyOrOpts: String, plugins: js.Array[IPlugin]): Client = js.native
  def default(apiKeyOrOpts: IConfig): Client = js.native
  def default(apiKeyOrOpts: IConfig, plugins: js.Array[IPlugin]): Client = js.native
  @js.native
  object Bugsnag extends js.Object {
    @js.native
    class Client ()
      extends typingsSlinky.bugsnagDashJs.typesClientMod.Client
    
    @js.native
    class default ()
      extends typingsSlinky.bugsnagDashJs.typesClientMod.Client
    
  }
  
}

