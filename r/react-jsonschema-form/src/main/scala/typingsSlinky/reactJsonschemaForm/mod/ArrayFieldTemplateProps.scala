package typingsSlinky.reactJsonschemaForm.mod

import slinky.core.ReactComponentClass
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.reactJsonschemaForm.AnonChildren
import typingsSlinky.reactJsonschemaForm.AnonDefinitions
import typingsSlinky.reactJsonschemaForm.AnonDescription
import typingsSlinky.reactJsonschemaForm.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayFieldTemplateProps[T] extends js.Object {
  var DescriptionField: ReactComponentClass[AnonDescription] = js.native
  var TitleField: ReactComponentClass[AnonId] = js.native
  var canAdd: Boolean = js.native
  var className: String = js.native
  var disabled: Boolean = js.native
  var formContext: js.Any = js.native
  var formData: T = js.native
  var idSchema: IdSchema[_] = js.native
  var items: js.Array[AnonChildren] = js.native
  var readonly: Boolean = js.native
  var registry: AnonDefinitions = js.native
  var required: Boolean = js.native
  var schema: JSONSchema6 = js.native
  var title: String = js.native
  var uiSchema: UiSchema = js.native
  def onAddClick(event: js.Any): js.Function1[/* event */ js.Any, Unit] = js.native
}

object ArrayFieldTemplateProps {
  @scala.inline
  def apply[T](
    DescriptionField: ReactComponentClass[AnonDescription],
    TitleField: ReactComponentClass[AnonId],
    canAdd: Boolean,
    className: String,
    disabled: Boolean,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema[_],
    items: js.Array[AnonChildren],
    onAddClick: js.Any => js.Function1[/* event */ js.Any, Unit],
    readonly: Boolean,
    registry: AnonDefinitions,
    required: Boolean,
    schema: JSONSchema6,
    title: String,
    uiSchema: UiSchema
  ): ArrayFieldTemplateProps[T] = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField.asInstanceOf[js.Any], TitleField = TitleField.asInstanceOf[js.Any], canAdd = canAdd.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onAddClick = js.Any.fromFunction1(onAddClick), readonly = readonly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldTemplateProps[T]]
  }
  @scala.inline
  implicit class ArrayFieldTemplatePropsOps[Self[t] <: ArrayFieldTemplateProps[t], T] (val x: Self[T]) extends AnyVal {
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
    def withCanAdd(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
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
    def withItems(value: js.Array[AnonChildren]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAddClick(value: js.Any => js.Function1[/* event */ js.Any, Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistry(value: AnonDefinitions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
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

