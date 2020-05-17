package typingsSlinky.postal.anon

import typingsSlinky.postal.ICallback
import typingsSlinky.postal.IEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  @JSName("callback")
  var callback_Original: ICallback[_] = js.native
  var channel: js.UndefOr[String] = js.native
  var topic: String = js.native
  def callback(data: js.Any, envelope: IEnvelope[_]): Unit = js.native
}

