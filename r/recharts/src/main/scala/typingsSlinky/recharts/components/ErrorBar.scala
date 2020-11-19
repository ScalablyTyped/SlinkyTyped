package typingsSlinky.recharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recharts.anon.ErrorVal
import typingsSlinky.recharts.mod.DataKey
import typingsSlinky.recharts.mod.ErrorBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorBar {
  
  @JSImport("recharts", "ErrorBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.recharts.mod.ErrorBar] {
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataPointFormatter(value: (/* entry */ js.Any, /* dataKey */ DataKey) => ErrorVal): this.type = set("dataPointFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def layout(value: String): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xAxis(value: js.Object): this.type = set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yAxis(value: js.Object): this.type = set("yAxis", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ErrorBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(dataKey: DataKey): Builder = {
    val __props = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ErrorBarProps]))
  }
}
