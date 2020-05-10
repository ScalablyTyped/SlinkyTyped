package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * INxDataPage...
  */
@js.native
trait INxDataPage extends js.Object {
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect = js.native
  /**
    * Is set to true, if the data have been reduced.
    * The default value is false.
    */
  var qIsReduced: Boolean = js.native
  /**
    * Array of data.
    */
  var qMatrix: js.Array[INxCellRows] = js.native
  /**
    * Array of tails.
    * Is used for hypercube objects with multiple dimensions. It might happen that due to the window size some elements
    * in a group cannot be displayed in the same page as the other elements of the group. Elements of a group of
    * dimensions can be part of the previous or the next tail.
    * If there is no tail, the array is empty [ ].
    */
  var qTails: js.Array[INxGroupTail] = js.native
}

object INxDataPage {
  @scala.inline
  def apply(qArea: IRect, qIsReduced: Boolean, qMatrix: js.Array[INxCellRows], qTails: js.Array[INxGroupTail]): INxDataPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qIsReduced = qIsReduced.asInstanceOf[js.Any], qMatrix = qMatrix.asInstanceOf[js.Any], qTails = qTails.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDataPage]
  }
  @scala.inline
  implicit class INxDataPageOps[Self <: INxDataPage] (val x: Self) extends AnyVal {
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
    def withQIsReduced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsReduced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMatrix(value: js.Array[INxCellRows]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTails(value: js.Array[INxGroupTail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

