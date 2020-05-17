package typingsSlinky.popmotion.observerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.popmotion.observerTypesMod.Update
  - typingsSlinky.popmotion.observerTypesMod.IObserver
  - typingsSlinky.popmotion.observerTypesMod.PartialObserver
*/
trait ObserverCandidate extends js.Object

object ObserverCandidate {
  @scala.inline
  implicit def apply(value: IObserver): ObserverCandidate = value.asInstanceOf[ObserverCandidate]
  @scala.inline
  implicit def apply(value: PartialObserver): ObserverCandidate = value.asInstanceOf[ObserverCandidate]
  @scala.inline
  implicit def apply(value: Update): ObserverCandidate = value.asInstanceOf[ObserverCandidate]
}

