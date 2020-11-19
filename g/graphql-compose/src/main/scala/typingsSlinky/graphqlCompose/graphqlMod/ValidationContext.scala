package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/graphql", "ValidationContext")
@js.native
class ValidationContext protected ()
  extends typingsSlinky.graphql.mod.ValidationContext {
  def this(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo,
    onError: js.Function1[/* err */ typingsSlinky.graphql.graphQLErrorMod.GraphQLError, Unit]
  ) = this()
}
