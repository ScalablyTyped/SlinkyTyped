package typingsSlinky.reactForm.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.ReactText
import typingsSlinky.reactForm.StyledPropschildrenpropsF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledRadioGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactForm.mod.StyledRadioGroup] {
  @JSImport("react-form", "StyledRadioGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    errorBefore: js.UndefOr[Boolean] = js.undefined,
    field: String | (js.Array[js.Array[ReactText] | ReactText | String]) = null,
    isForm: js.UndefOr[Boolean] = js.undefined,
    messageBefore: js.UndefOr[Boolean] = js.undefined,
    noMessage: js.UndefOr[Boolean] = js.undefined,
    showErrors: js.UndefOr[Boolean] = js.undefined,
    touchValidation: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactForm.mod.StyledRadioGroup] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errorBefore)) __obj.updateDynamic("errorBefore")(errorBefore.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(isForm)) __obj.updateDynamic("isForm")(isForm.asInstanceOf[js.Any])
    if (!js.isUndefined(messageBefore)) __obj.updateDynamic("messageBefore")(messageBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(noMessage)) __obj.updateDynamic("noMessage")(noMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(touchValidation)) __obj.updateDynamic("touchValidation")(touchValidation.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactForm.mod.StyledRadioGroup] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactForm.mod.StyledRadioGroup](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StyledPropschildrenpropsF
}

