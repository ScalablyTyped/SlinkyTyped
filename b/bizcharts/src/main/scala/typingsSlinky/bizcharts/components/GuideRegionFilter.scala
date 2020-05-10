package typingsSlinky.bizcharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.bizcharts.mod.Guide.RegionFilter
import typingsSlinky.bizcharts.mod.Guide.RegionFilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideRegionFilter {
  @JSImport("bizcharts", "Guide.RegionFilter")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, RegionFilter] {
    @scala.inline
    def apply(value: js.Array[_]): this.type = set("apply", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def endFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("end", js.Any.fromFunction2(value))
    @scala.inline
    def end(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def startFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("start", js.Any.fromFunction2(value))
    @scala.inline
    def start(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RegionFilterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GuideRegionFilter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

