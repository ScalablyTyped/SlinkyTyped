package typingsSlinky.kiiCloudSdk.global.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents Geo Point.
  */
@JSGlobal("KiiCloud.KiiGeoPoint")
@js.native
class KiiGeoPoint ()
  extends typingsSlinky.kiiCloudSdk.KiiCloud.KiiGeoPoint
object KiiGeoPoint {
  
  /**
    * Create a geo point with the given latitude and longitude.
    *
    * @param latitude Latitude of the point in degrees. Valid if the value is greater than -90 degrees and less than +90 degrees.
    * @param longitude Longitude of the point in degrees. Valid if the value is greater than -180 degrees and less than +180 degrees.
    *
    * @return A new reference of KiiGeoPoint.
    *
    * @throws Specified latitude or longitude is invalid.
    *
    * @example
    *         var point = KiiGeoPoint.geoPoint(35.07, 139.02);
    */
  /* static member */
  @JSGlobal("KiiCloud.KiiGeoPoint.geoPoint")
  @js.native
  def geoPoint(latitude: Double, longitude: Double): typingsSlinky.kiiCloudSdk.KiiCloud.KiiGeoPoint = js.native
}
