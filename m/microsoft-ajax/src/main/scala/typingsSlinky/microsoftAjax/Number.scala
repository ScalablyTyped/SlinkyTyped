package typingsSlinky.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Extends the base ECMAScript (JavaScript) Number functionality with static and instance methods.
* Number Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb310835(v=vs.100).aspx}
*/
@js.native
trait Number extends js.Object {
  /**
    * Formats a number by using the invariant culture.
    */
  def format(format: java.lang.String): java.lang.String = js.native
  /**
    * Formats a number by using the current culture.
    */
  def localeFormat(format: java.lang.String): java.lang.String = js.native
}

object Number {
  @scala.inline
  def apply(format: java.lang.String => java.lang.String, localeFormat: java.lang.String => java.lang.String): Number = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), localeFormat = js.Any.fromFunction1(localeFormat))
    __obj.asInstanceOf[Number]
  }
  @scala.inline
  implicit class NumberOps[Self <: Number] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: java.lang.String => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocaleFormat(value: java.lang.String => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeFormat")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

