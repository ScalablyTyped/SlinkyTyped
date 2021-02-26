package typingsSlinky.recharts.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recharts.mod.AnimationEasingType
import typingsSlinky.recharts.mod.ContentRenderer
import typingsSlinky.recharts.mod.DataKey
import typingsSlinky.recharts.mod.RechartsFunction
import typingsSlinky.recharts.mod.TreemapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Treemap {
  
  @JSImport("recharts", "Treemap")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.recharts.mod.Treemap] {
    
    @scala.inline
    def animationBegin(value: Double): this.type = set("animationBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationEasing(value: AnimationEasingType): this.type = set("animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationId(value: Double): this.type = set("animationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def aspectRatio(value: Double): this.type = set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: ReactElement | ContentRenderer[_]): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentFunction1(value: _ => ReactElement): this.type = set("content", js.Any.fromFunction1(value))
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataKey(value: DataKey): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): this.type = set("dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isAnimationActive(value: Boolean): this.type = set("isAnimationActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isUpdateAnimationActive(value: Boolean): this.type = set("isUpdateAnimationActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nameKey(value: String | Double | RechartsFunction): this.type = set("nameKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nameKeyFunction1(value: /* repeated */ js.Any => Unit): this.type = set("nameKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationEnd(value: /* repeated */ js.Any => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationStart(value: /* repeated */ js.Any => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
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
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Treemap.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TreemapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
