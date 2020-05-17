package typingsSlinky.jimp.mod

import typingsSlinky.jimp.anon.Dictkey
import typingsSlinky.jimp.anon.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jimp.anon.EventName[T]
  - typingsSlinky.jimp.anon.Dictkey[T]
*/
trait ListenerData[T /* <: ListenableName */] extends js.Object

object ListenerData {
  @scala.inline
  implicit def apply[T](value: Dictkey[T]): ListenerData[T] = value.asInstanceOf[ListenerData[T]]
  @scala.inline
  implicit def apply[T](value: EventName[T]): ListenerData[T] = value.asInstanceOf[ListenerData[T]]
}

