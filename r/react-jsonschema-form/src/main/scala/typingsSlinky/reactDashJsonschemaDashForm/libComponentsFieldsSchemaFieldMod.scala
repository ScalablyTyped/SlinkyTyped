package typingsSlinky.reactDashJsonschemaDashForm

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.FieldProps
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.errorSchema
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.formData
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.idSchema
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.registry
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.schema
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.uiSchema
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/components/fields/SchemaField", JSImport.Namespace)
@js.native
object libComponentsFieldsSchemaFieldMod extends js.Object {
  @js.native
  class default ()
    extends Component[SchemaFieldProps[js.Any], js.Object, js.Any]
  
  type SchemaField = ReactComponentClass[SchemaFieldProps[js.Any]]
  type SchemaFieldProps[T] = Pick[FieldProps[T], schema | uiSchema | idSchema | formData | errorSchema | registry]
}

