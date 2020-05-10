package typingsSlinky.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnixSocket extends js.Object {
  var Flags: String = js.native
  var Inode: String = js.native
  var Num: String = js.native
  var Path: String = js.native
  var Protocol: String = js.native
  var RefCount: String = js.native
  var St: String = js.native
  var Type: String = js.native
}

object UnixSocket {
  @scala.inline
  def apply(
    Flags: String,
    Inode: String,
    Num: String,
    Path: String,
    Protocol: String,
    RefCount: String,
    St: String,
    Type: String
  ): UnixSocket = {
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Inode = Inode.asInstanceOf[js.Any], Num = Num.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], RefCount = RefCount.asInstanceOf[js.Any], St = St.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixSocket]
  }
  @scala.inline
  implicit class UnixSocketOps[Self <: UnixSocket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Num")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("St")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

