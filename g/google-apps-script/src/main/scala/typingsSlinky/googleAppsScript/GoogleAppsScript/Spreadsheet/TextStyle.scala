package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The rendered style of text in a cell.
  *
  * Text styles can have a corresponding RichTextValue. If the RichTextValue spans multiple text runs that have different values for a given text style read
  * method, the method returns null. To avoid this, query for text styles using the Rich Text
  * values returned by the RichTextValue.getRuns() method.
  */
@js.native
trait TextStyle extends js.Object {
  def copy(): TextStyleBuilder = js.native
  def getFontFamily(): String | Null = js.native
  def getFontSize(): Integer | Null = js.native
  def getForegroundColor(): String | Null = js.native
  def isBold(): Boolean | Null = js.native
  def isItalic(): Boolean | Null = js.native
  def isStrikethrough(): Boolean | Null = js.native
  def isUnderline(): Boolean | Null = js.native
}

object TextStyle {
  @scala.inline
  def apply(
    copy: () => TextStyleBuilder,
    getFontFamily: () => String | Null,
    getFontSize: () => Integer | Null,
    getForegroundColor: () => String | Null,
    isBold: () => Boolean | Null,
    isItalic: () => Boolean | Null,
    isStrikethrough: () => Boolean | Null,
    isUnderline: () => Boolean | Null
  ): TextStyle = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getFontFamily = js.Any.fromFunction0(getFontFamily), getFontSize = js.Any.fromFunction0(getFontSize), getForegroundColor = js.Any.fromFunction0(getForegroundColor), isBold = js.Any.fromFunction0(isBold), isItalic = js.Any.fromFunction0(isItalic), isStrikethrough = js.Any.fromFunction0(isStrikethrough), isUnderline = js.Any.fromFunction0(isUnderline))
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: () => TextStyleBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFontFamily(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontFamily")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFontSize(value: () => Integer | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetForegroundColor(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForegroundColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBold(value: () => Boolean | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBold")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsItalic(value: () => Boolean | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isItalic")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStrikethrough(value: () => Boolean | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrikethrough")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUnderline(value: () => Boolean | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnderline")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

