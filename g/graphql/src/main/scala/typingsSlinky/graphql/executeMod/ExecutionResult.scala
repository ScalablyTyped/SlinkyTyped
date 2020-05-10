package typingsSlinky.graphql.executeMod

import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionResult[TData] extends js.Object {
  var data: js.UndefOr[TData | Null] = js.native
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
}

object ExecutionResult {
  @scala.inline
  def apply[TData](): ExecutionResult[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionResult[TData]]
  }
  @scala.inline
  implicit class ExecutionResultOps[Self[tdata] <: ExecutionResult[tdata], TData] (val x: Self[TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TData] with Other]
    @scala.inline
    def withData(value: TData): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataNull: Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[GraphQLError]): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

