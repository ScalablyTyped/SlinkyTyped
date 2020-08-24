package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/print-schema-with-directives", JSImport.Namespace)
@js.native
object printSchemaWithDirectivesMod extends js.Object {
  def printSchemaWithDirectives(schema: GraphQLSchema): String = js.native
  def printSchemaWithDirectives(schema: GraphQLSchema, _options: SchemaPrintOptions): String = js.native
}

