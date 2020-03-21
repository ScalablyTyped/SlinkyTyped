package typingsSlinky.reactTimeago.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactTimeago.mod.ReactTimeagoProps
import typingsSlinky.reactTimeago.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactTimeago), Name(mod), Name(ReactTimeagoProps))),IArray(TypeRef(QualifiedName(IArray(Name(T))),IArray(),NoComments)),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(react), Name(mod), Name(ComponentProps))),IArray(TypeRef(QualifiedName(IArray(Name(T))),IArray(),NoComments)),NoComments)),NoComments) because: Not a trait, Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree. */
object ReactTimeago
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^[js.Any]] {
  @JSImport("react-timeago", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ReactTimeagoProps[js.Any] with ComponentProps[js.Any]
}

