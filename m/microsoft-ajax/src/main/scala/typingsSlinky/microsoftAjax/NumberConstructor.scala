package typingsSlinky.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberConstructor extends js.Object {
  /**
    * Returns a numeric value from a string representation of a number. This function is static and can be called without creating an instance of the object.
    */
  def parseInvariant(format: java.lang.String): Double = js.native
  /**
    * Creates a numeric value from a locale-specific string.
    */
  def parseLocale(format: java.lang.String): Double = js.native
}

object NumberConstructor {
  @scala.inline
  def apply(parseInvariant: java.lang.String => Double, parseLocale: java.lang.String => Double): NumberConstructor = {
    val __obj = js.Dynamic.literal(parseInvariant = js.Any.fromFunction1(parseInvariant), parseLocale = js.Any.fromFunction1(parseLocale))
    __obj.asInstanceOf[NumberConstructor]
  }
  @scala.inline
  implicit class NumberConstructorOps[Self <: NumberConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParseInvariant(value: java.lang.String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInvariant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseLocale(value: java.lang.String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseLocale")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

