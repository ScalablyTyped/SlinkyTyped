package typingsSlinky.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryStat extends js.Object {
  var data: String = js.native
  var dt: String = js.native
  var lib: String = js.native
  var resident: String = js.native
  var share: String = js.native
  var size: String = js.native
  var text: String = js.native
}

object MemoryStat {
  @scala.inline
  def apply(data: String, dt: String, lib: String, resident: String, share: String, size: String, text: String): MemoryStat = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any], resident = resident.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStat]
  }
  @scala.inline
  implicit class MemoryStatOps[Self <: MemoryStat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLib(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResident(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resident")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShare(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("share")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

