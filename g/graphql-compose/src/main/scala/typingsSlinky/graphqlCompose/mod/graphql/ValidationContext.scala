package typingsSlinky.graphqlCompose.mod.graphql

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose", "graphql.ValidationContext")
@js.native
class ValidationContext protected ()
  extends typingsSlinky.graphqlCompose.graphqlMod.ValidationContext {
  def this(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo,
    onError: js.Function1[/* err */ typingsSlinky.graphql.graphQLErrorMod.GraphQLError, Unit]
  ) = this()
}
