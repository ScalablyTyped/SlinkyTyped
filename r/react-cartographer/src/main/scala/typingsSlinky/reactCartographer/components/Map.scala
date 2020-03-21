package typingsSlinky.reactCartographer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactCartographer.mapMod.MapProps
import typingsSlinky.reactCartographer.mapMod.default
import typingsSlinky.reactCartographer.reactCartographerStrings.bing
import typingsSlinky.reactCartographer.reactCartographerStrings.google
import typingsSlinky.reactCartographer.reactCartographerStrings.yahoo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Map
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-cartographer/lib/components/Map", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    height: Double,
    mapId: String,
    provider: yahoo | google | bing,
    providerKey: String,
    useBackgroundImageStyle: Boolean,
    width: Double,
    zoom: Double,
    addressLine1: String = null,
    city: String = null,
    country: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    state: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], providerKey = providerKey.asInstanceOf[js.Any], useBackgroundImageStyle = useBackgroundImageStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    if (addressLine1 != null) __obj.updateDynamic("addressLine1")(addressLine1.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MapProps
}

