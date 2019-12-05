package typingsSlinky.queue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queueMod {
  type QueueWorkerCallback = js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[js.Object], Unit]
}
