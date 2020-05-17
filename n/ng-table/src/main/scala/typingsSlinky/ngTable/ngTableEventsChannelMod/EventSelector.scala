package typingsSlinky.ngTable.ngTableEventsChannelMod

import typingsSlinky.ngTable.ngTableParamsMod.NgTableParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ngTable.ngTableParamsMod.NgTableParams[T]
  - typingsSlinky.ngTable.ngTableEventsChannelMod.IEventSelectorFunc
*/
trait EventSelector[T] extends js.Object

object EventSelector {
  @scala.inline
  implicit def apply[T](value: IEventSelectorFunc): EventSelector[T] = value.asInstanceOf[EventSelector[T]]
  @scala.inline
  implicit def apply[T](value: NgTableParams[T]): EventSelector[T] = value.asInstanceOf[EventSelector[T]]
}

