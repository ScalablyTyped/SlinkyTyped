package typingsSlinky.apolloClient.watchQueryOptionsMod

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchQueryOptions[TVariables] extends ModifiableWatchQueryOptions[TVariables] {
  var fetchPolicy: js.UndefOr[WatchQueryFetchPolicy] = js.native
}

object WatchQueryOptions {
  @scala.inline
  def apply[TVariables](query: DocumentNode): WatchQueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchQueryOptions[TVariables]]
  }
  @scala.inline
  implicit class WatchQueryOptionsOps[Self[tvariables] <: WatchQueryOptions[tvariables], TVariables] (val x: Self[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TVariables] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TVariables] with Other]
    @scala.inline
    def withFetchPolicy(value: WatchQueryFetchPolicy): Self[TVariables] = {
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

