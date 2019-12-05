package typingsSlinky.reactDashGoogleDashMapsDashLoader.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashGoogleDashMapsDashLoader.reactDashGoogleDashMapsDashLoaderMod.ReactGoogleMapsLoader.GoogleMaps
import typingsSlinky.reactDashGoogleDashMapsDashLoader.reactDashGoogleDashMapsDashLoaderMod.ReactGoogleMapsLoader.Params
import typingsSlinky.reactDashGoogleDashMapsDashLoader.reactDashGoogleDashMapsDashLoaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashGoogleDashMapsDashLoader
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-google-maps-loader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    params: Params,
    render: (GoogleMaps, js.UndefOr[String]) => TagMod[Any],
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashGoogleDashMapsDashLoader.reactDashGoogleDashMapsDashLoaderMod.ReactGoogleMapsLoader.Props
}

