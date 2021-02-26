package typingsSlinky.gestalt.mod

import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.gestaltNumbers.`0`
import typingsSlinky.gestalt.gestaltNumbers.`1`
import typingsSlinky.gestalt.gestaltNumbers.`2`
import typingsSlinky.gestalt.gestaltNumbers.`3`
import typingsSlinky.gestalt.gestaltNumbers.`4`
import typingsSlinky.gestalt.gestaltNumbers.`5`
import typingsSlinky.gestalt.gestaltNumbers.`6`
import typingsSlinky.gestalt.gestaltNumbers.`7`
import typingsSlinky.gestalt.gestaltNumbers.`8`
import typingsSlinky.gestalt.gestaltStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskProps extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var rounding: js.UndefOr[circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  
  var wash: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var willChangeTransform: js.UndefOr[Boolean] = js.native
}
object MaskProps {
  
  @scala.inline
  def apply(): MaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskProps]
  }
  
  @scala.inline
  implicit class MaskPropsMutableBuilder[Self <: MaskProps] (val x: Self) extends AnyVal {
    
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
    def setRounding(value: circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    @scala.inline
    def setWash(value: Boolean): Self = StObject.set(x, "wash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWashUndefined: Self = StObject.set(x, "wash", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWillChangeTransform(value: Boolean): Self = StObject.set(x, "willChangeTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillChangeTransformUndefined: Self = StObject.set(x, "willChangeTransform", js.undefined)
  }
}
