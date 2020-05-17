package typingsSlinky.reactMosaicComponent

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicWindowContext
import typingsSlinky.reactMosaicComponent.mosaicButtonMod.MosaicButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/buttons/ReplaceButton", JSImport.Namespace)
@js.native
object replaceButtonMod extends js.Object {
  @js.native
  class ReplaceButton ()
    extends Component[MosaicButtonProps, js.Object, js.Any] {
    @JSName("context")
    var context_ReplaceButton: MosaicWindowContext = js.native
    var replace: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ReplaceButton extends js.Object {
    var contextType: Context[MosaicWindowContext] = js.native
  }
  
}

