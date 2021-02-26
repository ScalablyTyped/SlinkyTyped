package typingsSlinky.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDirection extends StObject {
  
  var filterDirection: js.UndefOr[String] = js.native
  
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.native
  
  var filterId: js.UndefOr[js.Array[String]] = js.native
  
  var filterRefType: js.UndefOr[js.Array[String]] = js.native
  
  var filterType: js.UndefOr[js.Array[String]] = js.native
}
object FilterDirection {
  
  @scala.inline
  def apply(): FilterDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDirection]
  }
  
  @scala.inline
  implicit class FilterDirectionMutableBuilder[Self <: FilterDirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterDirection(value: String): Self = StObject.set(x, "filterDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDirectionUndefined: Self = StObject.set(x, "filterDirection", js.undefined)
    
    @scala.inline
    def setFilterExtensionType(value: js.Array[String]): Self = StObject.set(x, "filterExtensionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExtensionTypeUndefined: Self = StObject.set(x, "filterExtensionType", js.undefined)
    
    @scala.inline
    def setFilterExtensionTypeVarargs(value: String*): Self = StObject.set(x, "filterExtensionType", js.Array(value :_*))
    
    @scala.inline
    def setFilterId(value: js.Array[String]): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
    
    @scala.inline
    def setFilterIdVarargs(value: String*): Self = StObject.set(x, "filterId", js.Array(value :_*))
    
    @scala.inline
    def setFilterRefType(value: js.Array[String]): Self = StObject.set(x, "filterRefType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRefTypeUndefined: Self = StObject.set(x, "filterRefType", js.undefined)
    
    @scala.inline
    def setFilterRefTypeVarargs(value: String*): Self = StObject.set(x, "filterRefType", js.Array(value :_*))
    
    @scala.inline
    def setFilterType(value: js.Array[String]): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setFilterTypeVarargs(value: String*): Self = StObject.set(x, "filterType", js.Array(value :_*))
  }
}
