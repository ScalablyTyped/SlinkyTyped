package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineStyle extends StObject {
  
  var lineStyle: js.UndefOr[typingsSlinky.echarts.echarts.EChartOption.LineStyle] = js.native
  
  /**
    * Set this to false to prevent the splitLine from showing
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.native
}
object LineStyle {
  
  @scala.inline
  def apply(): LineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyle]
  }
  
  @scala.inline
  implicit class LineStyleMutableBuilder[Self <: LineStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineStyle(value: typingsSlinky.echarts.echarts.EChartOption.LineStyle): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
