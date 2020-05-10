package typingsSlinky.msgpack.mod

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsgPackDownloadOption extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* xhr */ XMLHttpRequest, 
      /* option */ MsgPackDownloadOption, 
      /* result */ MsgPackCallbackResult, 
      Unit
    ]
  ] = js.native
  var before: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* option */ MsgPackDownloadOption, Unit]] = js.native
  /**
    * timeout sec.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * use WebWorker if true.
    */
  var worker: js.UndefOr[Boolean] = js.native
}

object MsgPackDownloadOption {
  @scala.inline
  def apply(): MsgPackDownloadOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsgPackDownloadOption]
  }
  @scala.inline
  implicit class MsgPackDownloadOptionOps[Self <: MsgPackDownloadOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(
      value: (/* xhr */ XMLHttpRequest, /* option */ MsgPackDownloadOption, /* result */ MsgPackCallbackResult) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: (/* xhr */ XMLHttpRequest, /* option */ MsgPackDownloadOption) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(js.undefined)
        ret
    }
  }
  
}

