package typingsSlinky.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceMetricsListView
  extends /* key */ StringDictionary[js.Any] {
  
  var items: js.UndefOr[js.Array[PerformanceMetricsListViewItems]] = js.native
}
object PerformanceMetricsListView {
  
  @scala.inline
  def apply(): PerformanceMetricsListView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMetricsListView]
  }
  
  @scala.inline
  implicit class PerformanceMetricsListViewMutableBuilder[Self <: PerformanceMetricsListView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PerformanceMetricsListViewItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PerformanceMetricsListViewItems*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
