package typingsSlinky.reactSvgPanZoomLoader.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSvgPanZoomLoader.mod.ReactSvgPanZoomLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSvgPanZoomLoader {
  @JSImport("react-svg-pan-zoom-loader", "ReactSvgPanZoomLoader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def proxyReactElement(value: ReactElement): this.type = set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def proxy(value: ReactElement): this.type = set("proxy", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactSvgPanZoomLoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(render: ReactElement => ReactElement, src: String): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render), src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactSvgPanZoomLoaderProps]))
  }
}

