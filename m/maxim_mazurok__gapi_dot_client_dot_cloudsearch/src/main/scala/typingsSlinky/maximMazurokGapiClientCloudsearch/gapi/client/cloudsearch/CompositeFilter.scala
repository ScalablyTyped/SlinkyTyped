package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositeFilter extends StObject {
  
  /** The logic operator of the sub filter. */
  var logicOperator: js.UndefOr[String] = js.native
  
  /** Sub filters. */
  var subFilters: js.UndefOr[js.Array[Filter]] = js.native
}
object CompositeFilter {
  
  @scala.inline
  def apply(): CompositeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeFilter]
  }
  
  @scala.inline
  implicit class CompositeFilterMutableBuilder[Self <: CompositeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogicOperator(value: String): Self = StObject.set(x, "logicOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicOperatorUndefined: Self = StObject.set(x, "logicOperator", js.undefined)
    
    @scala.inline
    def setSubFilters(value: js.Array[Filter]): Self = StObject.set(x, "subFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFiltersUndefined: Self = StObject.set(x, "subFilters", js.undefined)
    
    @scala.inline
    def setSubFiltersVarargs(value: Filter*): Self = StObject.set(x, "subFilters", js.Array(value :_*))
  }
}
