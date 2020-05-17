package typingsSlinky.angularCommon.httpHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCommon.httpHttpMod.HttpSentEvent
  - typingsSlinky.angularCommon.httpHttpMod.HttpHeaderResponse
  - typingsSlinky.angularCommon.httpHttpMod.HttpResponse[T]
  - typingsSlinky.angularCommon.httpHttpMod.HttpProgressEvent
  - typingsSlinky.angularCommon.httpHttpMod.HttpUserEvent[T]
*/
trait HttpEvent[T] extends js.Object

object HttpEvent {
  @scala.inline
  implicit def apply[T](value: HttpHeaderResponse): HttpEvent[T] = value.asInstanceOf[HttpEvent[T]]
  @scala.inline
  implicit def apply[T](value: HttpProgressEvent): HttpEvent[T] = value.asInstanceOf[HttpEvent[T]]
  @scala.inline
  implicit def apply[T](value: HttpResponse[T]): HttpEvent[T] = value.asInstanceOf[HttpEvent[T]]
  @scala.inline
  implicit def apply[T](value: HttpSentEvent): HttpEvent[T] = value.asInstanceOf[HttpEvent[T]]
  @scala.inline
  implicit def apply[T](value: HttpUserEvent[T]): HttpEvent[T] = value.asInstanceOf[HttpEvent[T]]
}

