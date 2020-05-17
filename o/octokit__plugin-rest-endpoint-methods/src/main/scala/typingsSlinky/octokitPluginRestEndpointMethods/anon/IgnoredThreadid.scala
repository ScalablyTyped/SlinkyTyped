package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoredThreadid extends js.Object {
  var ignored: Type = js.native
  var thread_id: Required = js.native
}

object IgnoredThreadid {
  @scala.inline
  def apply(ignored: Type, thread_id: Required): IgnoredThreadid = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoredThreadid]
  }
  @scala.inline
  implicit class IgnoredThreadidOps[Self <: IgnoredThreadid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnored(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

