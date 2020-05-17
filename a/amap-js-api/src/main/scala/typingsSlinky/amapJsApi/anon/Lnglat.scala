package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lnglat[I] extends js.Object {
  /**
    * 经纬度坐标
    */
  var lnglat: LngLat = js.native
  /**
    * 像素坐标
    */
  var pixel: Pixel = js.native
  /**
    * 触发对象
    */
  var target: I = js.native
}

object Lnglat {
  @scala.inline
  def apply[I](lnglat: LngLat, pixel: Pixel, target: I): Lnglat[I] = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lnglat[I]]
  }
  @scala.inline
  implicit class LnglatOps[Self[i] <: Lnglat[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withLnglat(value: LngLat): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lnglat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixel(value: Pixel): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: I): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

