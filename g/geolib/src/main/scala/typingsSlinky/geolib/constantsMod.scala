package typingsSlinky.geolib

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.geolib.typesMod.AltitudeKeys
import typingsSlinky.geolib.typesMod.LatitudeKeys
import typingsSlinky.geolib.typesMod.LongitudeKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val MAXLAT: /* 90 */ Double = js.native
  val MAXLON: /* 180 */ Double = js.native
  val MINLAT: /* -90 */ Double = js.native
  val MINLON: /* -180 */ Double = js.native
  val altitudeKeys: js.Array[AltitudeKeys] = js.native
  val areaConversion: unitObject = js.native
  val distanceConversion: unitObject = js.native
  val earthRadius: /* 6378137 */ Double = js.native
  val latitudeKeys: js.Array[LatitudeKeys] = js.native
  val longitudeKeys: js.Array[LongitudeKeys] = js.native
  val sexagesimalPattern: js.RegExp = js.native
  val timeConversion: unitObject = js.native
  type unitObject = StringDictionary[Double]
}

