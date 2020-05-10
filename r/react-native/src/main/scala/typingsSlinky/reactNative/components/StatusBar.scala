package typingsSlinky.reactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StatusBarProps
import typingsSlinky.reactNative.mod.StatusBarStyle
import typingsSlinky.reactNative.reactNativeStrings.fade
import typingsSlinky.reactNative.reactNativeStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatusBar {
  @JSImport("react-native", "StatusBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNative.mod.StatusBar] {
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def barStyle(value: StatusBarStyle): this.type = set("barStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def networkActivityIndicatorVisible(value: Boolean): this.type = set("networkActivityIndicatorVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def showHideTransition(value: fade | slide): this.type = set("showHideTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def translucent(value: Boolean): this.type = set("translucent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatusBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatusBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

