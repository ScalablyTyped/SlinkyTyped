package typingsSlinky.jupyterlabCells.modelMod

import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.markdown
import typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells/lib/model", "MarkdownCellModel")
@js.native
class MarkdownCellModel protected () extends AttachmentsCellModel {
  /**
    * Construct a markdown cell model from optional cell content.
    */
  def this(options: IOptions) = this()
  
  /**
    * The type of the cell.
    */
  @JSName("type")
  def type_MMarkdownCellModel: markdown = js.native
}
