package typingsSlinky.agGrid.gridSerializerMod

import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowAccumulator extends js.Object {
  def onColumn(column: Column, index: Double): Unit = js.native
  def onColumn(column: Column, index: Double, node: RowNode): Unit = js.native
}

