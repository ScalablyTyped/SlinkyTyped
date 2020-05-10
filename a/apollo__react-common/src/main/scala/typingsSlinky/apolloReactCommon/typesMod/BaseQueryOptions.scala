package typingsSlinky.apolloReactCommon.typesMod

import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typingsSlinky.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseQueryOptions[TVariables] extends js.Object {
  var client: js.UndefOr[default[_]] = js.native
  var context: js.UndefOr[Context] = js.native
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.native
  var fetchPolicy: js.UndefOr[WatchQueryFetchPolicy] = js.native
  var notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.native
  var partialRefetch: js.UndefOr[Boolean] = js.native
  var pollInterval: js.UndefOr[Double] = js.native
  var returnPartialData: js.UndefOr[Boolean] = js.native
  var ssr: js.UndefOr[Boolean] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object BaseQueryOptions {
  @scala.inline
  def apply[TVariables](): BaseQueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseQueryOptions[TVariables]]
  }
  @scala.inline
  implicit class BaseQueryOptionsOps[Self[tvariables] <: BaseQueryOptions[tvariables], TVariables] (val x: Self[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TVariables] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TVariables] with Other]
    @scala.inline
    def withClient(value: default[_]): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: Context): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorPolicy(value: ErrorPolicy): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorPolicy: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchPolicy(value: WatchQueryFetchPolicy): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchPolicy: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyOnNetworkStatusChange(value: Boolean): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOnNetworkStatusChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyOnNetworkStatusChange: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOnNetworkStatusChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialRefetch(value: Boolean): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialRefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialRefetch: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialRefetch")(js.undefined)
        ret
    }
    @scala.inline
    def withPollInterval(value: Double): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollInterval: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnPartialData(value: Boolean): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPartialData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnPartialData: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPartialData")(js.undefined)
        ret
    }
    @scala.inline
    def withSsr(value: Boolean): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsr: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssr")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

