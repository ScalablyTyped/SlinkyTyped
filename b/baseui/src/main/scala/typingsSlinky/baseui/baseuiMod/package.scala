package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object baseuiMod {
  import typingsSlinky.styletronDashStandard.styletronDashStandardMod.StyleObject

  type UseStyletronFn[Theme] = js.Function0[js.Tuple2[js.Function1[/* arg */ StyleObject, String], Theme]]
}
