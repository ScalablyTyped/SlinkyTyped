package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.AMap.LabelMarker.IconOptions
import typingsSlinky.amapJsApi.AMap.LabelMarker.TextOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon extends StObject {
  
  var icon: IconOptions = js.native
  
  var opacity: Double = js.native
  
  var text: TextOptions = js.native
  
  var zIndex: Double = js.native
}
object Icon {
  
  @scala.inline
  def apply(icon: IconOptions, opacity: Double, text: TextOptions, zIndex: Double): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: IconOptions): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: TextOptions): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
