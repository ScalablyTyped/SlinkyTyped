package typingsSlinky.reactMosaicComponent

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicWindowContext
import typingsSlinky.reactMosaicComponent.mosaicButtonMod.MosaicButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/buttons/SplitButton", JSImport.Namespace)
@js.native
object splitButtonMod extends js.Object {
  @js.native
  class SplitButton ()
    extends Component[MosaicButtonProps, js.Object, js.Any] {
    @JSName("context")
    var context_SplitButton: MosaicWindowContext = js.native
    var split: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SplitButton extends js.Object {
    var contextType: Context[MosaicWindowContext] = js.native
  }
  
}

