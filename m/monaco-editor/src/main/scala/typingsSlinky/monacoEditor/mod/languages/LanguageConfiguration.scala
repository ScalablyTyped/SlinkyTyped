package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.anon.DocComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageConfiguration extends js.Object {
  /**
    * **Deprecated** Do not use.
    *
    * @deprecated Will be replaced by a better API soon.
    */
  var __electricCharacterSupport: js.UndefOr[DocComment] = js.native
  /**
    * Defines what characters must be after the cursor for bracket or quote autoclosing to occur when using the \'languageDefined\' autoclosing setting.
    *
    * This is typically the set of characters which can not start an expression, such as whitespace, closing brackets, non-unary operators, etc.
    */
  var autoCloseBefore: js.UndefOr[String] = js.native
  /**
    * The language's auto closing pairs. The 'close' character is automatically inserted with the
    * 'open' character is typed. If not set, the configured brackets will be used.
    */
  var autoClosingPairs: js.UndefOr[js.Array[IAutoClosingPairConditional]] = js.native
  /**
    * The language's brackets.
    * This configuration implicitly affects pressing Enter around these brackets.
    */
  var brackets: js.UndefOr[js.Array[CharacterPair]] = js.native
  /**
    * The language's comment settings.
    */
  var comments: js.UndefOr[CommentRule] = js.native
  /**
    * The language's folding rules.
    */
  var folding: js.UndefOr[FoldingRules] = js.native
  /**
    * The language's indentation settings.
    */
  var indentationRules: js.UndefOr[IndentationRule] = js.native
  /**
    * The language's rules to be evaluated when pressing Enter.
    */
  var onEnterRules: js.UndefOr[js.Array[OnEnterRule]] = js.native
  /**
    * The language's surrounding pairs. When the 'open' character is typed on a selection, the
    * selected string is surrounded by the open and close characters. If not set, the autoclosing pairs
    * settings will be used.
    */
  var surroundingPairs: js.UndefOr[js.Array[IAutoClosingPair]] = js.native
  /**
    * The language's word definition.
    * If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
    * to provide a word definition that uses exclusion of known separators.
    * e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
    *   /(-?\d*\.\d\w*)|([^\`\~\!\@\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g
    */
  var wordPattern: js.UndefOr[js.RegExp] = js.native
}

object LanguageConfiguration {
  @scala.inline
  def apply(): LanguageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageConfiguration]
  }
  @scala.inline
  implicit class LanguageConfigurationOps[Self <: LanguageConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__electricCharacterSupport(value: DocComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__electricCharacterSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__electricCharacterSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__electricCharacterSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCloseBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCloseBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCloseBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCloseBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoClosingPairs(value: js.Array[IAutoClosingPairConditional]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingPairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClosingPairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingPairs")(js.undefined)
        ret
    }
    @scala.inline
    def withBrackets(value: js.Array[CharacterPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brackets")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: CommentRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withFolding(value: FoldingRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentationRules(value: IndentationRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnterRules(value: js.Array[OnEnterRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnterRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterRules")(js.undefined)
        ret
    }
    @scala.inline
    def withSurroundingPairs(value: js.Array[IAutoClosingPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surroundingPairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurroundingPairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surroundingPairs")(js.undefined)
        ret
    }
    @scala.inline
    def withWordPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordPattern")(js.undefined)
        ret
    }
  }
  
}

