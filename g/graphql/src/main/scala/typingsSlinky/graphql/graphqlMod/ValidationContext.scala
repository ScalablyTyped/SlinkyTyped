package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "ValidationContext")
@js.native
class ValidationContext protected ()
  extends typingsSlinky.graphql.validationMod.ValidationContext {
  def this(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo
  ) = this()
  def this(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo,
    onError: js.Function1[/* err */ typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError, Unit]
  ) = this()
}

