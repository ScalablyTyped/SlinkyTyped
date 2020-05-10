package typingsSlinky.reactMovable

import typingsSlinky.reactMovable.typesMod.IItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndex[Value] extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var isDragged: Boolean = js.native
  var isOutOfBounds: Boolean = js.native
  var isSelected: Boolean = js.native
  var props: IItemProps = js.native
  var value: Value = js.native
}

object AnonIndex {
  @scala.inline
  def apply[Value](isDragged: Boolean, isOutOfBounds: Boolean, isSelected: Boolean, props: IItemProps, value: Value): AnonIndex[Value] = {
    val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], isOutOfBounds = isOutOfBounds.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex[Value]]
  }
  @scala.inline
  implicit class AnonIndexOps[Self[value] <: AnonIndex[value], Value] (val x: Self[Value]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Value] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Value]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Value] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Value] with Other]
    @scala.inline
    def withIsDragged(value: Boolean): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOutOfBounds(value: Boolean): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: IItemProps): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Value): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

