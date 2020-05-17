package typingsSlinky.googlemaps.google.maps.Data

import typingsSlinky.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry extends js.Object {
  def forEachLatLng(callback: js.Function1[/* latLng */ LatLng, Unit]): Unit = js.native
  def getType(): String = js.native
}

object Geometry {
  @scala.inline
  def apply(forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit, getType: () => String): Geometry = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForEachLatLng(value: js.Function1[/* latLng */ LatLng, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEachLatLng")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

