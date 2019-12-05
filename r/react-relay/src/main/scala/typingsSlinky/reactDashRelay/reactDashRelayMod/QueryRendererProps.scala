package typingsSlinky.reactDashRelay.reactDashRelayMod

import slinky.core.TagMod
import typingsSlinky.reactDashRelay.Anon_Error
import typingsSlinky.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRendererProps[TOperation /* <: OperationType */] extends js.Object {
  var environment: typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
  var query: js.UndefOr[GraphQLTaggedNode | Null] = js.undefined
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  def render(renderProps: Anon_Error[TOperation]): TagMod[Any]
}

object QueryRendererProps {
  @scala.inline
  def apply[TOperation /* <: OperationType */](
    environment: typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    render: Anon_Error[TOperation] => TagMod[Any],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any,
    query: GraphQLTaggedNode = null
  ): QueryRendererProps[TOperation] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRendererProps[TOperation]]
  }
}

