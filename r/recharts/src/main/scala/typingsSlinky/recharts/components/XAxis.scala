package typingsSlinky.recharts.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recharts.mod.AxisDomain
import typingsSlinky.recharts.mod.AxisInterval
import typingsSlinky.recharts.mod.ContentRenderer
import typingsSlinky.recharts.mod.DataKey
import typingsSlinky.recharts.mod.LabelProps
import typingsSlinky.recharts.mod.RechartsFunction
import typingsSlinky.recharts.mod.ScaleType
import typingsSlinky.recharts.mod.XAxisProps
import typingsSlinky.recharts.mod.XPadding
import typingsSlinky.recharts.rechartsStrings.bottom
import typingsSlinky.recharts.rechartsStrings.category
import typingsSlinky.recharts.rechartsStrings.number
import typingsSlinky.recharts.rechartsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XAxis {
  
  @JSImport("recharts", "XAxis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.recharts.mod.XAxis] {
    
    @scala.inline
    def allowDataOverflow(value: Boolean): this.type = set("allowDataOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowDecimals(value: Boolean): this.type = set("allowDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowDuplicatedCategory(value: Boolean): this.type = set("allowDuplicatedCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def angle(value: Double): this.type = set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def axisLine(value: Boolean | js.Object): this.type = set("axisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataKey(value: DataKey): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): this.type = set("dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def domain(value: js.Tuple2[AxisDomain, AxisDomain]): this.type = set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dx(value: Double): this.type = set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dy(value: Double): this.type = set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hide(value: Boolean): this.type = set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def interval(value: AxisInterval): this.type = set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String | Double | typingsSlinky.recharts.mod.Label | LabelProps): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minTickGap(value: Double): this.type = set("minTickGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mirror(value: Boolean): this.type = set("mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String | Double): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* repeated */ js.Any => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: /* repeated */ js.Any => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: /* repeated */ js.Any => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: /* repeated */ js.Any => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: /* repeated */ js.Any => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOut(value: /* repeated */ js.Any => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: /* repeated */ js.Any => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: /* repeated */ js.Any => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: /* repeated */ js.Any => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: /* repeated */ js.Any => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: /* repeated */ js.Any => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: /* repeated */ js.Any => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def orientation(value: top | bottom): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: XPadding): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reversed(value: Boolean): this.type = set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: ScaleType | RechartsFunction): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleFunction1(value: /* repeated */ js.Any => Unit): this.type = set("scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAnchor(value: String): this.type = set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tick(value: Boolean | ContentRenderer[_] | js.Object | ReactElement): this.type = set("tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickCount(value: Double): this.type = set("tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickFormatter(value: /* value */ js.Any => js.Any): this.type = set("tickFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def tickFunction1(value: _ => ReactElement): this.type = set("tick", js.Any.fromFunction1(value))
    
    @scala.inline
    def tickLine(value: Boolean | js.Object): this.type = set("tickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickMargin(value: Double): this.type = set("tickMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickReactElement(value: ReactElement): this.type = set("tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickSize(value: Double): this.type = set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ticks(value: js.Array[_]): this.type = set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ticksVarargs(value: js.Any*): this.type = set("ticks", js.Array(value :_*))
    
    @scala.inline
    def `type`(value: number | category): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unit(value: String | Double): this.type = set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xAxisId(value: String | Double): this.type = set("xAxisId", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: XAxis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: XAxisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
