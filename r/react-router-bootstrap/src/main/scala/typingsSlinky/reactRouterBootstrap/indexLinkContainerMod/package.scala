package typingsSlinky.reactRouterBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object indexLinkContainerMod {
  //IndexLink is removed in react-router, but continues there in react-router-bootstrap for backwards compatibility.
  //Better use <LinkContainer exact/>
  type IndexLinkContainer = slinky.core.ReactComponentClass[
    typingsSlinky.reactRouterDom.mod.NavLinkProps[typingsSlinky.history.mod.LocationState]
  ]
}
