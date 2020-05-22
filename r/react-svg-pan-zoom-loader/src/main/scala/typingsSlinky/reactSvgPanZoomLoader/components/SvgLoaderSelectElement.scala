package typingsSlinky.reactSvgPanZoomLoader.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSvgPanZoomLoader.mod.SvgLoaderSelectElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SvgLoaderSelectElement {
  @JSImport("react-svg-pan-zoom-loader", "SvgLoaderSelectElement")
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgLoaderSelectElementProps): Default[tag.type, typingsSlinky.reactSvgPanZoomLoader.mod.SvgLoaderSelectElement] = new Default[tag.type, typingsSlinky.reactSvgPanZoomLoader.mod.SvgLoaderSelectElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(selector: String): Default[tag.type, typingsSlinky.reactSvgPanZoomLoader.mod.SvgLoaderSelectElement] = {
    val __props = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactSvgPanZoomLoader.mod.SvgLoaderSelectElement](js.Array(this.component, __props.asInstanceOf[SvgLoaderSelectElementProps]))
  }
}

