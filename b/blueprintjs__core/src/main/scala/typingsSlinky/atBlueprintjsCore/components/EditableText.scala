package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typingsSlinky.atBlueprintjsCore.libEsmComponentsEditableDashTextEditableTextMod.IEditableTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditableText
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.EditableText] {
  @JSImport("@blueprintjs/core/lib/esm/components", "EditableText")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onChange, placeholder, type */
  def apply(
    alwaysRenderInput: js.UndefOr[Boolean] = js.undefined,
    confirmOnEnterKey: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    intent: Intent = null,
    isEditing: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    maxLines: Int | Double = null,
    minLines: Int | Double = null,
    minWidth: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onCancel: /* value */ String => Unit = null,
    onConfirm: /* value */ String => Unit = null,
    onEdit: /* value */ String => Unit = null,
    selectAllOnFocus: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.EditableText] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysRenderInput)) __obj.updateDynamic("alwaysRenderInput")(alwaysRenderInput.asInstanceOf[js.Any])
    if (!js.isUndefined(confirmOnEnterKey)) __obj.updateDynamic("confirmOnEnterKey")(confirmOnEnterKey.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1(onConfirm))
    if (onEdit != null) __obj.updateDynamic("onEdit")(js.Any.fromFunction1(onEdit))
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.EditableText] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.EditableText](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IEditableTextProps
}

