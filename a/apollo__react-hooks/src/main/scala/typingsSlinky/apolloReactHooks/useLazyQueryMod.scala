package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloReactHooks.typesMod.LazyQueryHookOptions
import typingsSlinky.apolloReactHooks.typesMod.QueryTuple
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hooks/lib/useLazyQuery", JSImport.Namespace)
@js.native
object useLazyQueryMod extends js.Object {
  
  def useLazyQuery[TData, TVariables](query: DocumentNode): QueryTuple[TData, TVariables] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode, options: LazyQueryHookOptions[TData, TVariables]): QueryTuple[TData, TVariables] = js.native
}
