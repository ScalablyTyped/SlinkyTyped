package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  /**
    * A set of regions relevant to the location.
    */
  var annotations: js.UndefOr[js.Array[Region]] = js.native
  
  /**
    * Value that distinguishes this location from all other locations within a single result object.
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    * The logical locations associated with the result.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.native
  
  /**
    * A message relevant to the location.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * Identifies the artifact and region.
    */
  var physicalLocation: js.UndefOr[PhysicalLocation] = js.native
  
  /**
    * Key/value pairs that provide additional information about the location.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * An array of objects that describe relationships between this location and others.
    */
  var relationships: js.UndefOr[js.Array[LocationRelationship]] = js.native
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: js.Array[Region]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: Region*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLogicalLocations(value: js.Array[LogicalLocation]): Self = StObject.set(x, "logicalLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalLocationsUndefined: Self = StObject.set(x, "logicalLocations", js.undefined)
    
    @scala.inline
    def setLogicalLocationsVarargs(value: LogicalLocation*): Self = StObject.set(x, "logicalLocations", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPhysicalLocation(value: PhysicalLocation): Self = StObject.set(x, "physicalLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalLocationUndefined: Self = StObject.set(x, "physicalLocation", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRelationships(value: js.Array[LocationRelationship]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setRelationshipsVarargs(value: LocationRelationship*): Self = StObject.set(x, "relationships", js.Array(value :_*))
  }
}
