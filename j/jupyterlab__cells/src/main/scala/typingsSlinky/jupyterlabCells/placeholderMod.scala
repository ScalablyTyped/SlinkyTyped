package typingsSlinky.jupyterlabCells

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.jupyterlabApputils.mod.ReactWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells/lib/placeholder", JSImport.Namespace)
@js.native
object placeholderMod extends js.Object {
  
  @js.native
  class InputPlaceholder protected () extends Placeholder {
    /**
      * Construct a new input placeholder.
      */
    def this(callback: js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]) = this()
  }
  
  @js.native
  class OutputPlaceholder protected () extends Placeholder {
    /**
      * Construct a new output placeholder.
      */
    def this(callback: js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]) = this()
  }
  
  @js.native
  abstract class Placeholder protected () extends ReactWidget {
    /**
      * Construct a new placeholder.
      */
    def this(callback: js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]) = this()
    
    var _callback: js.Any = js.native
    
    /**
      * Handle the click event.
      */
    /* protected */ def handleClick(e: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
  }
}
