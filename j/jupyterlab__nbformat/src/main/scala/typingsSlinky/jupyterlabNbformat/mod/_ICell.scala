package typingsSlinky.jupyterlabNbformat.mod

import typingsSlinky.jupyterlabNbformat.anon.PartialICodeCellMetadata
import typingsSlinky.jupyterlabNbformat.anon.PartialIRawCellMetadata
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.code
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.markdown
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.raw
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ICell extends js.Object
object _ICell {
  
  @scala.inline
  def IRawCell(cell_type: raw, metadata: PartialIRawCellMetadata, source: MultilineString): _ICell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ICell]
  }
  
  @scala.inline
  def IMarkdownCell(cell_type: markdown, metadata: Partial[ICellMetadata], source: MultilineString): _ICell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ICell]
  }
  
  @scala.inline
  def ICodeCell(
    cell_type: code,
    metadata: PartialICodeCellMetadata,
    outputs: js.Array[IOutput],
    source: MultilineString
  ): _ICell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ICell]
  }
}
