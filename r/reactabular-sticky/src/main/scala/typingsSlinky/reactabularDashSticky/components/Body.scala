package typingsSlinky.reactabularDashSticky.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactabularDashSticky.reactabularDashStickyMod.StickyBodyProps
import typingsSlinky.reactabularDashTable.reactabularDashTableMod.BodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Body
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactabularDashSticky.reactabularDashStickyMod.Body] {
  @JSImport("reactabular-sticky", "Body")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StickyBodyProps with BodyProps
}

