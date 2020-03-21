package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloReactCommon.typesMod.QueryResult
import typingsSlinky.apolloReactHooks.typesMod.LazyQueryHookOptions
import typingsSlinky.apolloReactHooks.typesMod.QueryLazyOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useLazyQuery", JSImport.Namespace)
@js.native
object useLazyQueryMod extends js.Object {
  def useLazyQuery[TData, TVariables](query: DocumentNode): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode, options: LazyQueryHookOptions[TData, TVariables]): js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ] = js.native
}

