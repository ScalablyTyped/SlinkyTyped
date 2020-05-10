package typingsSlinky.apolloClient.observableQueryMod

import typingsSlinky.apolloClient.apolloErrorMod.ApolloError
import typingsSlinky.apolloClient.networkStatusMod.NetworkStatus
import typingsSlinky.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloCurrentResult[T] extends js.Object {
  var data: T | js.Object = js.native
  var error: js.UndefOr[ApolloError] = js.native
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var loading: Boolean = js.native
  var networkStatus: NetworkStatus = js.native
  var partial: js.UndefOr[Boolean] = js.native
}

object ApolloCurrentResult {
  @scala.inline
  def apply[T](data: T | js.Object, loading: Boolean, networkStatus: NetworkStatus): ApolloCurrentResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloCurrentResult[T]]
  }
  @scala.inline
  implicit class ApolloCurrentResultOps[Self[t] <: ApolloCurrentResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: T | js.Object): Self[T] = {
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
    def withError(value: ApolloError): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
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
    @scala.inline
    def withPartial(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartial: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(js.undefined)
        ret
    }
  }
  
}

