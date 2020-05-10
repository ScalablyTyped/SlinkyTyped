package typingsSlinky.apolloClient.watchQueryOptionsMod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMoreQueryOptions[TVariables, K /* <: /* keyof TVariables */ String */] extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var query: js.UndefOr[DocumentNode] = js.native
  var variables: js.UndefOr[Pick[TVariables, K]] = js.native
}

object FetchMoreQueryOptions {
  @scala.inline
  def apply[TVariables, K](): FetchMoreQueryOptions[TVariables, K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchMoreQueryOptions[TVariables, K]]
  }
  @scala.inline
  implicit class FetchMoreQueryOptionsOps[Self[tvariables, k] <: FetchMoreQueryOptions[tvariables, k], TVariables, K] (val x: Self[TVariables, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TVariables, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TVariables, K]) with Other]
    @scala.inline
    def withContext(value: js.Any): Self[TVariables, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TVariables, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: DocumentNode): Self[TVariables, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self[TVariables, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: Pick[TVariables, K]): Self[TVariables, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TVariables, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

