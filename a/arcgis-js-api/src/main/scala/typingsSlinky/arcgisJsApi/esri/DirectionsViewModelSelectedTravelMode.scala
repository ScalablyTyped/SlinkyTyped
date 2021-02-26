package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsViewModelSelectedTravelMode extends TravelMode {
  
  /**
    * The description explaining the selected travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("description")
  var description_DirectionsViewModelSelectedTravelMode: String = js.native
  
  /**
    * The unique identifier specific for this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("id")
  var id_DirectionsViewModelSelectedTravelMode: String = js.native
  
  /**
    * The cost attribute on which to optimize the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("impedanceAttributeName")
  var impedanceAttributeName_DirectionsViewModelSelectedTravelMode: String = js.native
  
  /**
    * Name of the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("name")
  var name_DirectionsViewModelSelectedTravelMode: String = js.native
  
  /**
    * The time-based cost attribute for reporting directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("timeAttributeName")
  var timeAttributeName_DirectionsViewModelSelectedTravelMode: String = js.native
}
object DirectionsViewModelSelectedTravelMode {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    impedanceAttributeName: String,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    timeAttributeName: String
  ): DirectionsViewModelSelectedTravelMode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], impedanceAttributeName = impedanceAttributeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), timeAttributeName = timeAttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsViewModelSelectedTravelMode]
  }
  
  @scala.inline
  implicit class DirectionsViewModelSelectedTravelModeMutableBuilder[Self <: DirectionsViewModelSelectedTravelMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpedanceAttributeName(value: String): Self = StObject.set(x, "impedanceAttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeAttributeName(value: String): Self = StObject.set(x, "timeAttributeName", value.asInstanceOf[js.Any])
  }
}
