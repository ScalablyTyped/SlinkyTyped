package typingsSlinky.rxjs.internalDashCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "InnerSubscriber")
@js.native
class InnerSubscriber[T, R] protected ()
  extends typingsSlinky.rxjs.internalInnerSubscriberMod.InnerSubscriber[T, R] {
  def this(
    parent: typingsSlinky.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    outerValue: T,
    outerIndex: Double
  ) = this()
}

