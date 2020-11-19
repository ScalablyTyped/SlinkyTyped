package typingsSlinky.reactEasyChart.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactEasyChart.anon.ColorString
import typingsSlinky.reactEasyChart.mod.LegendProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Legend {
  
  @JSImport("react-easy-chart", "Legend")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactEasyChart.mod.Legend] {
    
    @scala.inline
    def configVarargs(value: ColorString*): this.type = set("config", js.Array(value :_*))
    
    @scala.inline
    def config(value: js.Array[ColorString]): this.type = set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[_], dataId: String): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataId = dataId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LegendProps]))
  }
}
