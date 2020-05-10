package typingsSlinky.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modules extends js.Object {
  var backend: js.UndefOr[BackendModule[js.Object]] = js.native
  var external: js.Array[ThirdPartyModule] = js.native
  var i18nFormat: js.UndefOr[I18nFormatModule] = js.native
  var languageDetector: js.UndefOr[LanguageDetectorModule | LanguageDetectorAsyncModule] = js.native
  var logger: js.UndefOr[LoggerModule] = js.native
}

object Modules {
  @scala.inline
  def apply(external: js.Array[ThirdPartyModule]): Modules = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modules]
  }
  @scala.inline
  implicit class ModulesOps[Self <: Modules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternal(value: js.Array[ThirdPartyModule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackend(value: BackendModule[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(js.undefined)
        ret
    }
    @scala.inline
    def withI18nFormat(value: I18nFormatModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18nFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageDetector(value: LanguageDetectorModule | LanguageDetectorAsyncModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageDetector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageDetector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageDetector")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: LoggerModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
  }
  
}

