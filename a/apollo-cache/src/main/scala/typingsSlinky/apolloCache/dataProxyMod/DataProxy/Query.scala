package typingsSlinky.apolloCache.dataProxyMod.DataProxy

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[TVariables] extends js.Object {
  var query: DocumentNode = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object Query {
  @scala.inline
  def apply[TVariables](query: DocumentNode): Query[TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query[TVariables]]
  }
  @scala.inline
  implicit class QueryOps[Self[tvariables] <: Query[tvariables], TVariables] (val x: Self[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TVariables] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TVariables] with Other]
    @scala.inline
    def withQuery(value: DocumentNode): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
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

