package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMultiplexResponse extends StObject {
  
  /**
    * The unique arn of the multiplex.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * A list of availability zones for the multiplex.
    */
  var AvailabilityZones: js.UndefOr[listOfString] = js.native
  
  /**
    * A list of the multiplex output destinations.
    */
  var Destinations: js.UndefOr[listOfMultiplexOutputDestination] = js.native
  
  /**
    * The unique id of the multiplex.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * Configuration for a multiplex event.
    */
  var MultiplexSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MultiplexSettings] = js.native
  
  /**
    * The name of the multiplex.
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[integer] = js.native
  
  /**
    * The number of programs in the multiplex.
    */
  var ProgramCount: js.UndefOr[integer] = js.native
  
  /**
    * The current state of the multiplex.
    */
  var State: js.UndefOr[MultiplexState] = js.native
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
}
object DeleteMultiplexResponse {
  
  @scala.inline
  def apply(): DeleteMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMultiplexResponse]
  }
  
  @scala.inline
  implicit class DeleteMultiplexResponseMutableBuilder[Self <: DeleteMultiplexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAvailabilityZones(value: listOfString): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: string*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: listOfMultiplexOutputDestination): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: MultiplexOutputDestination*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setMultiplexSettings(value: MultiplexSettings): Self = StObject.set(x, "MultiplexSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexSettingsUndefined: Self = StObject.set(x, "MultiplexSettings", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPipelinesRunningCount(value: integer): Self = StObject.set(x, "PipelinesRunningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelinesRunningCountUndefined: Self = StObject.set(x, "PipelinesRunningCount", js.undefined)
    
    @scala.inline
    def setProgramCount(value: integer): Self = StObject.set(x, "ProgramCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramCountUndefined: Self = StObject.set(x, "ProgramCount", js.undefined)
    
    @scala.inline
    def setState(value: MultiplexState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
