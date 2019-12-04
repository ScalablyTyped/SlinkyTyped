package typingsSlinky.expo.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.expo.buildLaunchAppLoadingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppLoading
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("expo/build/launch/AppLoading", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onError */
  def Anon_AutoHideSplash(
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    onFinish: () => Unit = null,
    startAsync: () => js.Promise[Unit] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash.asInstanceOf[js.Any])
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction0(onFinish))
    if (startAsync != null) __obj.updateDynamic("startAsync")(js.Any.fromFunction0(startAsync))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  /* The following DOM/SVG props were specified: onError */
  def Anon_OnError(onError: Null, onFinish: Null, startAsync: Null, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.expo.buildLaunchAppLoadingMod.Props
}

