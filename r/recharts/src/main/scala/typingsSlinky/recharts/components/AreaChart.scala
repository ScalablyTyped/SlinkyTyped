package typingsSlinky.recharts.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recharts.anon.PartialMargin
import typingsSlinky.recharts.mod.AreaChartProps
import typingsSlinky.recharts.mod.BaseValueType
import typingsSlinky.recharts.mod.LayoutType
import typingsSlinky.recharts.mod.StackOffsetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AreaChart {
  
  @JSImport("recharts", "AreaChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.recharts.mod.AreaChart] {
    
    @scala.inline
    def barCategoryGap(value: Double | String): this.type = set("barCategoryGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def barGap(value: Double | String): this.type = set("barGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def barSize(value: Double | String): this.type = set("barSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baseValue(value: BaseValueType): this.type = set("baseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: ReactElement | js.Array[ReactElement]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: js.Array[js.Object]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Object*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: LayoutType): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def margin(value: PartialMargin): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxBarSize(value: Double): this.type = set("maxBarSize", value.asInstanceOf[js.Any])
    
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
    def reverseStackOrder(value: Boolean): this.type = set("reverseStackOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stackOffset(value: StackOffsetType): this.type = set("stackOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def syncId(value: String | Double): this.type = set("syncId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def throttleDelay(value: Double): this.type = set("throttleDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AreaChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AreaChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
