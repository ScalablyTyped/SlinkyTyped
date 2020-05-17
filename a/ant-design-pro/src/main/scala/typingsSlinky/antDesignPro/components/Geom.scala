package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.bizcharts.anon.DodgeBy
import typingsSlinky.bizcharts.anon.Name
import typingsSlinky.bizcharts.mod.GeomProps
import typingsSlinky.bizcharts.mod.GeomType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Geom {
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Geom")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Geom] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def adjust(value: String | (js.Array[DodgeBy | String])): this.type = set("adjust", value.asInstanceOf[js.Any])
    @scala.inline
    def animate(value: js.Any): this.type = set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def color(
      value: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String]) | String])
    ): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def line(value: typingsSlinky.antvG2.mod.Styles.line | Boolean): this.type = set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def opacity(value: String | Double | (js.Tuple2[String, js.Function1[/* d */ js.UndefOr[_], Double]])): this.type = set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def select(value: Boolean | (js.Tuple2[Boolean, _])): this.type = set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def shape(
      value: String | (js.Tuple2[String, js.Array[String] | (js.Function1[/* d */ js.UndefOr[_], String])])
    ): this.type = set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def size(
      value: Double | String | (js.Tuple2[
          String, 
          (js.Function1[/* d */ js.UndefOr[_], Double]) | (js.Tuple2[Double, Double])
        ])
    ): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object | (js.Tuple2[String, js.Object])): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: Boolean | String | (js.Tuple2[String, js.Function1[/* repeated */ _, Name]])): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: GeomType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GeomProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Geom.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

