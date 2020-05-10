package typingsSlinky.reactVega.components

import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVega.AnonBottom
import typingsSlinky.reactVega.mod.VegaPropsWithSpec
import typingsSlinky.reactVega.mod.default
import typingsSlinky.std.Record
import typingsSlinky.vegaTypings.mod.View
import typingsSlinky.vegaTypings.runtimeMod.Item
import typingsSlinky.vegaTypings.specMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactVega {
  @JSImport("react-vega", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def data(value: Record[String, js.Array[_]]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def enableHover(value: Boolean): this.type = set("enableHover", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def logLevel(value: Double): this.type = set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def onNewView(value: /* view */ View => Unit): this.type = set("onNewView", js.Any.fromFunction1(value))
    @scala.inline
    def onParseError(value: /* error */ js.Error => Unit): this.type = set("onParseError", js.Any.fromFunction1(value))
    @scala.inline
    def padding(value: Double | AnonBottom): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def renderer(value: String): this.type = set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(
      value: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit
    ): this.type = set("tooltip", js.Any.fromFunction4(value))
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VegaPropsWithSpec): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(spec: Spec): Builder = {
    val __props = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VegaPropsWithSpec]))
  }
}

