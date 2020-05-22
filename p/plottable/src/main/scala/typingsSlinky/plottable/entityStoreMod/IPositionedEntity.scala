package typingsSlinky.plottable.entityStoreMod

import typingsSlinky.plottable.interfacesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionedEntity extends js.Object {
  var position: Point
}

object IPositionedEntity {
  @scala.inline
  def apply(position: Point): IPositionedEntity = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionedEntity]
  }
}

