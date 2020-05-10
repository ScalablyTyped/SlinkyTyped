package typingsSlinky.eslint.mod.Linter

import typingsSlinky.eslint.mod.Rule.Fix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintSuggestion extends js.Object {
  var desc: String = js.native
  var fix: Fix = js.native
  var messageId: js.UndefOr[String] = js.native
}

object LintSuggestion {
  @scala.inline
  def apply(desc: String, fix: Fix): LintSuggestion = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintSuggestion]
  }
  @scala.inline
  implicit class LintSuggestionOps[Self <: LintSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFix(value: Fix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(js.undefined)
        ret
    }
  }
  
}

