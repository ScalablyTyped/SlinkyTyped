package typingsSlinky.apolloReactHooks.typesMod

import slinky.core.TagMod
import typingsSlinky.apolloReactCommon.typesMod.QueryFunctionOptions
import typingsSlinky.apolloReactCommon.typesMod.QueryResult
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions[TData, TVariables] extends QueryFunctionOptions[TData, TVariables] {
  var children: js.UndefOr[js.Function1[/* result */ QueryResult[TData, TVariables], TagMod[Any]]] = js.native
  var query: DocumentNode = js.native
}

object QueryOptions {
  @scala.inline
  def apply[TData, TVariables](query: DocumentNode): QueryOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self[tdata, tvariables] <: QueryOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
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
    def withChildren(value: /* result */ QueryResult[TData, TVariables] => TagMod[Any]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

