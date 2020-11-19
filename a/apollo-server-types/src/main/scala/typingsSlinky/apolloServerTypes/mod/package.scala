package typingsSlinky.apolloServerTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type AnyFunctionMap = org.scalablytyped.runtime.StringDictionary[js.UndefOr[typingsSlinky.apolloServerTypes.mod.AnyFunction]]
  
  type BaseContext = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type Fauxpaque[K, T] = K with typingsSlinky.apolloServerTypes.anon.Fauxpaque[T]
  
  type GraphQLExecutor[TContext] = js.Function1[
    /* requestContext */ typingsSlinky.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart[TContext], 
    typingsSlinky.apolloServerTypes.mod.ValueOrPromise[typingsSlinky.apolloServerTypes.mod.GraphQLExecutionResult]
  ]
  
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typingsSlinky.apolloServerTypes.apolloServerTypesStrings.Mutable with org.scalablytyped.runtime.TopLevel[T]
  
  type SchemaHash = typingsSlinky.apolloServerTypes.mod.Fauxpaque[
    java.lang.String, 
    typingsSlinky.apolloServerTypes.apolloServerTypesStrings.SchemaHash
  ]
  
  type ValidationRule = js.Function1[
    /* context */ typingsSlinky.graphql.mod.ValidationContext, 
    typingsSlinky.graphql.visitorMod.ASTVisitor
  ]
  
  type ValueOrPromise[T] = T | js.Promise[T]
  
  type VariableValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type WithRequired[T, K /* <: /* keyof T */ java.lang.String */] = T with (typingsSlinky.std.Required[typingsSlinky.std.Pick[T, K]])
}
