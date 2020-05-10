package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for text styles.
  */
@js.native
trait TextStyleBuilder extends js.Object {
  def build(): TextStyle = js.native
  def setBold(bold: Boolean): TextStyleBuilder = js.native
  def setFontFamily(fontFamily: String): TextStyleBuilder = js.native
  def setFontSize(fontSize: Integer): TextStyleBuilder = js.native
  def setForegroundColor(cssString: String): TextStyleBuilder = js.native
  def setItalic(italic: Boolean): TextStyleBuilder = js.native
  def setStrikethrough(strikethrough: Boolean): TextStyleBuilder = js.native
  def setUnderline(underline: Boolean): TextStyleBuilder = js.native
}

object TextStyleBuilder {
  @scala.inline
  def apply(
    build: () => TextStyle,
    setBold: Boolean => TextStyleBuilder,
    setFontFamily: String => TextStyleBuilder,
    setFontSize: Integer => TextStyleBuilder,
    setForegroundColor: String => TextStyleBuilder,
    setItalic: Boolean => TextStyleBuilder,
    setStrikethrough: Boolean => TextStyleBuilder,
    setUnderline: Boolean => TextStyleBuilder
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setBold = js.Any.fromFunction1(setBold), setFontFamily = js.Any.fromFunction1(setFontFamily), setFontSize = js.Any.fromFunction1(setFontSize), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setItalic = js.Any.fromFunction1(setItalic), setStrikethrough = js.Any.fromFunction1(setStrikethrough), setUnderline = js.Any.fromFunction1(setUnderline))
    __obj.asInstanceOf[TextStyleBuilder]
  }
  @scala.inline
  implicit class TextStyleBuilderOps[Self <: TextStyleBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: () => TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBold(value: Boolean => TextStyleBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFontFamily(value: String => TextStyleBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFontFamily")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFontSize(value: Integer => TextStyleBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFontSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetForegroundColor(value: String => TextStyleBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setForegroundColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetItalic(value: Boolean => TextStyleBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItalic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrikethrough(value: Boolean => TextStyleBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrikethrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUnderline(value: Boolean => TextStyleBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUnderline")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

