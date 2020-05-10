package typingsSlinky.reactNativeMaterialMenu.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeMaterialMenu.mod.MenuProps
import typingsSlinky.reactNativeMaterialMenu.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeMaterialMenu {
  @JSImport("react-native-material-menu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def button(value: ReactElement): this.type = set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def onHidden(value: () => Unit): this.type = set("onHidden", js.Any.fromFunction0(value))
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeMaterialMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

