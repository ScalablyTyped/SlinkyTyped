package typingsSlinky.apolloClient.queriesMod

import typingsSlinky.apolloClient.networkStatusMod.NetworkStatus
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStoreValue extends js.Object {
  var document: DocumentNode = js.native
  var graphQLErrors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var metadata: js.Any = js.native
  var networkError: js.UndefOr[js.Error | Null] = js.native
  var networkStatus: NetworkStatus = js.native
  var previousVariables: js.UndefOr[js.Object | Null] = js.native
  var variables: js.Object = js.native
}

object QueryStoreValue {
  @scala.inline
  def apply(document: DocumentNode, metadata: js.Any, networkStatus: NetworkStatus, variables: js.Object): QueryStoreValue = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStoreValue]
  }
  @scala.inline
  implicit class QueryStoreValueOps[Self <: QueryStoreValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: DocumentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkStatus(value: NetworkStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphQLErrors(value: js.Array[GraphQLError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphQLErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphQLErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphQLErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkError")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkError")(null)
        ret
    }
    @scala.inline
    def withPreviousVariables(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousVariablesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousVariables")(null)
        ret
    }
  }
  
}

