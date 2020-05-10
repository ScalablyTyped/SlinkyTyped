package typingsSlinky.apolloLink.typesMod

import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/execution/execute.ExecutionResult<TData> & {  extensions ? :E,   context ? :C} */
@js.native
trait FetchResult[TData, C, E] extends js.Object {
  var context: js.UndefOr[C] = js.native
  var data: js.UndefOr[TData | Null] = js.native
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var extensions: js.UndefOr[E] = js.native
}

object FetchResult {
  @scala.inline
  def apply[TData, C, E](): FetchResult[TData, C, E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchResult[TData, C, E]]
  }
  @scala.inline
  implicit class FetchResultOps[Self[tdata, c, e] <: FetchResult[tdata, c, e], TData, C, E] (val x: Self[TData, C, E]) extends AnyVal {
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
    def withDataNull: Self[TData, C, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
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
    def withExtensions(value: E): Self[TData, C, E] = {
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

