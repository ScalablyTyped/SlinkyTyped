package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ActionInit = js.Function1[
    /* observer */ typingsSlinky.popmotion.observerTypesMod.IObserver, 
    typingsSlinky.popmotion.anon.PartialColdSubscription | scala.Unit
  ]
}
