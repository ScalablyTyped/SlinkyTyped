package typingsSlinky.apolloServerCore.typesMod

import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin[typingsSlinky.std.Record[java.lang.String, js.Any]]
  - js.Function0[
typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin[typingsSlinky.std.Record[java.lang.String, js.Any]]]
*/
trait PluginDefinition extends js.Object

object PluginDefinition {
  @scala.inline
  implicit def apply(value: ApolloServerPlugin[Record[String, js.Any]]): PluginDefinition = value.asInstanceOf[PluginDefinition]
  @scala.inline
  implicit def apply(value: js.Function0[ApolloServerPlugin[Record[String, js.Any]]]): PluginDefinition = value.asInstanceOf[PluginDefinition]
}

