package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  var qHyperCube: HyperCube = js.native
  var qInfo: NxInfo = js.native
  var qSelectionInfo: Selectionobject = js.native
}

object Layout {
  @scala.inline
  def apply(qHyperCube: HyperCube, qInfo: NxInfo, qSelectionInfo: Selectionobject): Layout = {
    val __obj = js.Dynamic.literal(qHyperCube = qHyperCube.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQHyperCube(value: HyperCube): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHyperCube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQInfo(value: NxInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelectionInfo(value: Selectionobject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelectionInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

