package typingsSlinky.ckeditorCkeditor5Engine.mod.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeWalkerValue extends js.Object {
  var item: Item = js.native
  var length: Double = js.native
  var nextPosition: Position = js.native
  var previousPosition: Position = js.native
  var `type`: TreeWalkerValueType = js.native
}

object TreeWalkerValue {
  @scala.inline
  def apply(
    item: Item,
    length: Double,
    nextPosition: Position,
    previousPosition: Position,
    `type`: TreeWalkerValueType
  ): TreeWalkerValue = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalkerValue]
  }
  @scala.inline
  implicit class TreeWalkerValueOps[Self <: TreeWalkerValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TreeWalkerValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

