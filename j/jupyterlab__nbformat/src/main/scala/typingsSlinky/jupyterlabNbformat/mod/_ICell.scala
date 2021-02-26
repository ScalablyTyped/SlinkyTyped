package typingsSlinky.jupyterlabNbformat.mod

import typingsSlinky.jupyterlabNbformat.anon.PartialICodeCellMetadata
import typingsSlinky.jupyterlabNbformat.anon.PartialIRawCellMetadata
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.code
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.markdown
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.raw
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ICell extends StObject
object _ICell {
  
  @scala.inline
  def ICodeCell(
    cell_type: code,
    metadata: PartialICodeCellMetadata,
    outputs: js.Array[IOutput],
    source: MultilineString
  ): typingsSlinky.jupyterlabNbformat.mod.ICodeCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabNbformat.mod.ICodeCell]
  }
  
  @scala.inline
  def IMarkdownCell(cell_type: markdown, metadata: Partial[ICellMetadata], source: MultilineString): typingsSlinky.jupyterlabNbformat.mod.IMarkdownCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabNbformat.mod.IMarkdownCell]
  }
  
  @scala.inline
  def IRawCell(cell_type: raw, metadata: PartialIRawCellMetadata, source: MultilineString): typingsSlinky.jupyterlabNbformat.mod.IRawCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabNbformat.mod.IRawCell]
  }
}
