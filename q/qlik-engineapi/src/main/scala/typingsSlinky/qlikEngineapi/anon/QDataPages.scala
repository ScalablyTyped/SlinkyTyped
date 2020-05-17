package typingsSlinky.qlikEngineapi.anon

import typingsSlinky.qlikEngineapi.EngineAPI.INxAxisData
import typingsSlinky.qlikEngineapi.EngineAPI.INxDataPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QDataPages extends js.Object {
  var qAxisData: js.Array[INxAxisData] = js.native
  var qDataPages: INxDataPage = js.native
}

object QDataPages {
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: INxDataPage): QDataPages = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDataPages]
  }
  @scala.inline
  implicit class QDataPagesOps[Self <: QDataPages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAxisData(value: js.Array[INxAxisData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAxisData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDataPages(value: INxDataPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDataPages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

