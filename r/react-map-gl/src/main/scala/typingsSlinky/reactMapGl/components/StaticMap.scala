package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMapGl.AnonHeight
import typingsSlinky.reactMapGl.AnonMaxPitch
import typingsSlinky.reactMapGl.mod.MapError
import typingsSlinky.reactMapGl.mod.MapLoadEvent
import typingsSlinky.reactMapGl.mod.MapRequest
import typingsSlinky.reactMapGl.mod.StaticMapProps
import typingsSlinky.reactMapGl.mod.ViewState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticMap {
  @JSImport("react-map-gl", "StaticMap")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.StaticMap] {
    @scala.inline
    def altitude(value: Double): this.type = set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def attributionControl(value: Boolean): this.type = set("attributionControl", value.asInstanceOf[js.Any])
    @scala.inline
    def bearing(value: Double): this.type = set("bearing", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def container(value: js.Object): this.type = set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def disableTokenWarning(value: Boolean): this.type = set("disableTokenWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def gl(value: js.Object): this.type = set("gl", value.asInstanceOf[js.Any])
    @scala.inline
    def latitude(value: Double): this.type = set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def longitude(value: Double): this.type = set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def mapOptions(value: js.Object): this.type = set("mapOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def mapStyle(value: String | js.Object): this.type = set("mapStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def mapboxApiAccessToken(value: String): this.type = set("mapboxApiAccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def mapboxApiUrl(value: String): this.type = set("mapboxApiUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def onError(value: /* e */ MapError => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: /* event */ MapLoadEvent => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onResize(value: /* dimensions */ AnonHeight => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def pitch(value: Double): this.type = set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def preserveDrawingBuffer(value: Boolean): this.type = set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def preventStyleDiffing(value: Boolean): this.type = set("preventStyleDiffing", value.asInstanceOf[js.Any])
    @scala.inline
    def reuseMap(value: Boolean): this.type = set("reuseMap", value.asInstanceOf[js.Any])
    @scala.inline
    def reuseMaps(value: Boolean): this.type = set("reuseMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def transformRequest(value: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest): this.type = set("transformRequest", js.Any.fromFunction2(value))
    @scala.inline
    def viewState(value: ViewState): this.type = set("viewState", value.asInstanceOf[js.Any])
    @scala.inline
    def visibilityConstraints(value: AnonMaxPitch): this.type = set("visibilityConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StaticMapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(height: Double | String, width: Double | String): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StaticMapProps]))
  }
}

