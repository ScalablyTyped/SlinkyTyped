package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bin extends js.Object {
  var bin: String = js.native
  var critical: Boolean = js.native
}

object Bin {
  @scala.inline
  def apply(bin: String, critical: Boolean): Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  @scala.inline
  implicit class BinOps[Self <: Bin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

