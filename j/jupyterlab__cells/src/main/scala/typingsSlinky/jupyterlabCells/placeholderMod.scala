package typingsSlinky.jupyterlabCells

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.jupyterlabApputils.mod.ReactWidget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderMod {
  
  @JSImport("@jupyterlab/cells/lib/placeholder", "InputPlaceholder")
  @js.native
  class InputPlaceholder protected () extends Placeholder {
    /**
      * Construct a new input placeholder.
      */
    def this(callback: js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]) = this()
  }
  
  @JSImport("@jupyterlab/cells/lib/placeholder", "OutputPlaceholder")
  @js.native
  class OutputPlaceholder protected () extends Placeholder {
    /**
      * Construct a new output placeholder.
      */
    def this(callback: js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]) = this()
  }
  
  @JSImport("@jupyterlab/cells/lib/placeholder", "Placeholder")
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
