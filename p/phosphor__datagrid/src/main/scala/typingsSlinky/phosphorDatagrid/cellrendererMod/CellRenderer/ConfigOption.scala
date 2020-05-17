package typingsSlinky.phosphorDatagrid.cellrendererMod.CellRenderer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a cell renderer config option.
  *
  * A config option can be a static value or a config function.
  */
/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.phosphorDatagrid.cellrendererMod.CellRenderer.ConfigFunc[T]
*/
trait ConfigOption[T] extends js.Object

object ConfigOption {
  @scala.inline
  implicit def apply[T](value: ConfigFunc[T]): ConfigOption[T] = value.asInstanceOf[ConfigOption[T]]
  @scala.inline
  implicit def apply[T](value: T): ConfigOption[T] = value.asInstanceOf[ConfigOption[T]]
}

