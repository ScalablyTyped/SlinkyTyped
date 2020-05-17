package typingsSlinky.fastCsv.parserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fastCsv.parserTypesMod.RowMap
  - typingsSlinky.fastCsv.parserTypesMod.RowArray
*/
trait Row extends js.Object

object Row {
  @scala.inline
  implicit def apply(value: RowArray): Row = value.asInstanceOf[Row]
  @scala.inline
  implicit def apply(value: RowMap): Row = value.asInstanceOf[Row]
}

