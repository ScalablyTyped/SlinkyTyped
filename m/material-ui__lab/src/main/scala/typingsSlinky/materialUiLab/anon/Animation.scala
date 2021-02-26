package typingsSlinky.materialUiLab.anon

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiLab.materialUiLabBooleans.`false`
import typingsSlinky.materialUiLab.materialUiLabStrings.circle
import typingsSlinky.materialUiLab.materialUiLabStrings.pulse
import typingsSlinky.materialUiLab.materialUiLabStrings.rect
import typingsSlinky.materialUiLab.materialUiLabStrings.text
import typingsSlinky.materialUiLab.materialUiLabStrings.wave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends StObject {
  
  var animation: js.UndefOr[pulse | wave | `false`] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var variant: js.UndefOr[text | rect | circle] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object Animation {
  
  @scala.inline
  def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: pulse | wave | `false`): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setVariant(value: text | rect | circle): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
