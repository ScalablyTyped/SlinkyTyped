package typingsSlinky.reactabularDashSticky.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactabularDashSticky.reactabularDashStickyMod.StickyHeaderProps
import typingsSlinky.reactabularDashTable.reactabularDashTableMod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Header
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactabularDashSticky.reactabularDashStickyMod.Header] {
  @JSImport("reactabular-sticky", "Header")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StickyHeaderProps with HeaderProps
}

