package typingsSlinky.reactI18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Namespace = java.lang.String | js.Array[java.lang.String]
  
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type UseTranslationResponse = (js.Tuple3[typingsSlinky.i18next.mod.TFunction, typingsSlinky.i18next.mod.i18n, scala.Boolean]) with typingsSlinky.reactI18next.anon.I18n
}
