package typingsSlinky.amapJsApiPlaceSearch.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.Marker
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListElements extends StObject {
  
  var listElements: js.Array[HTMLElement] = js.native
  
  var markers: js.Array[Marker[_]] = js.native
  
  var result: js.Array[SelectChangeEventData] = js.native
}
object ListElements {
  
  @scala.inline
  def apply(
    listElements: js.Array[HTMLElement],
    markers: js.Array[Marker[_]],
    result: js.Array[SelectChangeEventData]
  ): ListElements = {
    val __obj = js.Dynamic.literal(listElements = listElements.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListElements]
  }
  
  @scala.inline
  implicit class ListElementsMutableBuilder[Self <: ListElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "listElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "listElements", js.Array(value :_*))
    
    @scala.inline
    def setMarkers(value: js.Array[Marker[_]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersVarargs(value: Marker[js.Any]*): Self = StObject.set(x, "markers", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[SelectChangeEventData]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: SelectChangeEventData*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
