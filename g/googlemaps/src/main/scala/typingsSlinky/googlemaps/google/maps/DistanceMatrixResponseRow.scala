package typingsSlinky.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A row of the response to a {@link DistanceMatrixService} request, consisting of a sequence of
  * {@link DistanceMatrixResponseElement}s, one for each corresponding destination address.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseRow Maps JavaScript API}
  */
@js.native
trait DistanceMatrixResponseRow extends StObject {
  
  /**
    * The row's elements, corresponding to the destination addresses.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseRow.elements Maps JavaScript API}
    */
  var elements: js.Array[DistanceMatrixResponseElement] = js.native
}
object DistanceMatrixResponseRow {
  
  @scala.inline
  def apply(elements: js.Array[DistanceMatrixResponseElement]): DistanceMatrixResponseRow = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponseRow]
  }
  
  @scala.inline
  implicit class DistanceMatrixResponseRowMutableBuilder[Self <: DistanceMatrixResponseRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[DistanceMatrixResponseElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: DistanceMatrixResponseElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
