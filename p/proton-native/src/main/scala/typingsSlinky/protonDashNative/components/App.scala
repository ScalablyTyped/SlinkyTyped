package typingsSlinky.protonDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.protonDashNative.protonDashNativeMod.AppProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object App
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.protonDashNative.protonDashNativeMod.App] {
  @JSImport("proton-native", "App")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(onShouldQuit: () => Unit = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.protonDashNative.protonDashNativeMod.App] = {
    val __obj = js.Dynamic.literal()
    if (onShouldQuit != null) __obj.updateDynamic("onShouldQuit")(js.Any.fromFunction0(onShouldQuit))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.protonDashNative.protonDashNativeMod.App] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.protonDashNative.protonDashNativeMod.App](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AppProps
}

