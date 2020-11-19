package typingsSlinky.bugsnagJs

import typingsSlinky.bugsnagJs.clientMod.Client
import typingsSlinky.bugsnagJs.clientMod.IPlugin
import typingsSlinky.bugsnagJs.commonMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bugsnag-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  // two ways to call the exported function: apiKey or config object
  def default(apiKeyOrOpts: String): Client = js.native
  def default(apiKeyOrOpts: String, plugins: js.Array[IPlugin]): Client = js.native
  def default(apiKeyOrOpts: IConfig): Client = js.native
  def default(apiKeyOrOpts: IConfig, plugins: js.Array[IPlugin]): Client = js.native
  
  @js.native
  object Bugsnag extends js.Object {
    
    @js.native
    class Client ()
      extends typingsSlinky.bugsnagJs.clientMod.Client
    
    @js.native
    class default ()
      extends typingsSlinky.bugsnagJs.clientMod.Client
  }
}
