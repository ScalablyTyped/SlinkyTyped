package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxStackPage...
  */
@js.native
trait INxStackPage extends js.Object {
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect = js.native
  /**
    * Array of data.
    */
  var qData: js.Array[INxStackedPivotCell] = js.native
}

object INxStackPage {
  @scala.inline
  def apply(qArea: IRect, qData: js.Array[INxStackedPivotCell]): INxStackPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStackPage]
  }
  @scala.inline
  implicit class INxStackPageOps[Self <: INxStackPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQArea(value: IRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQData(value: js.Array[INxStackedPivotCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

