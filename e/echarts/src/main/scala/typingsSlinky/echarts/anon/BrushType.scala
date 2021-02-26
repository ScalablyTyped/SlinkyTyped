package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrushType extends StObject {
  
  /**
    * The brush type for ripples.
    * options: `'stroke'` and `'fill'`.
    *
    *
    * @default
    * "fill"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.brushType
    */
  var brushType: js.UndefOr[String] = js.native
  
  /**
    * The period duration of animation, in seconds.
    *
    *
    * @default
    * 4
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.period
    */
  var period: js.UndefOr[Double] = js.native
  
  /**
    * The maximum zooming scale of ripples in animation.
    *
    *
    * @default
    * 2.5
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.scale
    */
  var scale: js.UndefOr[Double] = js.native
}
object BrushType {
  
  @scala.inline
  def apply(): BrushType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrushType]
  }
  
  @scala.inline
  implicit class BrushTypeMutableBuilder[Self <: BrushType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrushType(value: String): Self = StObject.set(x, "brushType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrushTypeUndefined: Self = StObject.set(x, "brushType", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
