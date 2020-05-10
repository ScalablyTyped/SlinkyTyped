package typingsSlinky.localizedStrings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var customLanguageInterface: js.UndefOr[GetInterfaceLanguageCallback] = js.native
  var logsEnabled: js.UndefOr[Boolean] = js.native
  var pseudo: js.UndefOr[Boolean] = js.native
  var pseudoMultipleLanguages: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomLanguageInterface(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLanguageInterface")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCustomLanguageInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLanguageInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withLogsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPseudo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPseudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudo")(js.undefined)
        ret
    }
    @scala.inline
    def withPseudoMultipleLanguages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudoMultipleLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPseudoMultipleLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudoMultipleLanguages")(js.undefined)
        ret
    }
  }
  
}

