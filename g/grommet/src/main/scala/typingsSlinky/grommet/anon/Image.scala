package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.`no-repeat`
import typingsSlinky.grommet.grommetStrings.contain
import typingsSlinky.grommet.grommetStrings.cover
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.repeat
import typingsSlinky.grommet.grommetStrings.strong
import typingsSlinky.grommet.grommetStrings.weak
import typingsSlinky.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var dark: js.UndefOr[Boolean | String] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var light: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[weak | medium | strong | Double | Boolean] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var repeat: js.UndefOr[`no-repeat` | typingsSlinky.grommet.grommetStrings.repeat | String] = js.native
  
  var size: js.UndefOr[cover | contain | String] = js.native
}
object Image {
  
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDark(value: Boolean | String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    @scala.inline
    def setOpacity(value: weak | medium | strong | Double | Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRepeat(value: `no-repeat` | repeat | String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setSize(value: cover | contain | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
