package typingsSlinky.reactDashJsonschemaDashForm.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashJsonschemaDashForm.libComponentsFieldsSchemaFieldMod.SchemaFieldProps
import typingsSlinky.reactDashJsonschemaDashForm.libComponentsFieldsSchemaFieldMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashJsonschemaDashForm), Name(libComponentsFieldsSchemaFieldMod), Name(SchemaFieldProps))) was not a @ScalaJSDefined trait */
object SchemaField
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-jsonschema-form/lib/components/fields/SchemaField", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = SchemaFieldProps[js.Any]
}

