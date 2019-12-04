package typingsSlinky.atReachRouter.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachRouter.atReachRouterMod.RedirectProps
import typingsSlinky.atReachRouter.atReachRouterMod.RouteComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(atReachRouter), Name(atReachRouterMod), Name(RouteComponentProps))) was not a @ScalaJSDefined trait */
object Redirect
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atReachRouter.atReachRouterMod.Redirect[js.Any]] {
  @JSImport("@reach/router", "Redirect")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = RouteComponentProps[RedirectProps[js.Any]]
}

