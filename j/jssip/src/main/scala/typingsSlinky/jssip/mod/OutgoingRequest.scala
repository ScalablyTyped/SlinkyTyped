package typingsSlinky.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingRequest extends js.Object {
  var body: js.UndefOr[String] = js.native
  var call_id: String = js.native
  var cseq: Double = js.native
  var from: NameAddrHeader = js.native
  var method: String = js.native
  var ruri: URI = js.native
  var to: NameAddrHeader = js.native
  def getHeader(name: String): String = js.native
  def getHeaders(name: String): js.Array[String] = js.native
  def hasHeader(name: String): Boolean = js.native
  def setHeader(name: String, value: String): Unit = js.native
}

object OutgoingRequest {
  @scala.inline
  def apply(
    call_id: String,
    cseq: Double,
    from: NameAddrHeader,
    getHeader: String => String,
    getHeaders: String => js.Array[String],
    hasHeader: String => Boolean,
    method: String,
    ruri: URI,
    setHeader: (String, String) => Unit,
    to: NameAddrHeader
  ): OutgoingRequest = {
    val __obj = js.Dynamic.literal(call_id = call_id.asInstanceOf[js.Any], cseq = cseq.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction1(getHeaders), hasHeader = js.Any.fromFunction1(hasHeader), method = method.asInstanceOf[js.Any], ruri = ruri.asInstanceOf[js.Any], setHeader = js.Any.fromFunction2(setHeader), to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingRequest]
  }
  @scala.inline
  implicit class OutgoingRequestOps[Self <: OutgoingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCall_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCseq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cseq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: NameAddrHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHeader(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHeaders(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasHeader(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuri(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetHeader(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTo(value: NameAddrHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
  }
  
}

