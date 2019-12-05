package typingsSlinky.apolloDashServerDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apolloDashServerDashTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.document
  import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.operation
  import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.operationName
  import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.queryHash
  import typingsSlinky.graphql.graphqlMod.ValidationContext
  import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Required

  type GraphQLExecutor[TContext] = js.Function1[
    /* requestContext */ WithRequired[GraphQLRequestContext[TContext], document | operationName | operation | queryHash], 
    ValueOrPromise[GraphQLExecutionResult]
  ]
  type ValidationRule = js.Function1[/* context */ ValidationContext, ASTVisitor]
  type ValueOrPromise[T] = T | js.Promise[T]
  type VariableValues = StringDictionary[js.Any]
  type WithRequired[T, K /* <: String */] = T with (Required[Pick[T, K]])
}
