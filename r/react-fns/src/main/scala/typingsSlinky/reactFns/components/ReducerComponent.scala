package typingsSlinky.reactFns.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Could't extract props from TypeRef(QualifiedName(IArray(Name(P))),IArray(),NoComments) because couldn't resolve ClassTree. */
object ReducerComponent
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactFns.reducerComponentMod.ReducerComponent[js.Any, js.Any, js.Any]
    ] {
  @JSImport("react-fns/dist/ReducerComponent", "ReducerComponent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

