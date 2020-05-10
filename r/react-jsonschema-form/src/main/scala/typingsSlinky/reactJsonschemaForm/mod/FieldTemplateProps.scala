package typingsSlinky.reactJsonschemaForm.mod

import slinky.core.facade.ReactElement
import typingsSlinky.jsonSchema.mod.JSONSchema6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldTemplateProps extends js.Object {
  var children: ReactElement = js.native
  var classNames: String = js.native
  var description: ReactElement = js.native
  var disabled: Boolean = js.native
  var displayLabel: Boolean = js.native
  var errors: ReactElement = js.native
  var fields: js.Array[Field] = js.native
  var formContext: js.Any = js.native
  var help: ReactElement = js.native
  var hidden: Boolean = js.native
  var id: String = js.native
  var label: String = js.native
  var rawDescription: String = js.native
  var rawErrors: js.Array[String] = js.native
  var rawHelp: String = js.native
  var readonly: Boolean = js.native
  var required: Boolean = js.native
  var schema: JSONSchema6 = js.native
  var uiSchema: UiSchema = js.native
}

object FieldTemplateProps {
  @scala.inline
  def apply(
    children: ReactElement,
    classNames: String,
    description: ReactElement,
    disabled: Boolean,
    displayLabel: Boolean,
    errors: ReactElement,
    fields: js.Array[Field],
    formContext: js.Any,
    help: ReactElement,
    hidden: Boolean,
    id: String,
    label: String,
    rawDescription: String,
    rawErrors: js.Array[String],
    rawHelp: String,
    readonly: Boolean,
    required: Boolean,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): FieldTemplateProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayLabel = displayLabel.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rawDescription = rawDescription.asInstanceOf[js.Any], rawErrors = rawErrors.asInstanceOf[js.Any], rawHelp = rawHelp.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTemplateProps]
  }
  @scala.inline
  implicit class FieldTemplatePropsOps[Self <: FieldTemplateProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelp(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawHelp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawHelp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: JSONSchema6): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiSchema(value: UiSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiSchema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

