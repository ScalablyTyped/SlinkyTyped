package typingsSlinky.reactRelay.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactRelay.AnonCacheConfig
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "QueryRenderer")
@js.native
class QueryRenderer[TOperation /* <: OperationType */] ()
  extends Component[AnonCacheConfig with QueryRendererProps[TOperation], js.Object, js.Any]

