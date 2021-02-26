package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerFormsResponse extends StObject {
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[Double] = js.native
  
  // int32
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.native
  
  /**
    * An array of PowerForm objects.
    */
  var powerForms: js.UndefOr[js.Array[/* Contains details about a PowerForm. */ PowerForm]] = js.native
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.native
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[Double] = js.native
  
  // int32
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[Double] = js.native
  
  // int32
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[Double] = js.native
}
object PowerFormsResponse {
  
  @scala.inline
  def apply(): PowerFormsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormsResponse]
  }
  
  @scala.inline
  implicit class PowerFormsResponseMutableBuilder[Self <: PowerFormsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPosition(value: Double): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    @scala.inline
    def setNextUri(value: String): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUriUndefined: Self = StObject.set(x, "nextUri", js.undefined)
    
    @scala.inline
    def setPowerForms(value: js.Array[/* Contains details about a PowerForm. */ PowerForm]): Self = StObject.set(x, "powerForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerFormsUndefined: Self = StObject.set(x, "powerForms", js.undefined)
    
    @scala.inline
    def setPowerFormsVarargs(value: (/* Contains details about a PowerForm. */ PowerForm)*): Self = StObject.set(x, "powerForms", js.Array(value :_*))
    
    @scala.inline
    def setPreviousUri(value: String): Self = StObject.set(x, "previousUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUriUndefined: Self = StObject.set(x, "previousUri", js.undefined)
    
    @scala.inline
    def setResultSetSize(value: Double): Self = StObject.set(x, "resultSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetSizeUndefined: Self = StObject.set(x, "resultSetSize", js.undefined)
    
    @scala.inline
    def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    @scala.inline
    def setTotalSetSize(value: Double): Self = StObject.set(x, "totalSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSetSizeUndefined: Self = StObject.set(x, "totalSetSize", js.undefined)
  }
}
