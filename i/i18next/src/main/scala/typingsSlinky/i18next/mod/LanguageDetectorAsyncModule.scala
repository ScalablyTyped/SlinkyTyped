package typingsSlinky.i18next.mod

import typingsSlinky.i18next.i18nextBooleans.`true`
import typingsSlinky.i18next.i18nextStrings.languageDetector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to detect language in user land.
  * Can be provided as a singleton or as a prototype constructor (preferred for supporting multiple instances of i18next).
  * For singleton set property `type` to `'languageDetector'` For a prototype constructor set static property.
  */
@js.native
trait LanguageDetectorAsyncModule extends Module {
  /** Set to true to enable async detection */
  var async: `true` = js.native
  @JSName("type")
  var type_LanguageDetectorAsyncModule: languageDetector = js.native
  def cacheUserLanguage(lng: String): Unit = js.native
  /** Must call callback passing detected language */
  def detect(callback: js.Function1[/* lng */ String, Unit]): Unit = js.native
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit = js.native
}

object LanguageDetectorAsyncModule {
  @scala.inline
  def apply(
    async: `true`,
    cacheUserLanguage: String => Unit,
    detect: js.Function1[/* lng */ String, Unit] => Unit,
    init: (Services, js.Object, InitOptions) => Unit,
    `type`: languageDetector
  ): LanguageDetectorAsyncModule = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], cacheUserLanguage = js.Any.fromFunction1(cacheUserLanguage), detect = js.Any.fromFunction1(detect), init = js.Any.fromFunction3(init))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectorAsyncModule]
  }
  @scala.inline
  implicit class LanguageDetectorAsyncModuleOps[Self <: LanguageDetectorAsyncModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheUserLanguage(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheUserLanguage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDetect(value: js.Function1[/* lng */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInit(value: (Services, js.Object, InitOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withType(value: languageDetector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

