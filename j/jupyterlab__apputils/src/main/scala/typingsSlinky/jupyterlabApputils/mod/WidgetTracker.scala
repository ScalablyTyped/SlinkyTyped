package typingsSlinky.jupyterlabApputils.mod

import typingsSlinky.jupyterlabApputils.widgettrackerMod.WidgetTracker.IOptions
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "WidgetTracker")
@js.native
class WidgetTracker[T /* <: Widget */] protected ()
  extends typingsSlinky.jupyterlabApputils.widgettrackerMod.WidgetTracker[T] {
  /**
    * Create a new widget tracker.
    *
    * @param options - The instantiation options for a widget tracker.
    */
  def this(options: IOptions) = this()
}

