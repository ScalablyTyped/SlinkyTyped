package typingsSlinky.recharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recharts.mod.DataKey
import typingsSlinky.recharts.mod.RechartsFunction
import typingsSlinky.recharts.mod.ScaleType
import typingsSlinky.recharts.mod.ZAxisProps
import typingsSlinky.recharts.rechartsStrings.category
import typingsSlinky.recharts.rechartsStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZAxis {
  
  @JSImport("recharts", "ZAxis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.recharts.mod.ZAxis] {
    
    @scala.inline
    def dataKey(value: DataKey): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): this.type = set("dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def name(value: String | Double): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def range(value: js.Array[Double]): this.type = set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rangeVarargs(value: Double*): this.type = set("range", js.Array(value :_*))
    
    @scala.inline
    def scale(value: ScaleType | RechartsFunction): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleFunction1(value: /* repeated */ js.Any => Unit): this.type = set("scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def `type`(value: number | category): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unit(value: String | Double): this.type = set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zAxisId(value: String | Double): this.type = set("zAxisId", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ZAxis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ZAxisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
