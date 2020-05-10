package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  def lngLatToPoint(lngLat: Point): Pixel = js.native
  def pointToLngLat(point: Pixel): Point = js.native
}

object Projection {
  @scala.inline
  def apply(lngLatToPoint: Point => Pixel, pointToLngLat: Pixel => Point): Projection = {
    val __obj = js.Dynamic.literal(lngLatToPoint = js.Any.fromFunction1(lngLatToPoint), pointToLngLat = js.Any.fromFunction1(pointToLngLat))
    __obj.asInstanceOf[Projection]
  }
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLngLatToPoint(value: Point => Pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngLatToPoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointToLngLat(value: Pixel => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointToLngLat")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

