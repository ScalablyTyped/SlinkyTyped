package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.bizchartsMod.Guide.Text
import typingsSlinky.antvG2.mod.Styles.text
import typingsSlinky.bizcharts.mod.Guide.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideText {
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Guide.Text")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Text] {
    @scala.inline
    def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def positionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): this.type = set("position", js.Any.fromFunction2(value))
    @scala.inline
    def position(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: text): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GuideText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

