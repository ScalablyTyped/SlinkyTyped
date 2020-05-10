package typingsSlinky.apolloReactComponents.typesMod

import slinky.core.facade.ReactElement
import typingsSlinky.apolloReactCommon.typesMod.QueryFunctionOptions
import typingsSlinky.apolloReactCommon.typesMod.QueryResult
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryComponentOptions[TData, TVariables] extends QueryFunctionOptions[TData, TVariables] {
  var query: DocumentNode = js.native
  def children(result: QueryResult[TData, TVariables]): ReactElement | Null = js.native
}

object QueryComponentOptions {
  @scala.inline
  def apply[TData, TVariables](children: QueryResult[TData, TVariables] => ReactElement | Null, query: DocumentNode): QueryComponentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryComponentOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryComponentOptionsOps[Self[tdata, tvariables] <: QueryComponentOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withChildren(value: QueryResult[TData, TVariables] => ReactElement | Null): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuery(value: DocumentNode): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

