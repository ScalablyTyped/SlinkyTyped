package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.messageStripMod.MessageStripProps
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MessageStrip {
  @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def buttonProps(value: js.Any): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def dismissible(value: Boolean): this.type = set("dismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def link(value: String): this.type = set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def linkProps(value: js.Any): this.type = set("linkProps", value.asInstanceOf[js.Any])
    @scala.inline
    def linkText(value: String): this.type = set("linkText", value.asInstanceOf[js.Any])
    @scala.inline
    def localizedText(value: js.Any): this.type = set("localizedText", value.asInstanceOf[js.Any])
    @scala.inline
    def noGlyph(value: Boolean): this.type = set("noGlyph", value.asInstanceOf[js.Any])
    @scala.inline
    def onCloseClicked(value: /* repeated */ js.Any => _): this.type = set("onCloseClicked", js.Any.fromFunction1(value))
    @scala.inline
    def `type`(value: js.Any): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[MessageStripProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MessageStrip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

