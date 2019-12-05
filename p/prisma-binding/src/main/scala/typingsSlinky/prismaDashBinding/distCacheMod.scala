package typingsSlinky.prismaDashBinding

import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.prismaDashBinding.distSharedLinkMod.SharedLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/cache", JSImport.Namespace)
@js.native
object distCacheMod extends js.Object {
  def getCachedRemoteSchema(endpoint: String, typeDefs: String, link: SharedLink): GraphQLSchema = js.native
  def getCachedRemoteSchema(endpoint: String, typeDefs: String, link: SharedLink, disableCache: Boolean): GraphQLSchema = js.native
  def getCachedTypeDefs(schemaPath: String): String = js.native
  def getCachedTypeDefs(schemaPath: String, disableCache: Boolean): String = js.native
}

