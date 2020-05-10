package typingsSlinky.apolloClient.watchQueryOptionsMod

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions[TVariables] extends QueryBaseOptions[TVariables] {
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
}

object QueryOptions {
  @scala.inline
  def apply[TVariables](query: DocumentNode): QueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions[TVariables]]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self[tvariables] <: QueryOptions[tvariables], TVariables] (val x: Self[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TVariables] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TVariables] with Other]
    @scala.inline
    def withFetchPolicy(value: FetchPolicy): Self[TVariables] = {
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
  }
  
}

