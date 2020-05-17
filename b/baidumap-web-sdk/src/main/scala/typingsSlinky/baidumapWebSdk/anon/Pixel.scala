package typingsSlinky.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pixel extends js.Object {
  var pixel: typingsSlinky.baidumapWebSdk.BMap.Pixel = js.native
  var point: typingsSlinky.baidumapWebSdk.BMap.Point = js.native
  var target: js.Any = js.native
  var `type`: String = js.native
}

object Pixel {
  @scala.inline
  def apply(
    pixel: typingsSlinky.baidumapWebSdk.BMap.Pixel,
    point: typingsSlinky.baidumapWebSdk.BMap.Point,
    target: js.Any,
    `type`: String
  ): Pixel = {
    val __obj = js.Dynamic.literal(pixel = pixel.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pixel]
  }
  @scala.inline
  implicit class PixelOps[Self <: Pixel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPixel(value: typingsSlinky.baidumapWebSdk.BMap.Pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: typingsSlinky.baidumapWebSdk.BMap.Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

