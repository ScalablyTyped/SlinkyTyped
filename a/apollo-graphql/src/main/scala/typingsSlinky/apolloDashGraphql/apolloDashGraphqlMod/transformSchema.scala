package typingsSlinky.apolloDashGraphql.apolloDashGraphqlMod

import typingsSlinky.apolloDashGraphql.libSchemaTransformSchemaMod.TypeTransformer
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql", "transformSchema")
@js.native
object transformSchema extends js.Object {
  def apply(schema: GraphQLSchema, transformType: TypeTransformer): GraphQLSchema = js.native
}

