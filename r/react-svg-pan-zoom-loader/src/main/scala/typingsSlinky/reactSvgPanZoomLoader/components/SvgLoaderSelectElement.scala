package typingsSlinky.reactSvgPanZoomLoader.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSvgPanZoomLoader.mod.SvgLoaderSelectElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SvgLoaderSelectElement {
  
  @scala.inline
  def apply(selector: String): Builder = {
    val __props = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SvgLoaderSelectElementProps]))
  }
  
  @JSImport("react-svg-pan-zoom-loader", "SvgLoaderSelectElement")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SvgLoaderSelectElementProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
