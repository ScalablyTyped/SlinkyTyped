package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.TEXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyle extends BaseStyle {
  var fontName: FontName = js.native
  var fontSize: Double = js.native
  var letterSpacing: LetterSpacing = js.native
  var lineHeight: LineHeight = js.native
  var paragraphIndent: Double = js.native
  var paragraphSpacing: Double = js.native
  var textCase: TextCase = js.native
  var textDecoration: TextDecoration = js.native
  @JSName("type")
  var type_TextStyle: TEXT = js.native
}

object TextStyle {
  @scala.inline
  def apply(
    description: String,
    fontName: FontName,
    fontSize: Double,
    id: String,
    key: String,
    letterSpacing: LetterSpacing,
    lineHeight: LineHeight,
    name: String,
    paragraphIndent: Double,
    paragraphSpacing: Double,
    remote: Boolean,
    remove: () => Unit,
    textCase: TextCase,
    textDecoration: TextDecoration,
    `type`: TEXT
  ): TextStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paragraphIndent = paragraphIndent.asInstanceOf[js.Any], paragraphSpacing = paragraphSpacing.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), textCase = textCase.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontName(value: FontName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLetterSpacing(value: LetterSpacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeight(value: LineHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraphIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraphSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextCase(value: TextCase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDecoration(value: TextDecoration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TEXT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

