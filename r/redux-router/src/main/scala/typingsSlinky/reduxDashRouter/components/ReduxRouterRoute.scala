package typingsSlinky.reduxDashRouter.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reduxDashRouter.libReduxRouterMod.default.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(T))) was not a @ScalaJSDefined trait */
object ReduxRouterRoute
  extends ExternalComponentWithAttributesWithRefType[tag.type, Route[js.Any]] {
  @JSImport("redux-router/lib/ReduxRouter", "default.Route")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

