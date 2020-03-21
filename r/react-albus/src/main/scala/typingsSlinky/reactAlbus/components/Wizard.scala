package typingsSlinky.reactAlbus.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactAlbus.mod.WizardContext
import typingsSlinky.reactAlbus.mod.WizardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Wizard
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactAlbus.mod.Wizard] {
  @JSImport("react-albus", "Wizard")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    basename: String = null,
    history: History[LocationState] = null,
    onNext: /* wizard */ WizardContext => Unit = null,
    render: /* wizard */ WizardContext => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactAlbus.mod.Wizard] = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1(onNext))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactAlbus.mod.Wizard] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactAlbus.mod.Wizard](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = WizardProps
}

