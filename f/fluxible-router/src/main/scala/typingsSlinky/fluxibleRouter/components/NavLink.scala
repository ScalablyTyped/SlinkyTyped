package typingsSlinky.fluxibleRouter.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fluxibleRouter.mod.NavLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Not a trait */
object NavLink
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.fluxibleRouter.mod.NavLink] {
  @JSImport("fluxible-router", "NavLink")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = NavLinkProps
}

