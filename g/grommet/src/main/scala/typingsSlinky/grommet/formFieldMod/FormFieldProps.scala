package typingsSlinky.grommet.formFieldMod

import slinky.core.TagMod
import typingsSlinky.grommet.anon.Message
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.PlaceHolderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFieldProps extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String | TagMod[Any]] = js.undefined
  var help: js.UndefOr[String | TagMod[Any]] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String | TagMod[Any]] = js.undefined
  var label: js.UndefOr[String | TagMod[Any]] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var pad: js.UndefOr[Boolean] = js.undefined
  // Although Placeholder is not a prop within FormField we Omit the HTML placeholder attribute and replaced with following.
  var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[
    Message | (js.Function1[/* repeated */ js.Any, _]) | (js.Array[Message | (js.Function1[/* repeated */ _, _])])
  ] = js.undefined
}

object FormFieldProps {
  @scala.inline
  def apply(
    component: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: String | TagMod[Any] = null,
    help: String | TagMod[Any] = null,
    htmlFor: String = null,
    info: String | TagMod[Any] = null,
    label: String | TagMod[Any] = null,
    margin: MarginType = null,
    name: String = null,
    options: js.Array[String] = null,
    pad: js.UndefOr[Boolean] = js.undefined,
    placeholder: PlaceHolderType = null,
    required: js.UndefOr[Boolean] = js.undefined,
    validate: Message | (js.Function1[/* repeated */ js.Any, _]) | (js.Array[Message | (js.Function1[/* repeated */ _, _])]) = null
  ): FormFieldProps = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(pad)) __obj.updateDynamic("pad")(pad.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFieldProps]
  }
}

