package typingsSlinky.formol.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.formol.formolStrings.FormolProps
import typingsSlinky.formol.mod.default
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Formol
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("formol", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, readOnly */
  def apply(
    allowUnmodifiedSubmit: js.Any = null,
    cancelText: js.Any = null,
    classes: js.Any = null,
    extra: TagMod[Any] = null,
    i18n: js.Any = null,
    item: js.Any = null,
    noCancel: js.Any = null,
    onSubmit: /* e */ Event_ => Unit = null,
    submitText: js.Any = null,
    types: js.Array[String] = null,
    validator: js.Any => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? string | null}
    */ FormolProps with js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (allowUnmodifiedSubmit != null) __obj.updateDynamic("allowUnmodifiedSubmit")(allowUnmodifiedSubmit.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (noCancel != null) __obj.updateDynamic("noCancel")(noCancel.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (submitText != null) __obj.updateDynamic("submitText")(submitText.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1(validator))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.formol.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.formol.mod.FormolProps[js.Any]
}

