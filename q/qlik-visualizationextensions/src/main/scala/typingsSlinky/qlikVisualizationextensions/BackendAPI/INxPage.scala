package typingsSlinky.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INxPage extends js.Object {
  /**
    * Number of rows or elements in the page. The indexing of the rows may vary depending on
    * whether the cells are expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qHeight: Double = js.native
  /**
    * Position from the left.
    * Corresponds to the first column.
    */
  var qLeft: Double = js.native
  /**
    * Position from the top.
    * Corresponds to the first row.
    */
  var qTop: Double = js.native
  /**
    * Number of columns in the page. The indexing of the columns may vary depending on whether
    * the cells are expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qWidth: Double = js.native
}

object INxPage {
  @scala.inline
  def apply(qHeight: Double, qLeft: Double, qTop: Double, qWidth: Double): INxPage = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any], qWidth = qWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPage]
  }
  @scala.inline
  implicit class INxPageOps[Self <: INxPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

