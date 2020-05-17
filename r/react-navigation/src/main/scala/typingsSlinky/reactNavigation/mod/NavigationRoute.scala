package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.mod.NavigationLeafRoute[Params]
  - typingsSlinky.reactNavigation.mod.NavigationStateRoute[Params]
*/
trait NavigationRoute[Params] extends js.Object

object NavigationRoute {
  @scala.inline
  implicit def apply[Params](value: NavigationLeafRoute[Params] | NavigationStateRoute[Params]): NavigationRoute[Params] = value.asInstanceOf[NavigationRoute[Params]]
}

