package typingsSlinky.reactMosaicComponent.mosaicWindowMod

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMosaicComponent.anon.PartialInternalMosaicWind
import typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicContext
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/MosaicWindow", "InternalMosaicWindow")
@js.native
class InternalMosaicWindow[T /* <: MosaicKey */] ()
  extends Component[InternalMosaicWindowProps[T], InternalMosaicWindowState, js.Any] {
  var checkCreateNode: js.Any = js.native
  val childContext: js.Any = js.native
  var connectDragSource: js.Any = js.native
  @JSName("context")
  var context_InternalMosaicWindow: MosaicContext[T] = js.native
  var getPath: js.Any = js.native
  var getToolbarControls: js.Any = js.native
  var renderDropTarget: js.Any = js.native
  var renderToolbar: js.Any = js.native
  var rootElement: js.Any = js.native
  var setAdditionalControlsOpen: js.Any = js.native
  var split: js.Any = js.native
  var swap: js.Any = js.native
}

/* static members */
@JSImport("react-mosaic-component/lib/MosaicWindow", "InternalMosaicWindow")
@js.native
object InternalMosaicWindow extends js.Object {
  var contextType: Context[MosaicContext[String | Double]] = js.native
  var defaultProps: PartialInternalMosaicWind = js.native
}

