package typingsSlinky.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Raw pose measurement for an entity.
  */
@js.native
trait SchemaPose extends StObject {
  
  /**
    * The estimated horizontal accuracy of this pose in meters with 68%
    * confidence (one standard deviation). For example, on Android, this value
    * is available from this method:
    * https://developer.android.com/reference/android/location/Location#getAccuracy().
    * Other platforms have different methods of obtaining similar accuracy
    * estimations.
    */
  var accuracyMeters: js.UndefOr[Double] = js.native
  
  /**
    * Altitude of the pose in meters above WGS84 ellipsoid. NaN indicates an
    * unmeasured quantity.
    */
  var altitude: js.UndefOr[Double] = js.native
  
  /**
    * Compass heading, measured at the center of the photo in degrees clockwise
    * from North. Value must be &gt;=0 and &lt;360. NaN indicates an unmeasured
    * quantity.
    */
  var heading: js.UndefOr[Double] = js.native
  
  /**
    * Latitude and longitude pair of the pose, as explained here:
    * https://cloud.google.com/datastore/docs/reference/rest/Shared.Types/LatLng
    * When creating a Photo, if the latitude and longitude pair are not
    * provided, the geolocation from the exif header is used. A latitude and
    * longitude pair not provided in the photo or exif header causes the photo
    * process to fail.
    */
  var latLngPair: js.UndefOr[SchemaLatLng] = js.native
  
  /**
    * Level (the floor in a building) used to configure vertical navigation.
    */
  var level: js.UndefOr[SchemaLevel] = js.native
  
  /**
    * Pitch, measured at the center of the photo in degrees. Value must be
    * &gt;=-90 and &lt;= 90. A value of -90 means looking directly down, and a
    * value of 90 means looking directly up. NaN indicates an unmeasured
    * quantity.
    */
  var pitch: js.UndefOr[Double] = js.native
  
  /**
    * Roll, measured in degrees. Value must be &gt;= 0 and &lt;360. A value of
    * 0 means level with the horizon. NaN indicates an unmeasured quantity.
    */
  var roll: js.UndefOr[Double] = js.native
}
object SchemaPose {
  
  @scala.inline
  def apply(): SchemaPose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPose]
  }
  
  @scala.inline
  implicit class SchemaPoseMutableBuilder[Self <: SchemaPose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracyMeters(value: Double): Self = StObject.set(x, "accuracyMeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyMetersUndefined: Self = StObject.set(x, "accuracyMeters", js.undefined)
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setLatLngPair(value: SchemaLatLng): Self = StObject.set(x, "latLngPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngPairUndefined: Self = StObject.set(x, "latLngPair", js.undefined)
    
    @scala.inline
    def setLevel(value: SchemaLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollUndefined: Self = StObject.set(x, "roll", js.undefined)
  }
}
