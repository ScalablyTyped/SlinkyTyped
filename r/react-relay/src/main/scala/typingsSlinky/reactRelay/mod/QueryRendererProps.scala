package typingsSlinky.reactRelay.mod

import slinky.core.TagMod
import typingsSlinky.reactRelay.AnonError
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRendererProps[TOperation /* <: OperationType */] extends js.Object {
  var environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
  var query: js.UndefOr[GraphQLTaggedNode | Null] = js.undefined
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  def render(renderProps: AnonError[TOperation]): TagMod[Any]
}

object QueryRendererProps {
  @scala.inline
  def apply[TOperation /* <: OperationType */](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    render: AnonError[TOperation] => TagMod[Any],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any,
    query: GraphQLTaggedNode = null
  ): QueryRendererProps[TOperation] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRendererProps[TOperation]]
  }
}

