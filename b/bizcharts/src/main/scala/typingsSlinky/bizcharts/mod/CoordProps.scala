package typingsSlinky.bizcharts.mod

import typingsSlinky.bizcharts.bizchartsStrings.x
import typingsSlinky.bizcharts.bizchartsStrings.y
import typingsSlinky.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordProps
  extends Props[js.Any] {
  
  var endAngle: js.UndefOr[Double] = js.native
  
  var innerRadius: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var reflect: js.UndefOr[x | y] = js.native
  
  var rotate: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var startAngle: js.UndefOr[Double] = js.native
  
  var transpose: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[CoordType] = js.native
}
object CoordProps {
  
  @scala.inline
  def apply(): CoordProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordProps]
  }
  
  @scala.inline
  implicit class CoordPropsMutableBuilder[Self <: CoordProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setReflect(value: typingsSlinky.bizcharts.bizchartsStrings.x | y): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setScale(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
    
    @scala.inline
    def setType(value: CoordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
