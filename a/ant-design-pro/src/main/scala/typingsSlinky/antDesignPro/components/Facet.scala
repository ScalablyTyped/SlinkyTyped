package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.bizcharts.anon.OffsetX
import typingsSlinky.bizcharts.anon.OffsetY
import typingsSlinky.bizcharts.mod.FacetProps
import typingsSlinky.bizcharts.mod.FacetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Facet {
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Facet")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Facet] {
    
    @scala.inline
    def autoSetAxis(value: Boolean): this.type = set("autoSetAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colTitle(value: OffsetY): this.type = set("colTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eachView(value: (/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any]) => Unit): this.type = set("eachView", js.Any.fromFunction2(value))
    
    @scala.inline
    def fieldsVarargs(value: js.Any*): this.type = set("fields", js.Array(value :_*))
    
    @scala.inline
    def fields(value: String | js.Array[_]): this.type = set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginVarargs(value: Double*): this.type = set("margin", js.Array(value :_*))
    
    @scala.inline
    def margin(value: Double | js.Array[Double]): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingVarargs(value: Double*): this.type = set("padding", js.Array(value :_*))
    
    @scala.inline
    def padding(value: Double | js.Array[Double]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowTitle(value: OffsetX): this.type = set("rowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTitle(value: Boolean): this.type = set("showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: FacetType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FacetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Facet.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
