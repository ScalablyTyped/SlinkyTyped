package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Threadid extends js.Object {
  var thread_id: Required = js.native
}

object Threadid {
  @scala.inline
  def apply(thread_id: Required): Threadid = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threadid]
  }
  @scala.inline
  implicit class ThreadidOps[Self <: Threadid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThread_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

