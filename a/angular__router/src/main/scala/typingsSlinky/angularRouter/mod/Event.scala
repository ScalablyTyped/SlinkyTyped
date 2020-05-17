package typingsSlinky.angularRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularRouter.mod.RouterEvent
  - typingsSlinky.angularRouter.mod.RouteConfigLoadStart
  - typingsSlinky.angularRouter.mod.RouteConfigLoadEnd
  - typingsSlinky.angularRouter.mod.ChildActivationStart
  - typingsSlinky.angularRouter.mod.ChildActivationEnd
  - typingsSlinky.angularRouter.mod.ActivationStart
  - typingsSlinky.angularRouter.mod.ActivationEnd
  - typingsSlinky.angularRouter.mod.Scroll
*/
trait Event extends js.Object

object Event {
  @scala.inline
  implicit def apply(value: ActivationEnd): Event = value.asInstanceOf[Event]
  @scala.inline
  implicit def apply(value: ActivationStart): Event = value.asInstanceOf[Event]
  @scala.inline
  implicit def apply(value: ChildActivationEnd): Event = value.asInstanceOf[Event]
  @scala.inline
  implicit def apply(value: ChildActivationStart): Event = value.asInstanceOf[Event]
  @scala.inline
  implicit def apply(value: RouteConfigLoadEnd): Event = value.asInstanceOf[Event]
  @scala.inline
  implicit def apply(value: RouteConfigLoadStart): Event = value.asInstanceOf[Event]
  @scala.inline
  implicit def apply(value: RouterEvent): Event = value.asInstanceOf[Event]
  @scala.inline
  implicit def apply(value: Scroll): Event = value.asInstanceOf[Event]
}

