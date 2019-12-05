package typingsSlinky.i18nextDashExpressDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nextDashExpressDashMiddlewareMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.express.expressMod.Application
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.express.expressMod.Router
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typingsSlinky.i18next.i18nextMod.i18n

  type App = Application | Router
  type I18next = i18n
  type IgnoreRoutesFunction = js.Function4[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* options */ HandleOptions, 
    /* i18next */ I18next, 
    Boolean
  ]
  type LanguageDetectorCaches = Boolean | js.Array[String]
  type LanguageDetectorInterfaceOptions = StringDictionary[js.Any]
  type LanguageDetectorOrder = js.Array[String]
  // LanguageDetector
  type LanguageDetectorServices = js.Any
}
