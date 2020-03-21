package typingsSlinky.reduxForm.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reduxForm.fieldsMod.BaseFieldsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reduxForm), Name(fieldsMod), Name(BaseFieldsProps))),IArray(TypeRef(QualifiedName(IArray(Name(P))),IArray(),NoComments)),NoComments), TypeRef(QualifiedName(IArray(Name(P))),IArray(),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(P))),IArray(),NoComments) because couldn't resolve ClassTree. */
object Fields
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reduxForm.mod.Fields[js.Any]] {
  @JSImport("redux-form", "Fields")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = BaseFieldsProps[js.Any] with js.Any
}

