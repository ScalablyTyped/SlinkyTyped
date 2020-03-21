package typingsSlinky.reactRelay.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactRelay.AnonError
import typingsSlinky.reactRelay.mod.QueryRendererProps
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocalQueryRenderer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactRelay.mod.LocalQueryRenderer[js.Any]] {
  @JSImport("react-relay", "LocalQueryRenderer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[TOperation /* <: OperationType */](
    environment: Environment,
    render: AnonError[TOperation] => TagMod[Any],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any,
    query: GraphQLTaggedNode = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactRelay.mod.LocalQueryRenderer[js.Any]] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactRelay.mod.LocalQueryRenderer[js.Any]]]
  }
  type Props = QueryRendererProps[js.Any]
}

