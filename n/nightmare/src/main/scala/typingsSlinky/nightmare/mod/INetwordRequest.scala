package typingsSlinky.nightmare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INetwordRequest extends js.Object {
  def abort(): Unit = js.native
  def changeUrl(url: String): Unit = js.native
  def setHeader(key: String, value: String): Unit = js.native
}

object INetwordRequest {
  @scala.inline
  def apply(abort: () => Unit, changeUrl: String => Unit, setHeader: (String, String) => Unit): INetwordRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), changeUrl = js.Any.fromFunction1(changeUrl), setHeader = js.Any.fromFunction2(setHeader))
    __obj.asInstanceOf[INetwordRequest]
  }
  @scala.inline
  implicit class INetwordRequestOps[Self <: INetwordRequest] (val x: Self) extends AnyVal {
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
    def withChangeUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeader(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeader")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

