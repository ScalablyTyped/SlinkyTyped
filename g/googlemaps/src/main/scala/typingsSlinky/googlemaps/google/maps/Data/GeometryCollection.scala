package typingsSlinky.googlemaps.google.maps.Data

import typingsSlinky.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryCollection extends Geometry {
  def getArray(): js.Array[Geometry] = js.native
  def getAt(n: Double): Geometry = js.native
  def getLength(): Double = js.native
}

object GeometryCollection {
  @scala.inline
  def apply(
    forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
    getArray: () => js.Array[Geometry],
    getAt: Double => Geometry,
    getLength: () => Double,
    getType: () => String
  ): GeometryCollection = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[GeometryCollection]
  }
  @scala.inline
  implicit class GeometryCollectionOps[Self <: GeometryCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetArray(value: () => js.Array[Geometry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAt(value: Double => Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

