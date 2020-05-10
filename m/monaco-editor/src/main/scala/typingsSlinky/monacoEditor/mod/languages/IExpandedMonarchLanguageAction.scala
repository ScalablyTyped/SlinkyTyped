package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpandedMonarchLanguageAction extends js.Object {
  /**
    * @open or @close
    */
  var bracket: js.UndefOr[String] = js.native
  /**
    * map from string to ILanguageAction
    */
  var cases: js.UndefOr[js.Object] = js.native
  /**
    * go back n characters in the stream
    */
  var goBack: js.UndefOr[Double] = js.native
  /**
    * array of actions for each parenthesized match group
    */
  var group: js.UndefOr[js.Array[IMonarchLanguageAction]] = js.native
  /**
    * log a message to the browser console window
    */
  var log: js.UndefOr[String] = js.native
  /**
    * the next state to push, or "@push", "@pop", "@popall"
    */
  var next: js.UndefOr[String] = js.native
  /**
    * switch to embedded language (using the mimetype) or get out using "@pop"
    */
  var nextEmbedded: js.UndefOr[String] = js.native
  /**
    * switch to this state
    */
  var switchTo: js.UndefOr[String] = js.native
  /**
    * token class (ie. css class) (or "@brackets" or "@rematch")
    */
  var token: js.UndefOr[String] = js.native
}

object IExpandedMonarchLanguageAction {
  @scala.inline
  def apply(): IExpandedMonarchLanguageAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandedMonarchLanguageAction]
  }
  @scala.inline
  implicit class IExpandedMonarchLanguageActionOps[Self <: IExpandedMonarchLanguageAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBracket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBracket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracket")(js.undefined)
        ret
    }
    @scala.inline
    def withCases(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cases")(js.undefined)
        ret
    }
    @scala.inline
    def withGoBack(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goBack")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: js.Array[IMonarchLanguageAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withNextEmbedded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEmbedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextEmbedded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEmbedded")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchTo")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

