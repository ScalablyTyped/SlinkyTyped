package typingsSlinky.atJupyterlabCells

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod.ReactWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/collapser", JSImport.Namespace)
@js.native
object libCollapserMod extends js.Object {
  @js.native
  /**
    * Construct a new collapser.
    */
  abstract class Collapser () extends ReactWidget {
    /**
      * Is the input/output of the parent collapsed.
      */
    val collapsed: Boolean = js.native
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

