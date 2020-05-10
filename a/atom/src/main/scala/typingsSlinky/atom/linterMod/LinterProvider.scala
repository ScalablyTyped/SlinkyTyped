package typingsSlinky.atom.linterMod

import typingsSlinky.atom.atomStrings.file
import typingsSlinky.atom.atomStrings.project
import typingsSlinky.atom.mod.TextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinterProvider extends js.Object {
  var grammarScopes: js.Array[String] = js.native
  var lintsOnChange: Boolean = js.native
  var name: String = js.native
  var scope: file | project = js.native
  def lint(editor: TextEditor): LintResult | js.Promise[LintResult] = js.native
}

object LinterProvider {
  @scala.inline
  def apply(
    grammarScopes: js.Array[String],
    lint: TextEditor => LintResult | js.Promise[LintResult],
    lintsOnChange: Boolean,
    name: String,
    scope: file | project
  ): LinterProvider = {
    val __obj = js.Dynamic.literal(grammarScopes = grammarScopes.asInstanceOf[js.Any], lint = js.Any.fromFunction1(lint), lintsOnChange = lintsOnChange.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinterProvider]
  }
  @scala.inline
  implicit class LinterProviderOps[Self <: LinterProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrammarScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grammarScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLint(value: TextEditor => LintResult | js.Promise[LintResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLintsOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lintsOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: file | project): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

