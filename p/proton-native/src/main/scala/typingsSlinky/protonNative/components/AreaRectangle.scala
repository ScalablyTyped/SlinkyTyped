package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.protonNative.anon.H
import typingsSlinky.protonNative.anon.X
import typingsSlinky.protonNative.mod.AreaRectangleProps
import typingsSlinky.protonNative.protonNativeStrings.bevel
import typingsSlinky.protonNative.protonNativeStrings.flat
import typingsSlinky.protonNative.protonNativeStrings.miter
import typingsSlinky.protonNative.protonNativeStrings.round
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AreaRectangle {
  
  @scala.inline
  def apply(height: Double | String, width: Double | String, x: Double | String, y: Double | String): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AreaRectangleProps]))
  }
  
  @JSImport("proton-native", "AreaRectangle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.protonNative.mod.AreaRectangle] {
    
    @scala.inline
    def align(value: H): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expand(value: H): this.type = set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillOpacity(value: Double): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def span(value: X): this.type = set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stretchy(value: Boolean): this.type = set("stretchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinecap(value: flat | round | bevel): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinejoin(value: miter | round | bevel): this.type = set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeMiterlimit(value: Double): this.type = set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeOpacity(value: Double): this.type = set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transform(value: String): this.type = set("transform", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AreaRectangleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
