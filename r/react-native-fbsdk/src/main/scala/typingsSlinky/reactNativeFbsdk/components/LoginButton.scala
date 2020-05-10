package typingsSlinky.reactNativeFbsdk.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeFbsdk.mod.DefaultAudience
import typingsSlinky.reactNativeFbsdk.mod.LoginBehaviorAndroid
import typingsSlinky.reactNativeFbsdk.mod.LoginBehaviorIOS
import typingsSlinky.reactNativeFbsdk.mod.LoginButtonProps
import typingsSlinky.reactNativeFbsdk.mod.LoginResult
import typingsSlinky.reactNativeFbsdk.mod.Permissions
import typingsSlinky.reactNativeFbsdk.mod.TooltipBehaviorIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LoginButton {
  @JSImport("react-native-fbsdk", "LoginButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeFbsdk.mod.LoginButton] {
    @scala.inline
    def defaultAudience(value: DefaultAudience): this.type = set("defaultAudience", value.asInstanceOf[js.Any])
    @scala.inline
    def loginBehaviorAndroid(value: LoginBehaviorAndroid): this.type = set("loginBehaviorAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def loginBehaviorIOS(value: LoginBehaviorIOS): this.type = set("loginBehaviorIOS", value.asInstanceOf[js.Any])
    @scala.inline
    def onLoginFinished(value: (/* error */ js.Object, /* result */ LoginResult) => Unit): this.type = set("onLoginFinished", js.Any.fromFunction2(value))
    @scala.inline
    def onLogoutFinished(value: () => Unit): this.type = set("onLogoutFinished", js.Any.fromFunction0(value))
    @scala.inline
    def permissions(value: js.Array[Permissions]): this.type = set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipBehaviorIOS(value: TooltipBehaviorIOS): this.type = set("tooltipBehaviorIOS", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoginButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LoginButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

