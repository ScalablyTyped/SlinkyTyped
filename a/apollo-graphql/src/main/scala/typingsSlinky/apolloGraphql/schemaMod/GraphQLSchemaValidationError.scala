package typingsSlinky.apolloGraphql.schemaMod

import typingsSlinky.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-graphql/lib/schema", "GraphQLSchemaValidationError")
@js.native
class GraphQLSchemaValidationError protected ()
  extends typingsSlinky.apolloGraphql.graphQLSchemaValidationErrorMod.GraphQLSchemaValidationError {
  def this(errors: js.Array[GraphQLError]) = this()
}
