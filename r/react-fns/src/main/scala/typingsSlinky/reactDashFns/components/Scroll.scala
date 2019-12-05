package typingsSlinky.reactDashFns.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashFns.distScrollScrollMod.ScrollConfig
import typingsSlinky.reactDashFns.distScrollScrollMod.ScrollProps
import typingsSlinky.reactDashFns.distTypesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Scroll
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashFns.distScrollMod.Scroll] {
  @JSImport("react-fns/dist/Scroll", "Scroll")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ScrollConfig with SharedRenderProps[ScrollProps]
}

