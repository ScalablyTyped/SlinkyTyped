package typingsSlinky.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorColours extends js.Object {
  var atom: String = js.native
  var attribute: String = js.native
  var builtin: String = js.native
  var comment: String = js.native
  var cursorColor: String = js.native
  var `def`: String = js.native
  var editorBackground: String = js.native
  var keyword: String = js.native
  var leftDrawerBackground: String = js.native
  var meta: String = js.native
  var number: String = js.native
  var property: String = js.native
  var punctuation: String = js.native
  var qualifier: String = js.native
  var resultBackground: String = js.native
  var rightDrawerBackground: String = js.native
  var selection: String = js.native
  var string: String = js.native
  var string2: String = js.native
  var variable: String = js.native
  var ws: String = js.native
}

object EditorColours {
  @scala.inline
  def apply(
    atom: String,
    attribute: String,
    builtin: String,
    comment: String,
    cursorColor: String,
    `def`: String,
    editorBackground: String,
    keyword: String,
    leftDrawerBackground: String,
    meta: String,
    number: String,
    property: String,
    punctuation: String,
    qualifier: String,
    resultBackground: String,
    rightDrawerBackground: String,
    selection: String,
    string: String,
    string2: String,
    variable: String,
    ws: String
  ): EditorColours = {
    val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any], attribute = attribute.asInstanceOf[js.Any], builtin = builtin.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], cursorColor = cursorColor.asInstanceOf[js.Any], editorBackground = editorBackground.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], leftDrawerBackground = leftDrawerBackground.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], punctuation = punctuation.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], resultBackground = resultBackground.asInstanceOf[js.Any], rightDrawerBackground = rightDrawerBackground.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], string2 = string2.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], ws = ws.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorColours]
  }
  @scala.inline
  implicit class EditorColoursOps[Self <: EditorColours] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuiltin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftDrawerBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftDrawerBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPunctuation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("punctuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightDrawerBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightDrawerBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ws")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

