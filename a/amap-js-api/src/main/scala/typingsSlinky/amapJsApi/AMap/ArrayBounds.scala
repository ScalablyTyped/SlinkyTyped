package typingsSlinky.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayBounds extends js.Object {
  var bounds: js.Array[LngLat] = js.native
  /**
    * 判断传入的点是否在ArrayBounds内
    * @param point 目标点
    */
  def contains(point: LocationValue): Boolean = js.native
  def getCenter(): LngLat = js.native
  // internal
  def toBounds(): Bounds = js.native
}

object ArrayBounds {
  @scala.inline
  def apply(
    bounds: js.Array[LngLat],
    contains: LocationValue => Boolean,
    getCenter: () => LngLat,
    toBounds: () => Bounds
  ): ArrayBounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), getCenter = js.Any.fromFunction0(getCenter), toBounds = js.Any.fromFunction0(toBounds))
    __obj.asInstanceOf[ArrayBounds]
  }
  @scala.inline
  implicit class ArrayBoundsOps[Self <: ArrayBounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: LocationValue => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCenter(value: () => LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBounds(value: () => Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBounds")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

