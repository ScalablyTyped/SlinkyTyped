package typingsSlinky.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Io extends js.Object {
  var cancelled_write_bytes: String = js.native
  var rchar: String = js.native
  var read_bytes: String = js.native
  var syscr: String = js.native
  var syscw: String = js.native
  var wchar: String = js.native
  var write_bytes: String = js.native
}

object Io {
  @scala.inline
  def apply(
    cancelled_write_bytes: String,
    rchar: String,
    read_bytes: String,
    syscr: String,
    syscw: String,
    wchar: String,
    write_bytes: String
  ): Io = {
    val __obj = js.Dynamic.literal(cancelled_write_bytes = cancelled_write_bytes.asInstanceOf[js.Any], rchar = rchar.asInstanceOf[js.Any], read_bytes = read_bytes.asInstanceOf[js.Any], syscr = syscr.asInstanceOf[js.Any], syscw = syscw.asInstanceOf[js.Any], wchar = wchar.asInstanceOf[js.Any], write_bytes = write_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Io]
  }
  @scala.inline
  implicit class IoOps[Self <: Io] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelled_write_bytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_write_bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRchar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rchar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead_bytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read_bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyscr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syscr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyscw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syscw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWchar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wchar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite_bytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write_bytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

