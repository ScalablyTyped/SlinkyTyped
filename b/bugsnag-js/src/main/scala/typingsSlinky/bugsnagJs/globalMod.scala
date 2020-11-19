package typingsSlinky.bugsnagJs

import typingsSlinky.bugsnagJs.clientMod.Client
import typingsSlinky.bugsnagJs.clientMod.IPlugin
import typingsSlinky.bugsnagJs.commonMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bugsnag-js/types/global", JSImport.Namespace)
@js.native
object globalMod extends js.Object {
  
  // two ways to call the exported function: apiKey or config object
  def apply(apiKeyOrOpts: String): Client = js.native
  def apply(apiKeyOrOpts: String, plugins: js.Array[IPlugin]): Client = js.native
  def apply(apiKeyOrOpts: IConfig): Client = js.native
  def apply(apiKeyOrOpts: IConfig, plugins: js.Array[IPlugin]): Client = js.native
}
