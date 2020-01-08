package typingsSlinky.formol.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.formol.formolMod.FieldSetProps
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FieldSet
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.formol.formolMod.FieldSet] {
  @JSImport("formol", "FieldSet")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: type */
  def apply(
    choices: js.Array[_] = null,
    dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined,
    elementRef: Ref[_] = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    onChange: () => Unit = null,
    value: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.formol.formolMod.FieldSet] = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousRawHTMLLabels)) __obj.updateDynamic("dangerousRawHTMLLabels")(dangerousRawHTMLLabels.asInstanceOf[js.Any])
    if (elementRef != null) __obj.updateDynamic("elementRef")(elementRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.formol.formolMod.FieldSet] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.formol.formolMod.FieldSet](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FieldSetProps[js.Any]
}

