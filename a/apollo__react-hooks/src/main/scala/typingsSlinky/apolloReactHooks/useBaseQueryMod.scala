package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloReactCommon.typesMod.QueryResult
import typingsSlinky.apolloReactHooks.typesMod.QueryHookOptions
import typingsSlinky.apolloReactHooks.typesMod.QueryTuple
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hooks/lib/utils/useBaseQuery", JSImport.Namespace)
@js.native
object useBaseQueryMod extends js.Object {
  
  def useBaseQuery[TData, TVariables](query: DocumentNode): (QueryTuple[TData, TVariables]) | (QueryResult[TData, TVariables]) = js.native
  def useBaseQuery[TData, TVariables](query: DocumentNode, options: js.UndefOr[scala.Nothing], `lazy`: Boolean): (QueryTuple[TData, TVariables]) | (QueryResult[TData, TVariables]) = js.native
  def useBaseQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): (QueryTuple[TData, TVariables]) | (QueryResult[TData, TVariables]) = js.native
  def useBaseQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables], `lazy`: Boolean): (QueryTuple[TData, TVariables]) | (QueryResult[TData, TVariables]) = js.native
}
