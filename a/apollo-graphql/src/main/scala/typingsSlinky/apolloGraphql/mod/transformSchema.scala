package typingsSlinky.apolloGraphql.mod

import typingsSlinky.apolloGraphql.transformSchemaMod.TypeTransformer
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-graphql", "transformSchema")
@js.native
object transformSchema extends js.Object {
  
  def apply(schema: GraphQLSchema, transformType: TypeTransformer): GraphQLSchema = js.native
}
