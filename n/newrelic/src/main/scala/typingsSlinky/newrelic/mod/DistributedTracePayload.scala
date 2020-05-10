package typingsSlinky.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributedTracePayload extends js.Object {
  /**
    * The base64 encoded JSON representation of the distributed trace payload.
    */
  def httpSafe(): String = js.native
  /**
    * The base64 encoded JSON representation of the distributed trace payload.
    */
  def text(): String = js.native
}

object DistributedTracePayload {
  @scala.inline
  def apply(httpSafe: () => String, text: () => String): DistributedTracePayload = {
    val __obj = js.Dynamic.literal(httpSafe = js.Any.fromFunction0(httpSafe), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[DistributedTracePayload]
  }
  @scala.inline
  implicit class DistributedTracePayloadOps[Self <: DistributedTracePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpSafe(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpSafe")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

