package typingsSlinky.agDashGrid.distLibGridSerializerMod

import typingsSlinky.agDashGrid.distLibEntitiesColumnMod.Column
import typingsSlinky.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowAccumulator extends js.Object {
  def onColumn(column: Column, index: Double): Unit = js.native
  def onColumn(column: Column, index: Double, node: RowNode): Unit = js.native
}

