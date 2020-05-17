package typingsSlinky.fastCsv.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowTransformFunction extends js.Object {
  def apply(row: Row): Row = js.native
  def apply(row: Row, callback: RowTransformCallback): Unit = js.native
}

