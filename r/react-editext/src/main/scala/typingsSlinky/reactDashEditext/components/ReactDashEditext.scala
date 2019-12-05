package typingsSlinky.reactDashEditext.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashEditext.reactDashEditextMod.EdiTextProps
import typingsSlinky.reactDashEditext.reactDashEditextMod.EdiTextType
import typingsSlinky.reactDashEditext.reactDashEditextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashEditext
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-editext", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onSave: /* repeated */ String => js.Any,
    value: String,
    `type`: EdiTextType,
    cancelButtonClassName: String = null,
    cancelButtonContent: js.Any = null,
    editButtonClassName: String = null,
    editButtonContent: js.Any = null,
    hideIcons: js.UndefOr[Boolean] = js.undefined,
    hint: TagMod[Any] = null,
    inputProps: js.Object = null,
    onCancel: /* repeated */ js.Any => _ = null,
    onValidationFail: /* repeated */ String => _ = null,
    saveButtonClassName: String = null,
    saveButtonContent: js.Any = null,
    validation: /* repeated */ String => Boolean = null,
    validationMessage: String = null,
    viewProps: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onSave = js.Any.fromFunction1(onSave), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cancelButtonClassName != null) __obj.updateDynamic("cancelButtonClassName")(cancelButtonClassName.asInstanceOf[js.Any])
    if (cancelButtonContent != null) __obj.updateDynamic("cancelButtonContent")(cancelButtonContent.asInstanceOf[js.Any])
    if (editButtonClassName != null) __obj.updateDynamic("editButtonClassName")(editButtonClassName.asInstanceOf[js.Any])
    if (editButtonContent != null) __obj.updateDynamic("editButtonContent")(editButtonContent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIcons)) __obj.updateDynamic("hideIcons")(hideIcons.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onValidationFail != null) __obj.updateDynamic("onValidationFail")(js.Any.fromFunction1(onValidationFail))
    if (saveButtonClassName != null) __obj.updateDynamic("saveButtonClassName")(saveButtonClassName.asInstanceOf[js.Any])
    if (saveButtonContent != null) __obj.updateDynamic("saveButtonContent")(saveButtonContent.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(js.Any.fromFunction1(validation))
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage.asInstanceOf[js.Any])
    if (viewProps != null) __obj.updateDynamic("viewProps")(viewProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EdiTextProps
}

