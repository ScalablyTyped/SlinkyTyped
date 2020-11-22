package typingsSlinky.jupyterlabCells

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.jupyterlabApputils.mod.ReactWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells/lib/collapser", JSImport.Namespace)
@js.native
object collapserMod extends js.Object {
  
  @js.native
  /**
    * Construct a new collapser.
    */
  abstract class Collapser () extends ReactWidget {
    
    /**
      * Is the input/output of the parent collapsed.
      */
    def collapsed: Boolean = js.native
    
    /**
      * Handle the click event.
      */
    /* protected */ def handleClick(e: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
  }
  
  @js.native
  /**
    * Construct a new input collapser.
    */
  class InputCollapser () extends Collapser
  
  @js.native
  /**
    * Construct a new output collapser.
    */
  class OutputCollapser () extends Collapser
}
