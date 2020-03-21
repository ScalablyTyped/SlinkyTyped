package typingsSlinky.rsocketTypes.reactiveStreamTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubject[T] extends js.Object {
  def onComplete(): Unit
  def onError(error: js.Error): Unit
  def onNext(value: T): Unit
}

object ISubject {
  @scala.inline
  def apply[T](onComplete: () => Unit, onError: js.Error => Unit, onNext: T => Unit): ISubject[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
  
    __obj.asInstanceOf[ISubject[T]]
  }
}

