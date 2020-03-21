package typingsSlinky.jupyterlabCells.mod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "Placeholder")
@js.native
abstract class Placeholder protected ()
  extends typingsSlinky.jupyterlabCells.placeholderMod.Placeholder {
  /**
    * Construct a new placeholder.
    */
  def this(callback: js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]) = this()
}

