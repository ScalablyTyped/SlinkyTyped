package typingsSlinky.apolloReactCommon.typesMod

import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @apollo/react-common.@apollo/react-common/lib/types/types.ExecutionResult<TData> & {  extensions ? :E,   context ? :C} */
@js.native
trait MutationFetchResult[TData, C, E] extends js.Object {
  var context: js.UndefOr[C] = js.native
  var data: js.UndefOr[TData] = js.native
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var extensions: js.UndefOr[(Record[String, _]) with E] = js.native
}

object MutationFetchResult {
  @scala.inline
  def apply[TData, C, E](): MutationFetchResult[TData, C, E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationFetchResult[TData, C, E]]
  }
  @scala.inline
  implicit class MutationFetchResultOps[Self[tdata, c, e] <: MutationFetchResult[tdata, c, e], TData, C, E] (val x: Self[TData, C, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, C, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, C, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, C, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, C, E]) with Other]
    @scala.inline
    def withContext(value: C): Self[TData, C, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TData, C, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: TData): Self[TData, C, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TData, C, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[GraphQLError]): Self[TData, C, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self[TData, C, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: (Record[String, _]) with E): Self[TData, C, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self[TData, C, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
  }
  
}

