package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Booleans.`false`
import typingsSlinky.antvG2.antvG2Strings.default
import typingsSlinky.antvG2.mod.Styles.background
import typingsSlinky.antvG2.mod.Styles.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasTooltipConfig
  extends CommonTooltipConfig
     with TooltipConfig {
  
  var boardStyle: js.UndefOr[background] = js.native
  
  var itemGap: js.UndefOr[Double] = js.native
  
  var nameStyle: js.UndefOr[text] = js.native
  
  var titleStyle: js.UndefOr[text] = js.native
  
  @JSName("type")
  var type_CanvasTooltipConfig: js.UndefOr[default] = js.native
  
  @JSName("useHtml")
  var useHtml_CanvasTooltipConfig: `false` = js.native
  
  var valueStyle: js.UndefOr[text] = js.native
}
object CanvasTooltipConfig {
  
  @scala.inline
  def apply(useHtml: `false`): CanvasTooltipConfig = {
    val __obj = js.Dynamic.literal(useHtml = useHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTooltipConfig]
  }
  
  @scala.inline
  implicit class CanvasTooltipConfigMutableBuilder[Self <: CanvasTooltipConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoardStyle(value: background): Self = StObject.set(x, "boardStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoardStyleUndefined: Self = StObject.set(x, "boardStyle", js.undefined)
    
    @scala.inline
    def setItemGap(value: Double): Self = StObject.set(x, "itemGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemGapUndefined: Self = StObject.set(x, "itemGap", js.undefined)
    
    @scala.inline
    def setNameStyle(value: text): Self = StObject.set(x, "nameStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameStyleUndefined: Self = StObject.set(x, "nameStyle", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: text): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setType(value: default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseHtml(value: `false`): Self = StObject.set(x, "useHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStyle(value: text): Self = StObject.set(x, "valueStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStyleUndefined: Self = StObject.set(x, "valueStyle", js.undefined)
  }
}
