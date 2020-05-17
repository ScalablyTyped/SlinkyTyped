package typingsSlinky.jexcel.mod

import typingsSlinky.jexcel.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jexcel.mod.CellValue
  - typingsSlinky.jexcel.anon.Id
*/
trait SourceValue extends js.Object

object SourceValue {
  @scala.inline
  implicit def apply(value: CellValue): SourceValue = value.asInstanceOf[SourceValue]
  @scala.inline
  implicit def apply(value: Id): SourceValue = value.asInstanceOf[SourceValue]
}

