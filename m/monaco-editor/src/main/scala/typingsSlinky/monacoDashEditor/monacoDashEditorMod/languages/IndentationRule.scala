package typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndentationRule extends js.Object {
  /**
    * If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches).
    */
  var decreaseIndentPattern: js.RegExp
  /**
    * If a line matches this pattern, then all the lines after it should be indented once (until another rule matches).
    */
  var increaseIndentPattern: js.RegExp
  /**
    * If a line matches this pattern, then **only the next line** after it should be indented once.
    */
  var indentNextLinePattern: js.UndefOr[js.RegExp | Null] = js.undefined
  /**
    * If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules.
    */
  var unIndentedLinePattern: js.UndefOr[js.RegExp | Null] = js.undefined
}

object IndentationRule {
  @scala.inline
  def apply(
    decreaseIndentPattern: js.RegExp,
    increaseIndentPattern: js.RegExp,
    indentNextLinePattern: js.RegExp = null,
    unIndentedLinePattern: js.RegExp = null
  ): IndentationRule = {
    val __obj = js.Dynamic.literal(decreaseIndentPattern = decreaseIndentPattern.asInstanceOf[js.Any], increaseIndentPattern = increaseIndentPattern.asInstanceOf[js.Any])
    if (indentNextLinePattern != null) __obj.updateDynamic("indentNextLinePattern")(indentNextLinePattern.asInstanceOf[js.Any])
    if (unIndentedLinePattern != null) __obj.updateDynamic("unIndentedLinePattern")(unIndentedLinePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentationRule]
  }
}

