package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloReactCommon.typesMod.QueryResult
import typingsSlinky.apolloReactHooks.typesMod.QueryHookOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useQuery", JSImport.Namespace)
@js.native
object useQueryMod extends js.Object {
  def useQuery[TData, TVariables](query: DocumentNode): QueryResult[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): QueryResult[TData, TVariables] = js.native
}

