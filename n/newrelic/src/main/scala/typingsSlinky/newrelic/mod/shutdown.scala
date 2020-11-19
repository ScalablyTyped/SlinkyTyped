package typingsSlinky.newrelic.mod

import typingsSlinky.newrelic.anon.CollectPendingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("newrelic", "shutdown")
@js.native
object shutdown extends js.Object {
  
  def apply(): Unit = js.native
  def apply(cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def apply(options: js.UndefOr[scala.Nothing], cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def apply(options: CollectPendingData): Unit = js.native
  def apply(options: CollectPendingData, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
}
