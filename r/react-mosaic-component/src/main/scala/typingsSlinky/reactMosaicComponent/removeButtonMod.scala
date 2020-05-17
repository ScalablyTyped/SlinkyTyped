package typingsSlinky.reactMosaicComponent

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicWindowContext
import typingsSlinky.reactMosaicComponent.mosaicButtonMod.MosaicButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/buttons/RemoveButton", JSImport.Namespace)
@js.native
object removeButtonMod extends js.Object {
  @js.native
  class RemoveButton ()
    extends Component[MosaicButtonProps, js.Object, js.Any] {
    @JSName("context")
    var context_RemoveButton: MosaicWindowContext = js.native
    var createRemove: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object RemoveButton extends js.Object {
    var contextType: Context[MosaicWindowContext] = js.native
  }
  
}

