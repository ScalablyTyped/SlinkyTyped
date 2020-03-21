package typingsSlinky.reactVirtualizedSelect.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactVirtualizedSelect.mod.VirtualizedSelectProps
import typingsSlinky.reactVirtualizedSelect.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactVirtualizedSelect), Name(mod), Name(AdditionalVirtualizedSelectProps))),IArray(TypeRef(QualifiedName(IArray(Name(TValue))),IArray(),NoComments)),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactVirtualizedSelect), Name(AnonAsync))),IArray(),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree., Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactVirtualizedSelect), Name(mod), Name(AdditionalVirtualizedSelectProps))),IArray(TypeRef(QualifiedName(IArray(Name(TValue))),IArray(),NoComments)),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree. */
object ReactVirtualizedSelect
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-virtualized-select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = VirtualizedSelectProps[js.Any]
}

