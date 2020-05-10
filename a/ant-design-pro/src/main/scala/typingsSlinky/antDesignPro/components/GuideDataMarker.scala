package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.bizchartsMod.Guide.DataMarker
import typingsSlinky.bizcharts.bizchartsStrings.downward
import typingsSlinky.bizcharts.bizchartsStrings.upward
import typingsSlinky.bizcharts.mod.Guide.DataMarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideDataMarker {
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.DataMarker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, DataMarker] {
    @scala.inline
    def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: upward | downward): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def display(value: js.Object): this.type = set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def lineLength(value: Double): this.type = set("lineLength", value.asInstanceOf[js.Any])
    @scala.inline
    def positionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("position", js.Any.fromFunction2(value))
    @scala.inline
    def position(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DataMarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GuideDataMarker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

