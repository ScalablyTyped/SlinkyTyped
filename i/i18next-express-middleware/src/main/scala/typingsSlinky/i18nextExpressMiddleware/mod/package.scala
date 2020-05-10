package typingsSlinky.i18nextExpressMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type App = typingsSlinky.express.mod.Application_ | typingsSlinky.express.mod.Router
  type I18next = typingsSlinky.i18next.mod.i18n
  type IgnoreRoutesFunction = js.Function4[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    /* options */ typingsSlinky.i18nextExpressMiddleware.mod.HandleOptions, 
    /* i18next */ typingsSlinky.i18nextExpressMiddleware.mod.I18next, 
    scala.Boolean
  ]
  type LanguageDetectorCaches = scala.Boolean | js.Array[java.lang.String]
  type LanguageDetectorInterfaceOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LanguageDetectorOrder = js.Array[java.lang.String]
  // LanguageDetector
  type LanguageDetectorServices = js.Any
}
