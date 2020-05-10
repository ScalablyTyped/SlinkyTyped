package typingsSlinky.reactStickyBox.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactStickyBox.mod.StickyBoxMode
import typingsSlinky.reactStickyBox.mod.StickyBoxProps
import typingsSlinky.reactStickyBox.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactStickyBox {
  @JSImport("react-sticky-box", "default")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def bottom(value: Boolean): this.type = set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def offsetBottom(value: Double): this.type = set("offsetBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def onChangeMode(value: (/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode) => _): this.type = set("onChangeMode", js.Any.fromFunction2(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StickyBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactStickyBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

