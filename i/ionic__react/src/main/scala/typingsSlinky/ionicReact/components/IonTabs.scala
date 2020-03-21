package typingsSlinky.ionicReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IonTabs
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.ionicReact.mod.IonTabs] {
  @JSImport("@ionic/react", "IonTabs")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onIonTabsDidChange: /* event */ CustomEvent => Unit = null,
    onIonTabsWillChange: /* event */ CustomEvent => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.ionicReact.mod.IonTabs] = {
    val __obj = js.Dynamic.literal()
    if (onIonTabsDidChange != null) __obj.updateDynamic("onIonTabsDidChange")(js.Any.fromFunction1(onIonTabsDidChange))
    if (onIonTabsWillChange != null) __obj.updateDynamic("onIonTabsWillChange")(js.Any.fromFunction1(onIonTabsWillChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.ionicReact.mod.IonTabs] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.ionicReact.mod.IonTabs](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.ionicReact.ionTabsMod.Props
}

