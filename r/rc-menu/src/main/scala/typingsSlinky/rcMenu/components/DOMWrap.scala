package typingsSlinky.rcMenu.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcMenu.domwrapMod.DOMWrapProps
import typingsSlinky.rcMenu.domwrapMod.default
import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DOMWrap {
  @JSImport("rc-menu/lib/DOMWrap", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def level(value: Double): this.type = set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: MenuMode): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowedIndicatorReactElement(value: ReactElement): this.type = set("overflowedIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowedIndicator(value: TagMod[Any]): this.type = set("overflowedIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tag(value: String): this.type = set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DOMWrapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DOMWrap.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

