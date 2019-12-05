package typingsSlinky.graphql.validationValidationContextMod

import typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "SDLValidationContext")
@js.native
class SDLValidationContext protected () extends ASTValidationContext {
  def this(ast: DocumentNode, schema: Maybe[GraphQLSchema]) = this()
  def this(
    ast: DocumentNode,
    schema: Maybe[GraphQLSchema],
    onError: js.Function1[/* err */ GraphQLError, Unit]
  ) = this()
  def getSchema(): Maybe[GraphQLSchema] = js.native
}

