package typingsSlinky.reactJsonschemaForm.mod

import slinky.core.ReactComponentClass
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.reactJsonschemaForm.AnonContent
import typingsSlinky.reactJsonschemaForm.AnonDescription
import typingsSlinky.reactJsonschemaForm.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectFieldTemplateProps[T] extends js.Object {
  var DescriptionField: ReactComponentClass[AnonDescription] = js.native
  var TitleField: ReactComponentClass[AnonId] = js.native
  var description: String = js.native
  var formContext: js.Any = js.native
  var formData: T = js.native
  var idSchema: IdSchema[_] = js.native
  var properties: js.Array[AnonContent] = js.native
  var required: Boolean = js.native
  var schema: JSONSchema6 = js.native
  var title: String = js.native
  var uiSchema: UiSchema = js.native
}

object ObjectFieldTemplateProps {
  @scala.inline
  def apply[T](
    DescriptionField: ReactComponentClass[AnonDescription],
    TitleField: ReactComponentClass[AnonId],
    description: String,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema[_],
    properties: js.Array[AnonContent],
    required: Boolean,
    schema: JSONSchema6,
    title: String,
    uiSchema: UiSchema
  ): ObjectFieldTemplateProps[T] = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField.asInstanceOf[js.Any], TitleField = TitleField.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldTemplateProps[T]]
  }
  @scala.inline
  implicit class ObjectFieldTemplatePropsOps[Self[t] <: ObjectFieldTemplateProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDescriptionField(value: ReactComponentClass[AnonDescription]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DescriptionField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleField(value: ReactComponentClass[AnonId]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TitleField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormContext(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdSchema(value: IdSchema[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[AnonContent]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: JSONSchema6): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiSchema(value: UiSchema): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiSchema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

