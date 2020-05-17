package typingsSlinky.reactMosaicComponent.mosaicRootMod

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicContext
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/MosaicRoot", "MosaicRoot")
@js.native
class MosaicRoot[T /* <: MosaicKey */] ()
  extends Component[MosaicRootProps[T], js.Object, js.Any] {
  @JSName("context")
  var context_MosaicRoot: MosaicContext[T] = js.native
  var onResize: js.Any = js.native
  var renderRecursively: js.Any = js.native
  var renderSplit: js.Any = js.native
}

/* static members */
@JSImport("react-mosaic-component/lib/MosaicRoot", "MosaicRoot")
@js.native
object MosaicRoot extends js.Object {
  var contextType: Context[MosaicContext[String | Double]] = js.native
}

