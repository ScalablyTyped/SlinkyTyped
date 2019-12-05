package typingsSlinky.dojo.dojox.date

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/php.html
  *
  *
  */
trait php extends js.Object {
  /**
    * Format the internal date object
    *
    * @param format
    */
  def DateFormat(format: String): Unit
  /**
    * Get a formatted string for a given date object
    *
    * @param date
    * @param format
    */
  def format(date: js.Date, format: String): Unit
}

object php {
  @scala.inline
  def apply(DateFormat: String => Unit, format: (js.Date, String) => Unit): php = {
    val __obj = js.Dynamic.literal(DateFormat = js.Any.fromFunction1(DateFormat), format = js.Any.fromFunction2(format))
  
    __obj.asInstanceOf[php]
  }
}

