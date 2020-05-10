package typingsSlinky.apolloClient.queryManagerMod

import typingsSlinky.apolloCache.typesCacheMod.Cache.DiffResult
import typingsSlinky.apolloClient.observableMod.Subscription
import typingsSlinky.apolloClient.observableQueryMod.ObservableQuery
import typingsSlinky.apolloClient.typesMod.OperationVariables
import typingsSlinky.apolloClient.typesMod.QueryListener
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryInfo extends js.Object {
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  var document: DocumentNode | Null = js.native
  var invalidated: Boolean = js.native
  var lastRequestId: Double = js.native
  var listeners: Set[QueryListener] = js.native
  var newData: DiffResult[_] | Null = js.native
  var observableQuery: (ObservableQuery[_, OperationVariables]) | Null = js.native
  var subscriptions: Set[Subscription] = js.native
}

object QueryInfo {
  @scala.inline
  def apply(
    invalidated: Boolean,
    lastRequestId: Double,
    listeners: Set[QueryListener],
    subscriptions: Set[Subscription]
  ): QueryInfo = {
    val __obj = js.Dynamic.literal(invalidated = invalidated.asInstanceOf[js.Any], lastRequestId = lastRequestId.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInfo]
  }
  @scala.inline
  implicit class QueryInfoOps[Self <: QueryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRequestId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListeners(value: Set[QueryListener]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: Set[Subscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: DocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(null)
        ret
    }
    @scala.inline
    def withNewData(value: DiffResult[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(null)
        ret
    }
    @scala.inline
    def withObservableQuery(value: ObservableQuery[_, OperationVariables]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observableQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservableQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observableQuery")(null)
        ret
    }
  }
  
}

