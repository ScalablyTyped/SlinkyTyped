package typingsSlinky.jupyterlabSettingeditor

import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/splitpanel", JSImport.Namespace)
@js.native
object splitpanelMod extends js.Object {
  @js.native
  class SplitPanel ()
    extends typingsSlinky.phosphorWidgets.mod.SplitPanel {
    /**
      * Emits when the split handle has moved.
      */
    val handleMoved: ISignal[_, Unit] = js.native
  }
  
}

