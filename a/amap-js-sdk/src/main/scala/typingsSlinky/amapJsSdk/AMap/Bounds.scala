package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地物对象的经纬度矩形范围
  */
@js.native
trait Bounds extends js.Object {
  /**
    * 判断指定点坐标是否在矩形范围内
    * @param point 指定点
    */
  def contains(point: LngLat): Boolean = js.native
  /**
    * 获取当前Bounds的中心点经纬度坐标
    */
  def getCenter(): LngLat = js.native
  /**
    * 获取东北角坐标
    */
  def getNorthEast(): LngLat = js.native
  /**
    * 获取西南角坐标
    */
  def getSouthWest(): LngLat = js.native
}

object Bounds {
  @scala.inline
  def apply(
    contains: LngLat => Boolean,
    getCenter: () => LngLat,
    getNorthEast: () => LngLat,
    getSouthWest: () => LngLat
  ): Bounds = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getCenter = js.Any.fromFunction0(getCenter), getNorthEast = js.Any.fromFunction0(getNorthEast), getSouthWest = js.Any.fromFunction0(getSouthWest))
    __obj.asInstanceOf[Bounds]
  }
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: LngLat => Boolean): Self = {
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
    def withGetNorthEast(value: () => LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNorthEast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSouthWest(value: () => LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSouthWest")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

