package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.headerDashNavigationMod.HeaderNavigationOverrides
import typingsSlinky.baseui.headerDashNavigationMod.HeaderNavigationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderNavigation
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.headerDashNavigationMod.HeaderNavigation] {
  @JSImport("baseui/header-navigation", "HeaderNavigation")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(overrides: HeaderNavigationOverrides = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.baseui.headerDashNavigationMod.HeaderNavigation] = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.headerDashNavigationMod.HeaderNavigation] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.baseui.headerDashNavigationMod.HeaderNavigation](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HeaderNavigationProps
}

