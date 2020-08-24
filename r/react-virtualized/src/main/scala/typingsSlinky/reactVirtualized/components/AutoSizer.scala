package typingsSlinky.reactVirtualized.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esAutoSizerMod.AutoSizerProps
import typingsSlinky.reactVirtualized.esAutoSizerMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoSizer {
  @JSImport("react-virtualized", "AutoSizer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.AutoSizer] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultHeight(value: Double): this.type = set("defaultHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultWidth(value: Double): this.type = set("defaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def disableHeight(value: Boolean): this.type = set("disableHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def disableWidth(value: Boolean): this.type = set("disableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def onResize(value: /* info */ Size => _): this.type = set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoSizerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: Size => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[AutoSizerProps]))
  }
}

