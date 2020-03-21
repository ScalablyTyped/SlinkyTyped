package typingsSlinky.rcFieldForm.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcFieldForm.fieldMod.FieldProps
import typingsSlinky.rcFieldForm.fieldMod.ShouldUpdate
import typingsSlinky.rcFieldForm.fieldMod.default
import typingsSlinky.rcFieldForm.interfaceMod.EventArgs
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.interfaceMod.Rule
import typingsSlinky.rcFieldForm.interfaceMod.Store
import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Field
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-field-form/lib/Field", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    dependencies: js.Array[NamePath] = null,
    getValueFromEvent: /* args */ EventArgs => StoreValue = null,
    name: NamePath = null,
    normalize: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue = null,
    onReset: () => Unit = null,
    rules: js.Array[Rule] = null,
    shouldUpdate: ShouldUpdate = null,
    trigger: String = null,
    validateFirst: js.UndefOr[Boolean] = js.undefined,
    validateTrigger: String | js.Array[String] | `false` = null,
    valuePropName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (getValueFromEvent != null) __obj.updateDynamic("getValueFromEvent")(js.Any.fromFunction1(getValueFromEvent))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction3(normalize))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(shouldUpdate.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(validateFirst)) __obj.updateDynamic("validateFirst")(validateFirst.asInstanceOf[js.Any])
    if (validateTrigger != null) __obj.updateDynamic("validateTrigger")(validateTrigger.asInstanceOf[js.Any])
    if (valuePropName != null) __obj.updateDynamic("valuePropName")(valuePropName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcFieldForm.fieldMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FieldProps
}

