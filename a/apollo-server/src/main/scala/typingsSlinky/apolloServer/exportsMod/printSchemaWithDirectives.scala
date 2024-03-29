package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "printSchemaWithDirectives")
@js.native
object printSchemaWithDirectives extends js.Object {
  
  def apply(schema: GraphQLSchema): String = js.native
  def apply(schema: GraphQLSchema, _options: SchemaPrintOptions): String = js.native
}
