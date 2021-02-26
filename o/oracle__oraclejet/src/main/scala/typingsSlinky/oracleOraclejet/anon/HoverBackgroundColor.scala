package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverBackgroundColor extends StObject {
  
  var backgroundColor: String = js.native
  
  var borderColor: String = js.native
  
  var hoverBackgroundColor: String = js.native
  
  var hoverInnerColor: String = js.native
  
  var hoverOuterColor: String = js.native
  
  var isolate: off | on = js.native
  
  var labelHalign: center | end | start = js.native
  
  var labelStyle: js.Object = js.native
  
  var selectedBackgroundColor: String = js.native
  
  var selectedInnerColor: String = js.native
  
  var selectedOuterColor: String = js.native
  
  var useNodeColor: on | off = js.native
}
object HoverBackgroundColor {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    hoverBackgroundColor: String,
    hoverInnerColor: String,
    hoverOuterColor: String,
    isolate: off | on,
    labelHalign: center | end | start,
    labelStyle: js.Object,
    selectedBackgroundColor: String,
    selectedInnerColor: String,
    selectedOuterColor: String,
    useNodeColor: on | off
  ): HoverBackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverInnerColor = hoverInnerColor.asInstanceOf[js.Any], hoverOuterColor = hoverOuterColor.asInstanceOf[js.Any], isolate = isolate.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any], useNodeColor = useNodeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverBackgroundColor]
  }
  
  @scala.inline
  implicit class HoverBackgroundColorMutableBuilder[Self <: HoverBackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBackgroundColor(value: String): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverInnerColor(value: String): Self = StObject.set(x, "hoverInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverOuterColor(value: String): Self = StObject.set(x, "hoverOuterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolate(value: off | on): Self = StObject.set(x, "isolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHalign(value: center | end | start): Self = StObject.set(x, "labelHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedBackgroundColor(value: String): Self = StObject.set(x, "selectedBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedInnerColor(value: String): Self = StObject.set(x, "selectedInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOuterColor(value: String): Self = StObject.set(x, "selectedOuterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNodeColor(value: on | off): Self = StObject.set(x, "useNodeColor", value.asInstanceOf[js.Any])
  }
}
