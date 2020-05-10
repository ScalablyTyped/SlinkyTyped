package typingsSlinky.reactCartographer.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCartographer.mapMod.MapProps
import typingsSlinky.reactCartographer.mapMod.default
import typingsSlinky.reactCartographer.reactCartographerStrings.bing
import typingsSlinky.reactCartographer.reactCartographerStrings.google
import typingsSlinky.reactCartographer.reactCartographerStrings.yahoo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Map {
  @JSImport("react-cartographer/lib/components/Map", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def addressLine1(value: String): this.type = set("addressLine1", value.asInstanceOf[js.Any])
    @scala.inline
    def city(value: String): this.type = set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def country(value: String): this.type = set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def latitude(value: Double): this.type = set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def longitude(value: Double): this.type = set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def state(value: String): this.type = set("state", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    height: Double,
    mapId: String,
    provider: yahoo | google | bing,
    providerKey: String,
    useBackgroundImageStyle: Boolean,
    width: Double,
    zoom: Double
  ): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], providerKey = providerKey.asInstanceOf[js.Any], useBackgroundImageStyle = useBackgroundImageStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MapProps]))
  }
}

