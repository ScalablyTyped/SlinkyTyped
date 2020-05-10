package typingsSlinky.reactSmoothScrollbar.components

import org.scalajs.dom.raw.EventTarget
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSmoothScrollbar.mod.ScrollbarProps
import typingsSlinky.reactSmoothScrollbar.mod.^
import typingsSlinky.smoothScrollbar.mod.default
import typingsSlinky.smoothScrollbar.scrollbarMod.ScrollStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSmoothScrollbar {
  @JSImport("react-smooth-scrollbar", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def alwaysShowTracks(value: Boolean): this.type = set("alwaysShowTracks", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def continuousScrolling(value: Boolean): this.type = set("continuousScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def damping(value: Double): this.type = set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def delegateTo(value: EventTarget): this.type = set("delegateTo", value.asInstanceOf[js.Any])
    @scala.inline
    def onScroll(value: (/* status */ ScrollStatus, /* scrollbarInstance */ default) => Unit): this.type = set("onScroll", js.Any.fromFunction2(value))
    @scala.inline
    def plugins(value: js.Any): this.type = set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def renderByPixels(value: Boolean): this.type = set("renderByPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def thumbMinSize(value: Double): this.type = set("thumbMinSize", value.asInstanceOf[js.Any])
    @scala.inline
    def wheelEventTarget(value: EventTarget): this.type = set("wheelEventTarget", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScrollbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactSmoothScrollbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

