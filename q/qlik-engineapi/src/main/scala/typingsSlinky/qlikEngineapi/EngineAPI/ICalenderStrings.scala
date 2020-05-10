package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CalenderStrings...
  */
@js.native
trait ICalenderStrings extends js.Object {
  /**
    * List of short day names.
    */
  var qDayNames: js.Array[String] = js.native
  /**
    * List of long day names.
    */
  var qLongDayNames: js.Array[String] = js.native
  /**
    * List of long month names.
    */
  var qLongMonthNames: js.Array[String] = js.native
  /**
    * List of short month names.
    */
  var qMonthNames: js.Array[String] = js.native
}

object ICalenderStrings {
  @scala.inline
  def apply(
    qDayNames: js.Array[String],
    qLongDayNames: js.Array[String],
    qLongMonthNames: js.Array[String],
    qMonthNames: js.Array[String]
  ): ICalenderStrings = {
    val __obj = js.Dynamic.literal(qDayNames = qDayNames.asInstanceOf[js.Any], qLongDayNames = qLongDayNames.asInstanceOf[js.Any], qLongMonthNames = qLongMonthNames.asInstanceOf[js.Any], qMonthNames = qMonthNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalenderStrings]
  }
  @scala.inline
  implicit class ICalenderStringsOps[Self <: ICalenderStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLongDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLongDayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLongMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLongMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

