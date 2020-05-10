package typingsSlinky.antdMobileRn.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.marqueeNativeMod.MarqueeProps
import typingsSlinky.antdMobileRn.marqueeNativeMod.default
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MarqueeDotnative {
  @JSImport("antd-mobile-rn/lib/notice-bar/Marquee.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def fps(value: Double): this.type = set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def leading(value: Double): this.type = set("leading", value.asInstanceOf[js.Any])
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[TextStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def text(value: TagMod[Any]): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def trailing(value: Double): this.type = set("trailing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MarqueeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MarqueeDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

