package typingsSlinky.nodeZendesk.mod.JobStatuses

import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def show(jobStatusId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double, cb: ZendeskCallback[_, _]): js.Any = js.native
}

object Methods {
  @scala.inline
  def apply(
    show: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    watch: (ZendeskID, Double, Double, ZendeskCallback[_, _]) => js.Any
  ): Methods = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction2(show), watch = js.Any.fromFunction4(watch))
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShow(value: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWatch(value: (ZendeskID, Double, Double, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

