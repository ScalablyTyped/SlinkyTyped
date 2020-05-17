package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A cell union type.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IRawCell
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IMarkdownCell
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ICodeCell
  - typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedCell
*/
trait ICell extends js.Object

object ICell {
  @scala.inline
  implicit def apply(value: ICodeCell): ICell = value.asInstanceOf[ICell]
  @scala.inline
  implicit def apply(value: IMarkdownCell): ICell = value.asInstanceOf[ICell]
  @scala.inline
  implicit def apply(value: IRawCell): ICell = value.asInstanceOf[ICell]
  @scala.inline
  implicit def apply(value: IUnrecognizedCell): ICell = value.asInstanceOf[ICell]
}

