package typingsSlinky.recharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recharts.anon.PartialMargin
import typingsSlinky.recharts.mod.BrushProps
import typingsSlinky.recharts.mod.DataKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Brush {
  
  @JSImport("recharts", "Brush")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.recharts.mod.Brush] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataKey(value: DataKey): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): this.type = set("dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def endIndex(value: Double): this.type = set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gap(value: Double): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leaveTimeOut(value: Double): this.type = set("leaveTimeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* repeated */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def padding(value: PartialMargin): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startIndex(value: Double): this.type = set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickFormatter(value: /* value */ js.Any => js.Any): this.type = set("tickFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def travellerWidth(value: Double): this.type = set("travellerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def updateId(value: String | Double): this.type = set("updateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Brush.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BrushProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
