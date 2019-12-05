package typingsSlinky.reactDashRouterDashBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIndexLinkContainerMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.history.historyMod.LocationState
  import typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLinkProps

  //IndexLink is removed in react-router, but continues there in react-router-bootstrap for backwards compatibility.
  //Better use <LinkContainer exact/>
  type IndexLinkContainer = ReactComponentClass[NavLinkProps[LocationState]]
}
