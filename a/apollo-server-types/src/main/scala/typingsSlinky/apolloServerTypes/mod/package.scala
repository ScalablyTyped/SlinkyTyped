package typingsSlinky.apolloServerTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GraphQLExecutor[TContext] = js.Function1[
    /* requestContext */ typingsSlinky.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart[TContext], 
    typingsSlinky.apolloServerTypes.mod.ValueOrPromise[typingsSlinky.apolloServerTypes.mod.GraphQLExecutionResult]
  ]
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typingsSlinky.apolloServerTypes.apolloServerTypesStrings.Mutable with org.scalablytyped.runtime.TopLevel[T]
  type ValidationRule = js.Function1[
    /* context */ typingsSlinky.graphql.mod.ValidationContext, 
    typingsSlinky.graphql.visitorMod.ASTVisitor
  ]
  type ValueOrPromise[T] = T | js.Promise[T]
  type VariableValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type WithRequired[T, K /* <: /* keyof T */ java.lang.String */] = T with (typingsSlinky.std.Required[typingsSlinky.std.Pick[T, K]])
}
