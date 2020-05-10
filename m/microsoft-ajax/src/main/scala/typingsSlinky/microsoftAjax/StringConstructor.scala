package typingsSlinky.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Provides extensions to the base ECMAScript (JavaScript) String object by including static and instance methods.
* String Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb397472(v=vs.100).aspx}
*/
@js.native
trait StringConstructor extends js.Object {
  /**
  * Replaces each format item in a String object with the text equivalent of a corresponding object's value.
  * @returns A copy of the string with the formatting applied.
  */
  def format(format: java.lang.String, args: js.Any*): java.lang.String = js.native
  /**
    * Replaces the format items in a String object with the text equivalent of a corresponding object's value. The current culture is used to format dates and numbers.
    * @returns A copy of the string with the formatting applied.
    */
  def localeFormat(format: java.lang.String, args: js.Any*): java.lang.String = js.native
}

object StringConstructor {
  @scala.inline
  def apply(
    format: (java.lang.String, /* repeated */ js.Any) => java.lang.String,
    localeFormat: (java.lang.String, /* repeated */ js.Any) => java.lang.String
  ): StringConstructor = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), localeFormat = js.Any.fromFunction2(localeFormat))
    __obj.asInstanceOf[StringConstructor]
  }
  @scala.inline
  implicit class StringConstructorOps[Self <: StringConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: (java.lang.String, /* repeated */ js.Any) => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLocaleFormat(value: (java.lang.String, /* repeated */ js.Any) => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeFormat")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

