package typingsSlinky.awsSdk.eventStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.eventStreamMod.StreamingEventStream[Events]
  - js.Array[Events]
*/
trait EventStream[Events] extends js.Object

object EventStream {
  @scala.inline
  implicit def apply[Events](value: js.Array[Events]): EventStream[Events] = value.asInstanceOf[EventStream[Events]]
  @scala.inline
  implicit def apply[Events](value: StreamingEventStream[Events]): EventStream[Events] = value.asInstanceOf[EventStream[Events]]
}

