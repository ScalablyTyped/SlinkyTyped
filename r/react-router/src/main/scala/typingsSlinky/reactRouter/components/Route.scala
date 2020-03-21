package typingsSlinky.reactRouter.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Could't extract props from TypeRef(QualifiedName(IArray(Name(T))),IArray(),NoComments) because couldn't resolve ClassTree. */
object Route
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactRouter.mod.Route[js.Any]] {
  @JSImport("react-router", "Route")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

