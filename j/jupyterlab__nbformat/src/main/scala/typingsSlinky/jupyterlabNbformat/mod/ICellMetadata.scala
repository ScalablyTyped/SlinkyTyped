package typingsSlinky.jupyterlabNbformat.mod

import typingsSlinky.jupyterlabNbformat.anon.PartialIBaseCellJupyterMe
import typingsSlinky.jupyterlabNbformat.anon.PartialICodeCellJupyterMe
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabNbformat.mod.IBaseCellMetadata
  - typingsSlinky.jupyterlabNbformat.mod.IRawCellMetadata
  - typingsSlinky.jupyterlabNbformat.mod.ICodeCellMetadata
*/
trait ICellMetadata extends StObject
object ICellMetadata {
  
  @scala.inline
  def IBaseCellMetadata(jupyter: PartialIBaseCellJupyterMe, name: String, tags: js.Array[String], trusted: Boolean): typingsSlinky.jupyterlabNbformat.mod.IBaseCellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabNbformat.mod.IBaseCellMetadata]
  }
  
  @scala.inline
  def ICodeCellMetadata(
    collapsed: Boolean,
    jupyter: PartialICodeCellJupyterMe,
    name: String,
    scrolled: Boolean | auto,
    tags: js.Array[String],
    trusted: Boolean
  ): typingsSlinky.jupyterlabNbformat.mod.ICodeCellMetadata = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabNbformat.mod.ICodeCellMetadata]
  }
  
  @scala.inline
  def IRawCellMetadata(
    format: String,
    jupyter: PartialIBaseCellJupyterMe,
    name: String,
    tags: js.Array[String],
    trusted: Boolean
  ): typingsSlinky.jupyterlabNbformat.mod.IRawCellMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabNbformat.mod.IRawCellMetadata]
  }
}
