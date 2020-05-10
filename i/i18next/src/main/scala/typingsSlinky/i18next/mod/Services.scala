package typingsSlinky.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Services extends js.Object {
  var backendConnector: js.Any = js.native
  var i18nFormat: js.Any = js.native
  var interpolator: Interpolator = js.native
  var languageDetector: js.Any = js.native
  var languageUtils: js.Any = js.native
  var logger: js.Any = js.native
  var pluralResolver: js.Any = js.native
  var resourceStore: Resource = js.native
}

object Services {
  @scala.inline
  def apply(
    backendConnector: js.Any,
    i18nFormat: js.Any,
    interpolator: Interpolator,
    languageDetector: js.Any,
    languageUtils: js.Any,
    logger: js.Any,
    pluralResolver: js.Any,
    resourceStore: Resource
  ): Services = {
    val __obj = js.Dynamic.literal(backendConnector = backendConnector.asInstanceOf[js.Any], i18nFormat = i18nFormat.asInstanceOf[js.Any], interpolator = interpolator.asInstanceOf[js.Any], languageDetector = languageDetector.asInstanceOf[js.Any], languageUtils = languageUtils.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], pluralResolver = pluralResolver.asInstanceOf[js.Any], resourceStore = resourceStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  @scala.inline
  implicit class ServicesOps[Self <: Services] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendConnector(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendConnector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI18nFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpolator(value: Interpolator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageDetector(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageDetector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageUtils(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageUtils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluralResolver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralResolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceStore(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceStore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

