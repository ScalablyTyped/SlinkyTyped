package typingsSlinky.rxjs.innerSubscribeMod

import typingsSlinky.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/innerSubscribe", "SimpleOuterSubscriber")
@js.native
class SimpleOuterSubscriber[T, R] ()
  extends Subscriber[T]
     with SimpleOuterSubscriberLike[R]

