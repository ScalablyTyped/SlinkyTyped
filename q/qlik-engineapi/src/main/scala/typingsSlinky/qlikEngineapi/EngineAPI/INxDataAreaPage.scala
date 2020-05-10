package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDataAreaPage...
  */
@js.native
trait INxDataAreaPage extends js.Object {
  /**
    * Height of the page.
    * The difference between qTop and qHeight gives the lowest possible value of the second measure
    * (the measure on the y-axis).
    */
  var qHeight: Double = js.native
  /**
    * Position from the left.
    * Corresponds to the lowest possible value of the first measure
    * (the measure on the x-axis).
    */
  var qLeft: Double = js.native
  /**
    * Position from the top.
    * Corresponds to the highest possible value of the second measure
    * (the measure on the y-axis).
    */
  var qTop: Double = js.native
  /**
    * Width of the page.
    * Corresponds to the highest possible value of the first measure
    * (the measure on the x-axis).
    */
  var qWidth: Double = js.native
}

object INxDataAreaPage {
  @scala.inline
  def apply(qHeight: Double, qLeft: Double, qTop: Double, qWidth: Double): INxDataAreaPage = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any], qWidth = qWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDataAreaPage]
  }
  @scala.inline
  implicit class INxDataAreaPageOps[Self <: INxDataAreaPage] (val x: Self) extends AnyVal {
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

