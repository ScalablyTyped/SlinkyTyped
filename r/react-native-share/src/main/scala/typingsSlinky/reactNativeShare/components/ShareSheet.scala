package typingsSlinky.reactNativeShare.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeShare.mod.ShareSheetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShareSheet {
  @JSImport("react-native-share", "ShareSheet")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeShare.mod.ShareSheet] {
    @scala.inline
    def overlayStyle(value: StyleProp[ViewProps]): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayStyleNull: this.type = set("overlayStyle", null)
    @scala.inline
    def style(value: StyleProp[ViewProps]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: ShareSheetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onCancel: () => Unit, visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ShareSheetProps]))
  }
}

