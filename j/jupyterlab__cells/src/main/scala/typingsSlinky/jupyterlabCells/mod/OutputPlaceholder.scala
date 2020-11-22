package typingsSlinky.jupyterlabCells.mod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells", "OutputPlaceholder")
@js.native
class OutputPlaceholder protected ()
  extends typingsSlinky.jupyterlabCells.placeholderMod.OutputPlaceholder {
  /**
    * Construct a new output placeholder.
    */
  def this(callback: js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]) = this()
}
