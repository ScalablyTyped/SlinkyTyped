package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.protonNative.anon.W
import typingsSlinky.protonNative.anon.Y
import typingsSlinky.protonNative.mod.WindowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Window {
  @JSImport("proton-native", "Window")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.protonNative.mod.Window] {
    @scala.inline
    def borderless(value: Boolean): this.type = set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def closed(value: Boolean): this.type = set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def lastWindow(value: Boolean): this.type = set("lastWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def margined(value: Boolean): this.type = set("margined", value.asInstanceOf[js.Any])
    @scala.inline
    def menuBar(value: Boolean): this.type = set("menuBar", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def onContentSizeChange(value: /* size */ Y => Unit): this.type = set("onContentSizeChange", js.Any.fromFunction1(value))
    @scala.inline
    def size(value: W): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: WindowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Window.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

