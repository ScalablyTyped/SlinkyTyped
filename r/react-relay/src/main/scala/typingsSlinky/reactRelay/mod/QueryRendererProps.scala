package typingsSlinky.reactRelay.mod

import slinky.core.TagMod
import typingsSlinky.reactRelay.anon.Error
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRendererProps[TOperation /* <: OperationType */] extends js.Object {
  var environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
  var query: js.UndefOr[GraphQLTaggedNode | Null] = js.undefined
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  def render(renderProps: Error[TOperation]): TagMod[Any]
}

object QueryRendererProps {
  @scala.inline
  def apply[TOperation](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    render: Error[TOperation] => TagMod[Any],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any,
    query: js.UndefOr[Null | GraphQLTaggedNode] = js.undefined
  ): QueryRendererProps[TOperation] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRendererProps[TOperation]]
  }
}

