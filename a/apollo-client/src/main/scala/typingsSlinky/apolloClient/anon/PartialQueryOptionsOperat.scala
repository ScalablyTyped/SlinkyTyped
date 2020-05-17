package typingsSlinky.apolloClient.anon

import typingsSlinky.apolloClient.typesMod.OperationVariables
import typingsSlinky.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typingsSlinky.apolloClient.watchQueryOptionsMod.FetchPolicy
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<apollo-client.apollo-client/core/watchQueryOptions.QueryOptions<apollo-client.apollo-client/core/types.OperationVariables>> */
@js.native
trait PartialQueryOptionsOperat extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.native
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
  var fetchResults: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var query: js.UndefOr[DocumentNode] = js.native
  var variables: js.UndefOr[OperationVariables] = js.native
}

object PartialQueryOptionsOperat {
  @scala.inline
  def apply(): PartialQueryOptionsOperat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialQueryOptionsOperat]
  }
  @scala.inline
  implicit class PartialQueryOptionsOperatOps[Self <: PartialQueryOptionsOperat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorPolicy(value: ErrorPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchPolicy(value: FetchPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: DocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: OperationVariables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

