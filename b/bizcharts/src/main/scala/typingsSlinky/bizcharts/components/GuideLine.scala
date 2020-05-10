package typingsSlinky.bizcharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antvG2.mod.Styles.line
import typingsSlinky.bizcharts.AnonAutoRotate
import typingsSlinky.bizcharts.mod.Guide.Line
import typingsSlinky.bizcharts.mod.Guide.LineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideLine {
  @JSImport("bizcharts", "Guide.Line")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Line] {
    @scala.inline
    def endFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("end", js.Any.fromFunction2(value))
    @scala.inline
    def end(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def lineStyle(value: line): this.type = set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def startFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("start", js.Any.fromFunction2(value))
    @scala.inline
    def start(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: AnonAutoRotate): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GuideLine.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

