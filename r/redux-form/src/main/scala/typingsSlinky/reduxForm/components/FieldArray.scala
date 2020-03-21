package typingsSlinky.reduxForm.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reduxForm.fieldArrayMod.BaseFieldArrayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reduxForm), Name(fieldArrayMod), Name(BaseFieldArrayProps))),IArray(TypeRef(QualifiedName(IArray(Name(P))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(FieldValue))),IArray(),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(P))),IArray(),NoComments) because couldn't resolve ClassTree. */
object FieldArray
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reduxForm.mod.FieldArray[js.Any, js.Any]] {
  @JSImport("redux-form", "FieldArray")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = BaseFieldArrayProps[js.Any, js.Any]
}

