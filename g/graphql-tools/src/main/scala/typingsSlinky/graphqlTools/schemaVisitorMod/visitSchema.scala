package typingsSlinky.graphqlTools.schemaVisitorMod

import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", "visitSchema")
@js.native
object visitSchema extends js.Object {
  def apply(
    schema: GraphQLSchema,
    visitorSelector: js.Function2[/* type */ VisitableSchemaType, /* methodName */ String, js.Array[SchemaVisitor]]
  ): GraphQLSchema = js.native
}

