package typingsSlinky.googleAppsScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows for direction finding, geocoding, elevation sampling and the creation of static map
  * images.
  */
@js.native
trait Maps extends js.Object {
  var DirectionFinder: DirectionFinderEnums = js.native
  var StaticMap: StaticMapEnums = js.native
  def decodePolyline(polyline: String): js.Array[Double] = js.native
  def encodePolyline(points: js.Array[Double]): String = js.native
  def newDirectionFinder(): DirectionFinder = js.native
  def newElevationSampler(): ElevationSampler = js.native
  def newGeocoder(): Geocoder = js.native
  def newStaticMap(): StaticMap = js.native
  def setAuthentication(clientId: String, signingKey: String): Unit = js.native
}

object Maps {
  @scala.inline
  def apply(
    DirectionFinder: DirectionFinderEnums,
    StaticMap: StaticMapEnums,
    decodePolyline: String => js.Array[Double],
    encodePolyline: js.Array[Double] => String,
    newDirectionFinder: () => DirectionFinder,
    newElevationSampler: () => ElevationSampler,
    newGeocoder: () => Geocoder,
    newStaticMap: () => StaticMap,
    setAuthentication: (String, String) => Unit
  ): Maps = {
    val __obj = js.Dynamic.literal(DirectionFinder = DirectionFinder.asInstanceOf[js.Any], StaticMap = StaticMap.asInstanceOf[js.Any], decodePolyline = js.Any.fromFunction1(decodePolyline), encodePolyline = js.Any.fromFunction1(encodePolyline), newDirectionFinder = js.Any.fromFunction0(newDirectionFinder), newElevationSampler = js.Any.fromFunction0(newElevationSampler), newGeocoder = js.Any.fromFunction0(newGeocoder), newStaticMap = js.Any.fromFunction0(newStaticMap), setAuthentication = js.Any.fromFunction2(setAuthentication))
    __obj.asInstanceOf[Maps]
  }
  @scala.inline
  implicit class MapsOps[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Maps.Maps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectionFinder(value: DirectionFinderEnums): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectionFinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticMap(value: StaticMapEnums): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecodePolyline(value: String => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodePolyline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncodePolyline(value: js.Array[Double] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodePolyline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewDirectionFinder(value: () => DirectionFinder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDirectionFinder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewElevationSampler(value: () => ElevationSampler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newElevationSampler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGeocoder(value: () => Geocoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGeocoder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewStaticMap(value: () => StaticMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStaticMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAuthentication(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAuthentication")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

