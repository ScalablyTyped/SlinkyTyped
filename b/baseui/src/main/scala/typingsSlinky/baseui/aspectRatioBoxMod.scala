package typingsSlinky.baseui

import slinky.core.ReactComponentClass
import typingsSlinky.baseui.blockMod.BlockProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/aspect-ratio-box", JSImport.Namespace)
@js.native
object aspectRatioBoxMod extends js.Object {
  @js.native
  class AspectRatioBox ()
    extends Component[AspectRatioBoxProps, js.Object, js.Any]
  
  @js.native
  trait AspectRatioBoxProps extends BlockProps {
    /** Aspect ratio is width divided by height. */
    var aspectRatio: js.UndefOr[Double] = js.native
  }
  
  val AspectRatioBoxBody: ReactComponentClass[BlockProps] = js.native
}

