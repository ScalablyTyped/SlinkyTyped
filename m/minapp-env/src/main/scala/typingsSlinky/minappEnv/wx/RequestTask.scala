package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTask extends js.Object {
  /** [RequestTask.abort()](RequestTask.abort.md)
    *
    * 中断请求任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit = js.native
  /** [RequestTask.offHeadersReceived(function callback)](RequestTask.offHeadersReceived.md)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: RequestTaskOffHeadersReceivedCallback): Unit = js.native
  /** [RequestTask.onHeadersReceived(function callback)](RequestTask.onHeadersReceived.md)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: RequestTaskOnHeadersReceivedCallback): Unit = js.native
}

object RequestTask {
  @scala.inline
  def apply(
    abort: () => Unit,
    offHeadersReceived: RequestTaskOffHeadersReceivedCallback => Unit,
    onHeadersReceived: RequestTaskOnHeadersReceivedCallback => Unit
  ): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived))
    __obj.asInstanceOf[RequestTask]
  }
  @scala.inline
  implicit class RequestTaskOps[Self <: RequestTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOffHeadersReceived(value: RequestTaskOffHeadersReceivedCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offHeadersReceived")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnHeadersReceived(value: RequestTaskOnHeadersReceivedCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeadersReceived")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

