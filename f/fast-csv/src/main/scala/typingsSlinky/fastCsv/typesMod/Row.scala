package typingsSlinky.fastCsv.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fastCsv.typesMod.RowArray
  - typingsSlinky.fastCsv.typesMod.RowMap
  - typingsSlinky.fastCsv.typesMod.RowHashArray
*/
trait Row extends js.Object

object Row {
  @scala.inline
  implicit def apply(value: RowArray | RowHashArray): Row = value.asInstanceOf[Row]
  @scala.inline
  implicit def apply(value: RowMap): Row = value.asInstanceOf[Row]
}

