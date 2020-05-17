package typingsSlinky.rxLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Rx {
  type Scheduler = typingsSlinky.rxLite.Rx.IScheduler
  // SerialDisposable it's an alias of SingleAssignmentDisposable
  type SerialDisposable = typingsSlinky.rxLite.Rx.SingleAssignmentDisposable
}
