package typingsSlinky.reactNativeFbsdk.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeFbsdk.mod.ShareButtonProps
import typingsSlinky.reactNativeFbsdk.mod.ShareContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShareButton {
  @JSImport("react-native-fbsdk", "ShareButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeFbsdk.mod.ShareButton] {
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ShareButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(shareContent: ShareContent): Builder = {
    val __props = js.Dynamic.literal(shareContent = shareContent.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ShareButtonProps]))
  }
}

