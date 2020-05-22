package typingsSlinky.apolloClient.queriesMod

import typingsSlinky.apolloClient.networkStatusMod.NetworkStatus
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStoreValue extends js.Object {
  var document: DocumentNode
  var graphQLErrors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var metadata: js.Any
  var networkError: js.UndefOr[js.Error | Null] = js.undefined
  var networkStatus: NetworkStatus
  var previousVariables: js.UndefOr[js.Object | Null] = js.undefined
  var variables: js.Object
}

object QueryStoreValue {
  @scala.inline
  def apply(
    document: DocumentNode,
    metadata: js.Any,
    networkStatus: NetworkStatus,
    variables: js.Object,
    graphQLErrors: js.Array[GraphQLError] = null,
    networkError: js.UndefOr[Null | js.Error] = js.undefined,
    previousVariables: js.UndefOr[Null | js.Object] = js.undefined
  ): QueryStoreValue = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (graphQLErrors != null) __obj.updateDynamic("graphQLErrors")(graphQLErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(networkError)) __obj.updateDynamic("networkError")(networkError.asInstanceOf[js.Any])
    if (!js.isUndefined(previousVariables)) __obj.updateDynamic("previousVariables")(previousVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStoreValue]
  }
}

