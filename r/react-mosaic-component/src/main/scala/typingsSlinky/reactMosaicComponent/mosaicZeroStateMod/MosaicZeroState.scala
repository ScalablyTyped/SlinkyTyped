package typingsSlinky.reactMosaicComponent.mosaicZeroStateMod

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicContext
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/MosaicZeroState", "MosaicZeroState")
@js.native
class MosaicZeroState[T /* <: MosaicKey */] ()
  extends Component[MosaicZeroStateProps[T], js.Object, js.Any] {
  @JSName("context")
  var context_MosaicZeroState: MosaicContext[T] = js.native
  var replace: js.Any = js.native
}

/* static members */
@JSImport("react-mosaic-component/lib/MosaicZeroState", "MosaicZeroState")
@js.native
object MosaicZeroState extends js.Object {
  var contextType: Context[MosaicContext[String | Double]] = js.native
}

