package typingsSlinky.bizcharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.bizcharts.bizchartsStrings.downward
import typingsSlinky.bizcharts.bizchartsStrings.upward
import typingsSlinky.bizcharts.mod.Guide.DataRegionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataRegion {
  
  @JSImport("bizcharts", "Guide.DataRegion")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Guide.DataRegion] {
    
    @scala.inline
    def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: upward | downward): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def display(value: js.Object): this.type = set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("end", js.Any.fromFunction2(value))
    
    @scala.inline
    def endVarargs(value: js.Any*): this.type = set("end", js.Array(value :_*))
    
    @scala.inline
    def end(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineLength(value: Double): this.type = set("lineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def regionStyle(value: js.Object): this.type = set("regionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def startVarargs(value: js.Any*): this.type = set("start", js.Array(value :_*))
    
    @scala.inline
    def start(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DataRegionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DataRegion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
