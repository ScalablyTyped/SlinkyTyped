package typingsSlinky.lineColumn.mod

import typingsSlinky.lineColumn.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Utility type for object structures that can be used as inputs to the `toIndex`
  * function.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lineColumn.mod.LineColumnInfo
  - typingsSlinky.lineColumn.anon.Column
*/
trait LineColumnObject extends js.Object

object LineColumnObject {
  @scala.inline
  implicit def apply(value: Column): LineColumnObject = value.asInstanceOf[LineColumnObject]
  @scala.inline
  implicit def apply(value: LineColumnInfo): LineColumnObject = value.asInstanceOf[LineColumnObject]
}

