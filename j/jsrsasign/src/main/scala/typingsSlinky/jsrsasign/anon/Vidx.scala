package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vidx extends js.Object {
  var critical: Boolean = js.native
  var oid: String = js.native
  var vidx: Double = js.native
}

object Vidx {
  @scala.inline
  def apply(critical: Boolean, oid: String, vidx: Double): Vidx = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], vidx = vidx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vidx]
  }
  @scala.inline
  implicit class VidxOps[Self <: Vidx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVidx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vidx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

