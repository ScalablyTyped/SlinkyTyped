package typingsSlinky.apolloClient.typesMod

import typingsSlinky.apolloClient.networkStatusMod.NetworkStatus
import typingsSlinky.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloQueryResult[T] extends js.Object {
  var data: T = js.native
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var loading: Boolean = js.native
  var networkStatus: NetworkStatus = js.native
  var stale: Boolean = js.native
}

object ApolloQueryResult {
  @scala.inline
  def apply[T](data: T, loading: Boolean, networkStatus: NetworkStatus, stale: Boolean): ApolloQueryResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloQueryResult[T]]
  }
  @scala.inline
  implicit class ApolloQueryResultOps[Self[t] <: ApolloQueryResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkStatus(value: NetworkStatus): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStale(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[GraphQLError]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

