package typingsSlinky.ionicReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicReact.ionicReactStrings.bottom
import typingsSlinky.ionicReact.ionicReactStrings.ios
import typingsSlinky.ionicReact.ionicReactStrings.md
import typingsSlinky.ionicReact.ionicReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonTabBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@ionic/react", "IonTabBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    color: Color = null,
    currentPath: String = null,
    mode: ios | md = null,
    onIonTabsDidChange: /* event */ CustomEvent => Unit = null,
    onIonTabsWillChange: /* event */ CustomEvent => Unit = null,
    selectedTab: String = null,
    slot: bottom | top = null,
    translucent: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (currentPath != null) __obj.updateDynamic("currentPath")(currentPath.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1(onIonTabsDidChange))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1(onIonTabsWillChange))
    if (selectedTab != null) __obj.updateDynamic("selectedTab")(selectedTab.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.ionicReact.ionTabBarMod.Props
}

