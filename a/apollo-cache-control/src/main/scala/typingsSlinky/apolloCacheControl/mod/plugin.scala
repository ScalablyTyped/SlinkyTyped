package typingsSlinky.apolloCacheControl.mod

import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsSlinky.apolloServerTypes.mod.BaseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-cache-control", "plugin")
@js.native
object plugin extends js.Object {
  
  def apply(): ApolloServerPlugin[BaseContext] = js.native
  def apply(options: CacheControlExtensionOptions): ApolloServerPlugin[BaseContext] = js.native
}
