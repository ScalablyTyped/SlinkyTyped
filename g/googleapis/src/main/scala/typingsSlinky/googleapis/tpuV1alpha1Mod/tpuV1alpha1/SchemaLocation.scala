package typingsSlinky.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource that represents Google Cloud Platform location.
  */
@js.native
trait SchemaLocation extends StObject {
  
  /**
    * The friendly name for this location, typically a nearby city name. For
    * example, &quot;Tokyo&quot;.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Cross-service attributes for the location. For example
    * {&quot;cloud.googleapis.com/region&quot;: &quot;us-east1&quot;}
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The canonical id for this location. For example: `&quot;us-east1&quot;`.
    */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * Service-specific metadata. For example the available capacity at the
    * given location.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Resource name for the location, which may vary between implementations.
    * For example: `&quot;projects/example-project/locations/us-east1&quot;`
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaLocation {
  
  @scala.inline
  def apply(): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocation]
  }
  
  @scala.inline
  implicit class SchemaLocationMutableBuilder[Self <: SchemaLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
