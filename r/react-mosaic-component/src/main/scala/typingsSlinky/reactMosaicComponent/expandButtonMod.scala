package typingsSlinky.reactMosaicComponent

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMosaicComponent.contextTypesMod.MosaicWindowContext
import typingsSlinky.reactMosaicComponent.mosaicButtonMod.MosaicButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/buttons/ExpandButton", JSImport.Namespace)
@js.native
object expandButtonMod extends js.Object {
  @js.native
  class ExpandButton ()
    extends Component[MosaicButtonProps, js.Object, js.Any] {
    @JSName("context")
    var context_ExpandButton: MosaicWindowContext = js.native
    var createExpand: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ExpandButton extends js.Object {
    var contextType: Context[MosaicWindowContext] = js.native
  }
  
}

