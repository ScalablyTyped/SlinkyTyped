package typingsSlinky.angularCompiler.compilerOptionsMod

import typingsSlinky.angularCompiler.angularCompilerStrings.ngtsc
import typingsSlinky.angularCompiler.angularCompilerStrings.tsc
import typingsSlinky.angularCompiler.coreMod.MissingTranslationStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AotCompilerOptions extends js.Object {
  var allowEmptyCodegenFiles: js.UndefOr[Boolean] = js.native
  var createExternalSymbolFactoryReexports: js.UndefOr[Boolean] = js.native
  var enableIvy: js.UndefOr[Boolean | ngtsc | tsc] = js.native
  var enableSummariesForJit: js.UndefOr[Boolean] = js.native
  var fullTemplateTypeCheck: js.UndefOr[Boolean] = js.native
  var i18nFormat: js.UndefOr[String] = js.native
  var i18nUseExternalIds: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[String] = js.native
  var missingTranslation: js.UndefOr[MissingTranslationStrategy] = js.native
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  var strictInjectionParameters: js.UndefOr[Boolean] = js.native
  var translations: js.UndefOr[String] = js.native
}

object AotCompilerOptions {
  @scala.inline
  def apply(): AotCompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AotCompilerOptions]
  }
  @scala.inline
  implicit class AotCompilerOptionsOps[Self <: AotCompilerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmptyCodegenFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyCodegenFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmptyCodegenFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyCodegenFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateExternalSymbolFactoryReexports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createExternalSymbolFactoryReexports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateExternalSymbolFactoryReexports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createExternalSymbolFactoryReexports")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableIvy(value: Boolean | ngtsc | tsc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIvy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableIvy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIvy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSummariesForJit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSummariesForJit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSummariesForJit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSummariesForJit")(js.undefined)
        ret
    }
    @scala.inline
    def withFullTemplateTypeCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTemplateTypeCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullTemplateTypeCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTemplateTypeCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withI18nFormat(value: String): Self = {
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
    def withI18nUseExternalIds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nUseExternalIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18nUseExternalIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nUseExternalIds")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingTranslation(value: MissingTranslationStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingTranslation")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveWhitespaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveWhitespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictInjectionParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictInjectionParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictInjectionParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictInjectionParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

