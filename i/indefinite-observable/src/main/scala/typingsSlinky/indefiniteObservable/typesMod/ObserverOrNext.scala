package typingsSlinky.indefiniteObservable.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.indefiniteObservable.typesMod.Observer[T]
  - typingsSlinky.indefiniteObservable.typesMod.NextChannel[T]
*/
trait ObserverOrNext[T] extends js.Object

object ObserverOrNext {
  @scala.inline
  implicit def apply[T](value: NextChannel[T]): ObserverOrNext[T] = value.asInstanceOf[ObserverOrNext[T]]
  @scala.inline
  implicit def apply[T](value: Observer[T]): ObserverOrNext[T] = value.asInstanceOf[ObserverOrNext[T]]
}

