package typingsSlinky.dojo.dojox.dtl.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/utils/date.html
  *
  *
  */
@js.native
trait date extends js.Object {
  /**
    * Format the internal date object
    *
    * @param format
    */
  def DateFormat(format: String): Unit = js.native
}

object date {
  @scala.inline
  def apply(DateFormat: String => Unit): date = {
    val __obj = js.Dynamic.literal(DateFormat = js.Any.fromFunction1(DateFormat))
    __obj.asInstanceOf[date]
  }
  @scala.inline
  implicit class dateOps[Self <: date] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFormat(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateFormat")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

