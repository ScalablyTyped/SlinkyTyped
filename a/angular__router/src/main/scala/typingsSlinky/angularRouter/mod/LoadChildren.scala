package typingsSlinky.angularRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularRouter.mod.LoadChildrenCallback
  - typingsSlinky.angularRouter.mod.DeprecatedLoadChildren
*/
trait LoadChildren extends js.Object

object LoadChildren {
  @scala.inline
  implicit def apply(value: DeprecatedLoadChildren): LoadChildren = value.asInstanceOf[LoadChildren]
  @scala.inline
  implicit def apply(value: LoadChildrenCallback): LoadChildren = value.asInstanceOf[LoadChildren]
}

