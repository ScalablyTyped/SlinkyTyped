package typingsSlinky.nodeRal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogInfo extends js.Object {
  var conv: String = js.native
  var cost: String = js.native
  var method: String = js.native
  var pack: String = js.native
  var path: String = js.native
  var prot: String = js.native
  var proxy: String = js.native
  var query: String = js.native
  var read: String = js.native
  var remote: String = js.native
  var requestID: String = js.native
  var retry: String = js.native
  var service: String = js.native
  var talk: String = js.native
  var unpack: String = js.native
  var write: String = js.native
}

object LogInfo {
  @scala.inline
  def apply(
    conv: String,
    cost: String,
    method: String,
    pack: String,
    path: String,
    prot: String,
    proxy: String,
    query: String,
    read: String,
    remote: String,
    requestID: String,
    retry: String,
    service: String,
    talk: String,
    unpack: String,
    write: String
  ): LogInfo = {
    val __obj = js.Dynamic.literal(conv = conv.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prot = prot.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], requestID = requestID.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], talk = talk.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogInfo]
  }
  @scala.inline
  implicit class LogInfoOps[Self <: LogInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTalk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("talk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnpack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

