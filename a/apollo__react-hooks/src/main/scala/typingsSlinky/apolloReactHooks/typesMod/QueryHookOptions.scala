package typingsSlinky.apolloReactHooks.typesMod

import typingsSlinky.apolloReactCommon.typesMod.QueryFunctionOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryHookOptions[TData, TVariables] extends QueryFunctionOptions[TData, TVariables] {
  var query: js.UndefOr[DocumentNode] = js.native
}

object QueryHookOptions {
  @scala.inline
  def apply[TData, TVariables](): QueryHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryHookOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryHookOptionsOps[Self[tdata, tvariables] <: QueryHookOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withQuery(value: DocumentNode): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}

