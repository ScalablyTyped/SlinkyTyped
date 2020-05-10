package typingsSlinky.qlikEngineapi

import typingsSlinky.qlikEngineapi.EngineAPI.ISourceKeyRecord
import typingsSlinky.qlikEngineapi.EngineAPI.ITableRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQk extends js.Object {
  var qk: js.Array[ISourceKeyRecord] = js.native
  var qtr: js.Array[ITableRecord] = js.native
}

object AnonQk {
  @scala.inline
  def apply(qk: js.Array[ISourceKeyRecord], qtr: js.Array[ITableRecord]): AnonQk = {
    val __obj = js.Dynamic.literal(qk = qk.asInstanceOf[js.Any], qtr = qtr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQk]
  }
  @scala.inline
  implicit class AnonQkOps[Self <: AnonQk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQk(value: js.Array[ISourceKeyRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQtr(value: js.Array[ITableRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qtr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

