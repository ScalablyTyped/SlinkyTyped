package typingsSlinky.reactAriaModal.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactAriaModal.PickAriaModalPropstitleId
import typingsSlinky.reactAriaModal.PickAriaModalPropstitleTe
import typingsSlinky.reactAriaModal.mod.AriaModalProps
import typingsSlinky.reactAriaModal.mod.RequiredAriaTypes
import typingsSlinky.reactAriaModal.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactAriaModal), Name(mod), Name(AriaModalProps))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactAriaModal), Name(mod), Name(RequiredAriaTypes))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactAriaModal), Name(PickAriaModalPropstitleId))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactAriaModal), Name(PickAriaModalPropstitleTe))),IArray(),NoComments)),NoComments)),NoComments) because: Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactAriaModal), Name(reactAriaModalStrings), Name(RequiredAriaTypes))),IArray(),Comments(0)), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactAriaModal), Name(PickAriaModalPropstitleId))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),NoComments) because couldn't resolve ClassTree., Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactAriaModal), Name(reactAriaModalStrings), Name(RequiredAriaTypes))),IArray(),Comments(0)), TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactAriaModal), Name(PickAriaModalPropstitleTe))),IArray(),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),NoComments) because couldn't resolve ClassTree. */
object ReactAriaModal
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-aria-modal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = AriaModalProps with (RequiredAriaTypes[PickAriaModalPropstitleId, PickAriaModalPropstitleTe])
}

