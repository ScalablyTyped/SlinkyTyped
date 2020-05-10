package typingsSlinky.newrelic.mod

import typingsSlinky.newrelic.AnonCollectPendingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newrelic", "shutdown")
@js.native
object shutdown extends js.Object {
  def apply(): Unit = js.native
  def apply(cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def apply(options: AnonCollectPendingData): Unit = js.native
  def apply(options: AnonCollectPendingData, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
}

