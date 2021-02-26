package typingsSlinky.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchTimeout extends StObject {
  
  var allowSearch: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var searchTimeout: js.UndefOr[Double] = js.native
  
  var showRelevantValues: js.UndefOr[Boolean] = js.native
  
  var texts: js.UndefOr[Cancel] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SearchTimeout {
  
  @scala.inline
  def apply(): SearchTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTimeout]
  }
  
  @scala.inline
  implicit class SearchTimeoutMutableBuilder[Self <: SearchTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    @scala.inline
    def setShowRelevantValues(value: Boolean): Self = StObject.set(x, "showRelevantValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRelevantValuesUndefined: Self = StObject.set(x, "showRelevantValues", js.undefined)
    
    @scala.inline
    def setTexts(value: Cancel): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
