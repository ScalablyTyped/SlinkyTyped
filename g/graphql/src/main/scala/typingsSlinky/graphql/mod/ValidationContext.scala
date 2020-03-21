package typingsSlinky.graphql.mod

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "ValidationContext")
@js.native
class ValidationContext protected ()
  extends typingsSlinky.graphql.validationMod.ValidationContext {
  def this(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo
  ) = this()
  def this(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo,
    onError: js.Function1[/* err */ typingsSlinky.graphql.graphQLErrorMod.GraphQLError, Unit]
  ) = this()
}

