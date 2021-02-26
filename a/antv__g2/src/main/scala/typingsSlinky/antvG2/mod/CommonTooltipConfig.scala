package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.anon.Style
import typingsSlinky.antvG2.antvG2Strings.bottom
import typingsSlinky.antvG2.antvG2Strings.click
import typingsSlinky.antvG2.antvG2Strings.default
import typingsSlinky.antvG2.antvG2Strings.left
import typingsSlinky.antvG2.antvG2Strings.mini
import typingsSlinky.antvG2.antvG2Strings.mousemove
import typingsSlinky.antvG2.antvG2Strings.none
import typingsSlinky.antvG2.antvG2Strings.right
import typingsSlinky.antvG2.antvG2Strings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonTooltipConfig extends StObject {
  
  var crosshairs: js.UndefOr[Style] = js.native
  
  var follow: js.UndefOr[Boolean] = js.native
  
  var hideMarkers: js.UndefOr[Boolean] = js.native
  
  var inPlot: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[left | right | top | bottom] = js.native
  
  var shared: js.UndefOr[Boolean] = js.native
  
  var showTitle: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var triggerOn: js.UndefOr[mousemove | click | none] = js.native
  
  var `type`: js.UndefOr[default | mini] = js.native
  
  var useHtml: js.UndefOr[Boolean] = js.native
}
object CommonTooltipConfig {
  
  @scala.inline
  def apply(): CommonTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonTooltipConfig]
  }
  
  @scala.inline
  implicit class CommonTooltipConfigMutableBuilder[Self <: CommonTooltipConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrosshairs(value: Style): Self = StObject.set(x, "crosshairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairsUndefined: Self = StObject.set(x, "crosshairs", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    @scala.inline
    def setHideMarkers(value: Boolean): Self = StObject.set(x, "hideMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideMarkersUndefined: Self = StObject.set(x, "hideMarkers", js.undefined)
    
    @scala.inline
    def setInPlot(value: Boolean): Self = StObject.set(x, "inPlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPlotUndefined: Self = StObject.set(x, "inPlot", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: left | right | top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTriggerOn(value: mousemove | click | none): Self = StObject.set(x, "triggerOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerOnUndefined: Self = StObject.set(x, "triggerOn", js.undefined)
    
    @scala.inline
    def setType(value: default | mini): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseHtml(value: Boolean): Self = StObject.set(x, "useHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHtmlUndefined: Self = StObject.set(x, "useHtml", js.undefined)
  }
}
