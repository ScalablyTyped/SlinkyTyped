package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains properties specifying the behavior of a {@link NumberFormatter} .
  * @see NumberFormatter
  */
@js.native
trait NumberFormatProperties extends js.Object {
  /** contains a comment regarding the number format for display to the user. */
  var Comment: String = js.native
  /** contains the format string of the number format. */
  var FormatString: String = js.native
  /** contains the locale of the number format. */
  var Locale: typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /**
    * contains the type of the number format.
    * @see NumberFormat
    */
  var Type: Double = js.native
}

object NumberFormatProperties {
  @scala.inline
  def apply(Comment: String, FormatString: String, Locale: Locale, Type: Double): NumberFormatProperties = {
    val __obj = js.Dynamic.literal(Comment = Comment.asInstanceOf[js.Any], FormatString = FormatString.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatProperties]
  }
  @scala.inline
  implicit class NumberFormatPropertiesOps[Self <: NumberFormatProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormatString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

