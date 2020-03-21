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

trait ArrayFieldTemplateProps[T] extends js.Object {
  var DescriptionField: ReactComponentClass[AnonDescription]
  var TitleField: ReactComponentClass[AnonId]
  var canAdd: Boolean
  var className: String
  var disabled: Boolean
  var formContext: js.Any
  var formData: T
  var idSchema: IdSchema[_]
  var items: js.Array[AnonChildren]
  var readonly: Boolean
  var registry: AnonDefinitions
  var required: Boolean
  var schema: JSONSchema6
  var title: String
  var uiSchema: UiSchema
  def onAddClick(event: js.Any): js.Function1[/* event */ js.Any, Unit]
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
}

