package typingsSlinky.monacoEditor.mod.languages

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMonarchLanguage extends js.Object {
  /**
    * for example [['{','}','delimiter.curly']]
    */
  var brackets: js.UndefOr[js.Array[IMonarchLanguageBracket]] = js.native
  /**
    * if no match in the tokenizer assign this token class (default 'source')
    */
  var defaultToken: js.UndefOr[String] = js.native
  /**
    * is the language case insensitive?
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  /**
    * start symbol in the tokenizer (by default the first entry is used)
    */
  var start: js.UndefOr[String] = js.native
  /**
    * attach this to every token class (by default '.' + name)
    */
  var tokenPostfix: js.UndefOr[String] = js.native
  /**
    * map from string to ILanguageRule[]
    */
  var tokenizer: StringDictionary[js.Array[IMonarchLanguageRule]] = js.native
}

object IMonarchLanguage {
  @scala.inline
  def apply(tokenizer: StringDictionary[js.Array[IMonarchLanguageRule]]): IMonarchLanguage = {
    val __obj = js.Dynamic.literal(tokenizer = tokenizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonarchLanguage]
  }
  @scala.inline
  implicit class IMonarchLanguageOps[Self <: IMonarchLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokenizer(value: StringDictionary[js.Array[IMonarchLanguageRule]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrackets(value: js.Array[IMonarchLanguageBracket]): Self = {
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
    def withDefaultToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultToken")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenPostfix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenPostfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenPostfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenPostfix")(js.undefined)
        ret
    }
  }
  
}

