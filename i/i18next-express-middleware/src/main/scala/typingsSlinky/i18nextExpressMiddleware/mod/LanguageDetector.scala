package typingsSlinky.i18nextExpressMiddleware.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.i18next.mod.Module
import typingsSlinky.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.languageDetector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("i18next-express-middleware", "LanguageDetector")
@js.native
class LanguageDetector () extends Module {
  def this(options: LanguageDetectorOptions) = this()
  def this(services: LanguageDetectorServices) = this()
  def this(options: js.UndefOr[scala.Nothing], allOptions: LanguageDetectorAllOptions) = this()
  def this(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions) = this()
  def this(services: LanguageDetectorServices, options: LanguageDetectorOptions) = this()
  def this(
    services: LanguageDetectorServices,
    options: js.UndefOr[scala.Nothing],
    allOptions: LanguageDetectorAllOptions
  ) = this()
  def this(
    services: LanguageDetectorServices,
    options: LanguageDetectorOptions,
    allOptions: LanguageDetectorAllOptions
  ) = this()
  
  def addDetector(detector: LanguageDetectorInterface): Unit = js.native
  
  def cacheUserLanguage(
    req: Request_[ParamsDictionary, _, _, Query],
    res: Response_[_],
    lng: String,
    caches: LanguageDetectorCaches
  ): Unit = js.native
  
  def detect(
    req: Request_[ParamsDictionary, _, _, Query],
    res: Response_[_],
    detectionOrder: LanguageDetectorOrder
  ): Unit = js.native
  
  def init(): Unit = js.native
  def init(options: js.UndefOr[scala.Nothing], allOptions: LanguageDetectorAllOptions): Unit = js.native
  def init(options: LanguageDetectorOptions): Unit = js.native
  def init(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions): Unit = js.native
  def init(services: LanguageDetectorServices): Unit = js.native
  def init(
    services: LanguageDetectorServices,
    options: js.UndefOr[scala.Nothing],
    allOptions: LanguageDetectorAllOptions
  ): Unit = js.native
  def init(services: LanguageDetectorServices, options: LanguageDetectorOptions): Unit = js.native
  def init(
    services: LanguageDetectorServices,
    options: LanguageDetectorOptions,
    allOptions: LanguageDetectorAllOptions
  ): Unit = js.native
  
  @JSName("type")
  var type_LanguageDetector: languageDetector = js.native
}
