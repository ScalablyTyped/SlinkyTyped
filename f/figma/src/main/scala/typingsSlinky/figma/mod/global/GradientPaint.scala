package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.GRADIENT_ANGULAR
import typingsSlinky.figma.figmaStrings.GRADIENT_DIAMOND
import typingsSlinky.figma.figmaStrings.GRADIENT_LINEAR
import typingsSlinky.figma.figmaStrings.GRADIENT_RADIAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientPaint extends Paint {
  
  val blendMode: js.UndefOr[BlendMode] = js.native
  
  val gradientStops: js.Array[ColorStop] = js.native
  
  val gradientTransform: Transform = js.native
  
  val opacity: js.UndefOr[Double] = js.native
  
  val `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND = js.native
  
  val visible: js.UndefOr[Boolean] = js.native
}
object GradientPaint {
  
  @scala.inline
  def apply(
    gradientStops: js.Array[ColorStop],
    gradientTransform: Transform,
    `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND
  ): GradientPaint = {
    val __obj = js.Dynamic.literal(gradientStops = gradientStops.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientPaint]
  }
  
  @scala.inline
  implicit class GradientPaintMutableBuilder[Self <: GradientPaint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    @scala.inline
    def setGradientStops(value: js.Array[ColorStop]): Self = StObject.set(x, "gradientStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientStopsVarargs(value: ColorStop*): Self = StObject.set(x, "gradientStops", js.Array(value :_*))
    
    @scala.inline
    def setGradientTransform(value: Transform): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setType(value: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
