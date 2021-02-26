package typingsSlinky.reactVis.mod

import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SunburstPoint extends AbstractSeriesPoint {
  
  var children: js.UndefOr[js.Array[SunburstPoint]] = js.native
  
  var color: js.UndefOr[Double | String] = js.native
  
  var dontRotateLabel: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var title: String = js.native
}
object SunburstPoint {
  
  @scala.inline
  def apply(title: String): SunburstPoint = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SunburstPoint]
  }
  
  @scala.inline
  implicit class SunburstPointMutableBuilder[Self <: SunburstPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[SunburstPoint]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: SunburstPoint*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: Double | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDontRotateLabel(value: Boolean): Self = StObject.set(x, "dontRotateLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontRotateLabelUndefined: Self = StObject.set(x, "dontRotateLabel", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
