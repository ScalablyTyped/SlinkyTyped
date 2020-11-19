package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteQueryResult[TResult, TMoreVariable]
  extends QueryResultBase[js.Array[TResult]] {
  
  var canFetchMore: js.UndefOr[Boolean] = js.native
  
  var data: js.Array[TResult] = js.native
  
  def fetchMore(): js.UndefOr[js.Promise[js.Array[TResult]]] = js.native
  def fetchMore(moreVariable: TMoreVariable): js.UndefOr[js.Promise[js.Array[TResult]]] = js.native
  @JSName("fetchMore")
  def fetchMore_false(moreVariable: `false`): js.UndefOr[js.Promise[js.Array[TResult]]] = js.native
  
  var isFetchingMore: Boolean = js.native
}
