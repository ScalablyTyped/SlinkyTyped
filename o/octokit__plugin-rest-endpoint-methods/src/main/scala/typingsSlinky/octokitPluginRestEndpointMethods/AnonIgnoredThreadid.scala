package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIgnoredThreadid extends js.Object {
  var ignored: AnonType = js.native
  var thread_id: AnonRequired = js.native
}

object AnonIgnoredThreadid {
  @scala.inline
  def apply(ignored: AnonType, thread_id: AnonRequired): AnonIgnoredThreadid = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoredThreadid]
  }
  @scala.inline
  implicit class AnonIgnoredThreadidOps[Self <: AnonIgnoredThreadid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnored(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

