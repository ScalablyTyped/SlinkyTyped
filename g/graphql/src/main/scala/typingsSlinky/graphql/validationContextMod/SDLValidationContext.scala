package typingsSlinky.graphql.validationContextMod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "SDLValidationContext")
@js.native
class SDLValidationContext protected () extends ASTValidationContext {
  def this(
    ast: DocumentNode,
    schema: Maybe[GraphQLSchema],
    onError: js.Function1[/* err */ GraphQLError, Unit]
  ) = this()
  def getSchema(): Maybe[GraphQLSchema] = js.native
}

