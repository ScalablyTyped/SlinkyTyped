package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartZoomableSelection extends StObject {
  
  var key: js.UndefOr[String] = js.native
  
  var lock: js.UndefOr[String] = js.native
}
object ChartZoomableSelection {
  
  @scala.inline
  def apply(): ChartZoomableSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomableSelection]
  }
  
  @scala.inline
  implicit class ChartZoomableSelectionMutableBuilder[Self <: ChartZoomableSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLock(value: String): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
  }
}
