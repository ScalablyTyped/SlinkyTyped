package typingsSlinky.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This location metadata represents additional configuration options for a
  * given location where a Redis instance may be created. All fields are output
  * only. It is returned as content of the
  * `google.cloud.location.Location.metadata` field.
  */
@js.native
trait SchemaGoogleCloudRedisV1beta1LocationMetadata extends StObject {
  
  /**
    * Output only. The set of available zones in the location. The map is keyed
    * by the lowercase ID of each zone, as defined by GCE. These keys can be
    * specified in `location_id` or `alternative_location_id` fields when
    * creating a Redis instance.
    */
  var availableZones: js.UndefOr[StringDictionary[SchemaGoogleCloudRedisV1beta1ZoneMetadata]] = js.native
}
object SchemaGoogleCloudRedisV1beta1LocationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleCloudRedisV1beta1LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRedisV1beta1LocationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudRedisV1beta1LocationMetadataMutableBuilder[Self <: SchemaGoogleCloudRedisV1beta1LocationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableZones(value: StringDictionary[SchemaGoogleCloudRedisV1beta1ZoneMetadata]): Self = StObject.set(x, "availableZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableZonesUndefined: Self = StObject.set(x, "availableZones", js.undefined)
  }
}
