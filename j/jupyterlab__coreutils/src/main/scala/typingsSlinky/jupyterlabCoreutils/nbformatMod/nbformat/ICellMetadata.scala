package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.jupyterlabCoreutils.anon.PartialIBaseCellJupyterMe
import typingsSlinky.jupyterlabCoreutils.anon.PartialICodeCellJupyterMe
import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A union metadata type.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IBaseCellMetadata
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IRawCellMetadata
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ICodeCellMetadata
*/
trait ICellMetadata extends js.Object

object ICellMetadata {
  @scala.inline
  def IBaseCellMetadata(jupyter: PartialIBaseCellJupyterMe, name: String, tags: js.Array[String], trusted: Boolean): ICellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellMetadata]
  }
  @scala.inline
  def IRawCellMetadata(
    format: String,
    jupyter: PartialIBaseCellJupyterMe,
    name: String,
    tags: js.Array[String],
    trusted: Boolean
  ): ICellMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellMetadata]
  }
  @scala.inline
  def ICodeCellMetadata(
    collapsed: Boolean,
    jupyter: PartialICodeCellJupyterMe,
    name: String,
    scrolled: Boolean | auto,
    tags: js.Array[String],
    trusted: Boolean
  ): ICellMetadata = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellMetadata]
  }
}

