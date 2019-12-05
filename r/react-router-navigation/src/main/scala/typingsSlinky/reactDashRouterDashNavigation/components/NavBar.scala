package typingsSlinky.reactDashRouterDashNavigation.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashRouterDashNavigation.reactDashRouterDashNavigationMod.CardSubViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashRouterDashNavigation), Name(reactDashRouterDashNavigationMod), Name(CardSubViewProps))) was not a @ScalaJSDefined trait */
object NavBar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashRouterDashNavigation.reactDashRouterDashNavigationMod.NavBar
    ] {
  @JSImport("react-router-navigation", "NavBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CardSubViewProps
}

