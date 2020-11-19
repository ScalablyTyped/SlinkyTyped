package typingsSlinky.bizcharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.bizcharts.mod.Guide.ImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  @JSImport("bizcharts", "Guide.Image")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Guide.Image] {
    
    @scala.inline
    def endFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("end", js.Any.fromFunction2(value))
    
    @scala.inline
    def endVarargs(value: js.Any*): this.type = set("end", js.Array(value :_*))
    
    @scala.inline
    def end(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def startVarargs(value: js.Any*): this.type = set("start", js.Array(value :_*))
    
    @scala.inline
    def start(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Image.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
