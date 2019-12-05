package typingsSlinky.atReachSkipDashNav.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachSkipDashNav.atReachSkipDashNavMod.SkipNavProps
import typingsSlinky.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object SkipNavLink
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atReachSkipDashNav.atReachSkipDashNavMod.SkipNavLink] {
  @JSImport("@reach/skip-nav", "SkipNavLink")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = SkipNavProps with HTMLProps[HTMLAnchorElement]
}

