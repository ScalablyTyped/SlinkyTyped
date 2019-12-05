package typingsSlinky.reactDashDraggable.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDraggable.reactDashDraggableMod.DraggableProps
import typingsSlinky.reactDashDraggable.reactDashDraggableMod.default
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(std), Name(Partial))) was not a @ScalaJSDefined trait */
object ReactDashDraggable
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-draggable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = Partial[DraggableProps]
}

