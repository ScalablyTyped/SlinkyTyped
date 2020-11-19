package typingsSlinky.reactJsonschemaForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.reactJsonschemaForm.anon.Definitions
import typingsSlinky.reactJsonschemaForm.mod.ErrorSchema
import typingsSlinky.reactJsonschemaForm.mod.IdSchema
import typingsSlinky.reactJsonschemaForm.mod.UiSchema
import typingsSlinky.reactJsonschemaForm.schemaFieldMod.SchemaFieldProps
import typingsSlinky.reactJsonschemaForm.schemaFieldMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SchemaField {
  
  @JSImport("react-jsonschema-form/lib/components/fields/SchemaField", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SchemaFieldProps[js.Any]): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    errorSchema: ErrorSchema,
    formContext: js.Any,
    formData: js.Any,
    idSchema: IdSchema[_],
    registry: Definitions,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[SchemaFieldProps[js.Any]]))
  }
}
