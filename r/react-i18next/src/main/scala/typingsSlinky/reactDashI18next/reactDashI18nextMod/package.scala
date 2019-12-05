package typingsSlinky.reactDashI18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashI18nextMod {
  import typingsSlinky.i18next.i18nextMod.TFunction
  import typingsSlinky.i18next.i18nextMod.i18n
  import typingsSlinky.reactDashI18next.Anon_I18n
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type Namespace = String | js.Array[String]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type UseTranslationResponse = (js.Tuple3[TFunction, i18n, Boolean]) with Anon_I18n
}
