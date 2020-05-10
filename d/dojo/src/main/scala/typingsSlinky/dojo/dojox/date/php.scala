package typingsSlinky.dojo.dojox.date

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/php.html
  *
  *
  */
@js.native
trait php extends js.Object {
  /**
    * Format the internal date object
    *
    * @param format
    */
  def DateFormat(format: String): Unit = js.native
  /**
    * Get a formatted string for a given date object
    *
    * @param date
    * @param format
    */
  def format(date: js.Date, format: String): Unit = js.native
}

object php {
  @scala.inline
  def apply(DateFormat: String => Unit, format: (js.Date, String) => Unit): php = {
    val __obj = js.Dynamic.literal(DateFormat = js.Any.fromFunction1(DateFormat), format = js.Any.fromFunction2(format))
    __obj.asInstanceOf[php]
  }
  @scala.inline
  implicit class phpOps[Self <: php] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withFormat(value: (js.Date, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

