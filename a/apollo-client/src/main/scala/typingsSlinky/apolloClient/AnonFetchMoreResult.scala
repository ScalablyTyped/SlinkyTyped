package typingsSlinky.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFetchMoreResult[TData, TVariables] extends js.Object {
  var fetchMoreResult: js.UndefOr[TData] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object AnonFetchMoreResult {
  @scala.inline
  def apply[TData, TVariables](): AnonFetchMoreResult[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFetchMoreResult[TData, TVariables]]
  }
  @scala.inline
  implicit class AnonFetchMoreResultOps[Self[tdata, tvariables] <: AnonFetchMoreResult[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withFetchMoreResult(value: TData): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMoreResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchMoreResult: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMoreResult")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

