package typingsSlinky.reactJsonschemaForm.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.reactJsonschemaForm.AnonDefinitions
import typingsSlinky.reactJsonschemaForm.mod.ErrorSchema
import typingsSlinky.reactJsonschemaForm.mod.IdSchema
import typingsSlinky.reactJsonschemaForm.mod.UiSchema
import typingsSlinky.reactJsonschemaForm.schemaFieldMod.SchemaFieldProps
import typingsSlinky.reactJsonschemaForm.schemaFieldMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SchemaField
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-jsonschema-form/lib/components/fields/SchemaField", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    errorSchema: ErrorSchema,
    formContext: js.Any,
    formData: js.Any,
    idSchema: IdSchema[_],
    registry: AnonDefinitions,
    schema: JSONSchema6,
    uiSchema: UiSchema,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SchemaFieldProps[js.Any]
}

