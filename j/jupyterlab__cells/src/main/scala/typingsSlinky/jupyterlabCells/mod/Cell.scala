package typingsSlinky.jupyterlabCells.mod

import typingsSlinky.jupyterlabCells.widgetMod.Cell.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells", "Cell")
@js.native
class Cell protected ()
  extends typingsSlinky.jupyterlabCells.widgetMod.Cell {
  /**
    * Construct a new base cell widget.
    */
  def this(options: IOptions) = this()
}
@JSImport("@jupyterlab/cells", "Cell")
@js.native
object Cell extends js.Object {
  
  /**
    * The default content factory for cells.
    */
  val defaultContentFactory: typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory = js.native
  
  /**
    * The default implementation of an `IContentFactory`.
    *
    * This includes a CodeMirror editor factory to make it easy to use out of the box.
    */
  @js.native
  /**
    * Create a content factory for a cell.
    */
  class ContentFactory ()
    extends typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory {
    def this(options: typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
  }
  /**
    * A namespace for cell content factory.
    */
  @js.native
  object ContentFactory extends js.Object
}
