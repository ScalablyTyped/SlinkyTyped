package typingsSlinky.bizcharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.bizcharts.mod.AlignXType
import typingsSlinky.bizcharts.mod.AlignYType
import typingsSlinky.bizcharts.mod.Guide.HtmlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Html {
  
  @JSImport("bizcharts", "Guide.Html")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Guide.Html] {
    
    @scala.inline
    def alignX(value: AlignXType): this.type = set("alignX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignY(value: AlignYType): this.type = set("alignY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def html(value: String): this.type = set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("position", js.Any.fromFunction2(value))
    
    @scala.inline
    def positionVarargs(value: js.Any*): this.type = set("position", js.Array(value :_*))
    
    @scala.inline
    def position(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HtmlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Html.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
