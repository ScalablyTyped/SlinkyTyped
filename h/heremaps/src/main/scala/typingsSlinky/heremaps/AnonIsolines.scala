package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsolines extends js.Object {
  var MetaInfo: AnonTimestamp = js.native
  var View: js.Array[AnonResult] = js.native
  var isolines: js.Array[_] = js.native
}

object AnonIsolines {
  @scala.inline
  def apply(MetaInfo: AnonTimestamp, View: js.Array[AnonResult], isolines: js.Array[_]): AnonIsolines = {
    val __obj = js.Dynamic.literal(MetaInfo = MetaInfo.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], isolines = isolines.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsolines]
  }
  @scala.inline
  implicit class AnonIsolinesOps[Self <: AnonIsolines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetaInfo(value: AnonTimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: js.Array[AnonResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsolines(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolines")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

