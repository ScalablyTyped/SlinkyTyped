package typingsSlinky.reactNativeFbsdk.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
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

object LoginButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeFbsdk.mod.LoginButton] {
  @JSImport("react-native-fbsdk", "LoginButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    defaultAudience: DefaultAudience = null,
    loginBehaviorAndroid: LoginBehaviorAndroid = null,
    loginBehaviorIOS: LoginBehaviorIOS = null,
    onLoginFinished: (/* error */ js.Object, /* result */ LoginResult) => Unit = null,
    onLogoutFinished: () => Unit = null,
    permissions: js.Array[Permissions] = null,
    style: ViewStyle = null,
    tooltipBehaviorIOS: TooltipBehaviorIOS = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeFbsdk.mod.LoginButton] = {
    val __obj = js.Dynamic.literal()
    if (defaultAudience != null) __obj.updateDynamic("defaultAudience")(defaultAudience.asInstanceOf[js.Any])
    if (loginBehaviorAndroid != null) __obj.updateDynamic("loginBehaviorAndroid")(loginBehaviorAndroid.asInstanceOf[js.Any])
    if (loginBehaviorIOS != null) __obj.updateDynamic("loginBehaviorIOS")(loginBehaviorIOS.asInstanceOf[js.Any])
    if (onLoginFinished != null) __obj.updateDynamic("onLoginFinished")(js.Any.fromFunction2(onLoginFinished))
    if (onLogoutFinished != null) __obj.updateDynamic("onLogoutFinished")(js.Any.fromFunction0(onLogoutFinished))
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltipBehaviorIOS != null) __obj.updateDynamic("tooltipBehaviorIOS")(tooltipBehaviorIOS.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeFbsdk.mod.LoginButton] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeFbsdk.mod.LoginButton](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LoginButtonProps
}

