package typingsSlinky.i18nextBrowserLanguagedetector.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.i18next.mod.LanguageDetectorModule
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.cookie
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.htmlTag
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.languageDetector
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.localStorage
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.navigator
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.querystring
import typingsSlinky.i18nextBrowserLanguagedetector.i18nextBrowserLanguagedetectorStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nextBrowserLanguageDetector extends LanguageDetectorModule {
  var detectors: StringDictionary[js.Any] = js.native
  var i18nOptions: js.Any = js.native
  var services: js.Any = js.native
  @JSName("type")
  var type_I18nextBrowserLanguageDetector: languageDetector = js.native
  /**
    * Adds detector.
    */
  def addDetector(detector: CustomDetector): I18nextBrowserLanguageDetector = js.native
  def cacheUserLanguage(lng: String, caches: js.Array[String]): Unit = js.native
  def detect(
    detectionOrder: js.UndefOr[
      js.Array[
        querystring | cookie | sessionStorage | localStorage | navigator | htmlTag | String
      ]
    ]
  ): js.UndefOr[String] = js.native
  /**
    * Initializes detector.
    */
  def init(): Unit = js.native
  def init(services: js.UndefOr[scala.Nothing], options: DetectorOptions): Unit = js.native
  def init(services: js.Any): Unit = js.native
  def init(services: js.Any, options: DetectorOptions): Unit = js.native
}

