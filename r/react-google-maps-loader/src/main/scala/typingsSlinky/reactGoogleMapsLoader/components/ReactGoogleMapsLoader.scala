package typingsSlinky.reactGoogleMapsLoader.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.GoogleMaps
import typingsSlinky.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Params
import typingsSlinky.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Props
import typingsSlinky.reactGoogleMapsLoader.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGoogleMapsLoader {
  
  @scala.inline
  def apply(params: Params, render: (GoogleMaps, js.UndefOr[String]) => ReactElement): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(params = params.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-google-maps-loader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
