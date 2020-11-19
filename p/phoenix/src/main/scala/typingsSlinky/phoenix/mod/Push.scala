package typingsSlinky.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phoenix", "Push")
@js.native
class Push protected () extends js.Object {
  def this(channel: Channel, event: String, payload: js.Object, timeout: Double) = this()
  
  def receive(status: String, callback: js.Function1[/* response */ js.UndefOr[js.Any], _]): this.type = js.native
  
  def resend(timeout: Double): Unit = js.native
  
  def send(): Unit = js.native
}
