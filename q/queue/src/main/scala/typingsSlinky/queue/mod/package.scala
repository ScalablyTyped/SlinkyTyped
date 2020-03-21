package typingsSlinky.queue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type QueueWorkerCallback = js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[js.Object], scala.Unit]
}
