package typingsSlinky.jupyterlabCells

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.jupyterlabApputils.mod.ReactWidget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapserMod {
  
  @JSImport("@jupyterlab/cells/lib/collapser", "Collapser")
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
  
  @JSImport("@jupyterlab/cells/lib/collapser", "InputCollapser")
  @js.native
  /**
    * Construct a new input collapser.
    */
  class InputCollapser () extends Collapser
  
  @JSImport("@jupyterlab/cells/lib/collapser", "OutputCollapser")
  @js.native
  /**
    * Construct a new output collapser.
    */
  class OutputCollapser () extends Collapser
}
