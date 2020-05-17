package typingsSlinky.indefiniteObservable.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends ObserverOrNext[T] {
  @JSName("next")
  var next_Original: NextChannel[T] = js.native
  def next(value: T): Unit = js.native
}

