package typingsSlinky.grommet.anon

import typingsSlinky.grommet.boxMod.BoxProps
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.MarginType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorContainer extends StObject {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var container: js.UndefOr[BoxProps] = js.native
  
  var icon: js.UndefOr[js.Any] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
}
object ColorContainer {
  
  @scala.inline
  def apply(): ColorContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorContainer]
  }
  
  @scala.inline
  implicit class ColorContainerMutableBuilder[Self <: ColorContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContainer(value: BoxProps): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
  }
}
