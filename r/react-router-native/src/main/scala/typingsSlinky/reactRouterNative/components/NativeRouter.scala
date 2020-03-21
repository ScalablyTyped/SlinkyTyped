package typingsSlinky.reactRouterNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactRouterNative.mod.NativeRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeRouter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactRouterNative.mod.NativeRouter] {
  @JSImport("react-router-native", "NativeRouter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    getUserConfirmation: js.Function = null,
    initialEntries: js.Array[String] = null,
    initialIndex: Int | Double = null,
    keyLength: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactRouterNative.mod.NativeRouter] = {
    val __obj = js.Dynamic.literal()
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(getUserConfirmation.asInstanceOf[js.Any])
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactRouterNative.mod.NativeRouter] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactRouterNative.mod.NativeRouter](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NativeRouterProps
}

