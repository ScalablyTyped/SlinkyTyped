package typingsSlinky.reactMosaicComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicParent[T /* <: MosaicKey */] extends MosaicNode[T] {
  var direction: MosaicDirection = js.native
  var first: MosaicNode[T] = js.native
  var second: MosaicNode[T] = js.native
  var splitPercentage: js.UndefOr[Double] = js.native
}

object MosaicParent {
  @scala.inline
  def apply[T](direction: MosaicDirection, first: MosaicNode[T], second: MosaicNode[T]): MosaicParent[T] = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicParent[T]]
  }
  @scala.inline
  implicit class MosaicParentOps[Self[t] <: MosaicParent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDirection(value: MosaicDirection): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst(value: MosaicNode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: MosaicNode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitPercentage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitPercentage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPercentage")(js.undefined)
        ret
    }
  }
  
}

