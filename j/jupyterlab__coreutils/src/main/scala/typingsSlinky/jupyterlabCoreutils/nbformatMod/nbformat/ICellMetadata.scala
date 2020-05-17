package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

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
  implicit def apply(value: IBaseCellMetadata): ICellMetadata = value.asInstanceOf[ICellMetadata]
  @scala.inline
  implicit def apply(value: ICodeCellMetadata): ICellMetadata = value.asInstanceOf[ICellMetadata]
  @scala.inline
  implicit def apply(value: IRawCellMetadata): ICellMetadata = value.asInstanceOf[ICellMetadata]
}

