package typingsSlinky.apolloReactHooks.anon

import typingsSlinky.apolloClient.mod.ApolloError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error[TVariables, TData] extends js.Object {
  var data: js.UndefOr[TData] = js.native
  var error: js.UndefOr[ApolloError] = js.native
  var loading: Boolean = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object Error {
  @scala.inline
  def apply[TVariables, TData](loading: Boolean): Error[TVariables, TData] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error[TVariables, TData]]
  }
  @scala.inline
  implicit class ErrorOps[Self[tvariables, tdata] <: Error[tvariables, tdata], TVariables, TData] (val x: Self[TVariables, TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables, TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables, TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TVariables, TData]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TVariables, TData]) with Other]
    @scala.inline
    def withLoading(value: Boolean): Self[TVariables, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: TData): Self[TVariables, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TVariables, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: ApolloError): Self[TVariables, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[TVariables, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TVariables, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TVariables, TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

