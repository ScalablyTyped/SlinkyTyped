package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapMarkerDefaultsTooltipContent extends StObject {
  
  var url: js.UndefOr[String] = js.native
}
object MapMarkerDefaultsTooltipContent {
  
  @scala.inline
  def apply(): MapMarkerDefaultsTooltipContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerDefaultsTooltipContent]
  }
  
  @scala.inline
  implicit class MapMarkerDefaultsTooltipContentMutableBuilder[Self <: MapMarkerDefaultsTooltipContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
