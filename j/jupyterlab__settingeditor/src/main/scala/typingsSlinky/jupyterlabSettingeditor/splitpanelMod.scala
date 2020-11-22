package typingsSlinky.jupyterlabSettingeditor

import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingeditor/lib/splitpanel", JSImport.Namespace)
@js.native
object splitpanelMod extends js.Object {
  
  @js.native
  class SplitPanel ()
    extends typingsSlinky.luminoWidgets.mod.SplitPanel {
    
    /**
      * Emits when the split handle has moved.
      */
    val handleMoved: ISignal[_, Unit] = js.native
  }
}
