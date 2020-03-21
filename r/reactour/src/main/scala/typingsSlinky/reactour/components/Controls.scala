package typingsSlinky.reactour.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactour.mod.ControlsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Not a trait, Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree., Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(<union>))),IArray(TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Object))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)), TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(std), Name(stdStrings), Name(Pick))),IArray(),Comments(0)), TypeRef(QualifiedName(IArray(Name(<union>))),IArray(TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Object))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1))),NoComments)),NoComments)),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(react), Name(AnonRefExclude))),IArray(),NoComments)),NoComments) because: Not a trait, Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree., Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(std), Name(stdStrings), Name(Pick))),IArray(),Comments(0)), TypeRef(QualifiedName(IArray(Name(<union>))),IArray(TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Object))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1))),NoComments)),NoComments) because: Not a trait, Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree., Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(<union>))),IArray(TypeRef(QualifiedName(IArray(Name(<wildcard>))),IArray(),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(std), Name(stdStrings), Name(Pick))),IArray(),Comments(0))),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(react), Name(mod), Name(RefAttributes))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(std), Name(InstanceType))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactour), Name(reactourStrings), Name(div))),IArray(),Comments(0))),NoComments)),NoComments)),NoComments) because: Could't extract props from TypeRef(QualifiedName(IArray(Name(<wildcard>))),IArray(),NoComments) because couldn't resolve ClassTree. */
object Controls
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("reactour", "Controls")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ControlsProps
}

