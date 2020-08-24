package typingsSlinky.reactGoogleMapsLoader.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.GoogleMaps
import typingsSlinky.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Params
import typingsSlinky.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Props
import typingsSlinky.reactGoogleMapsLoader.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGoogleMapsLoader {
  @JSImport("react-google-maps-loader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(params: Params, render: (GoogleMaps, js.UndefOr[String]) => ReactElement): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(params = params.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

