package typingsSlinky.jupyterlabCells.widgetMod.Cell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  *
  * This includes a CodeMirror editor factory to make it easy to use out of the box.
  */
@JSImport("@jupyterlab/cells/lib/widget", "Cell.ContentFactory")
@js.native
/**
  * Create a content factory for a cell.
  */
class ContentFactory_ () extends IContentFactory {
  def this(options: typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
  var _editorFactory: js.Any = js.native
}

