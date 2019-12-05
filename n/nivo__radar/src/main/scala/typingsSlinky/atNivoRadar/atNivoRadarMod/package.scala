package typingsSlinky.atNivoRadar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoRadarMod {
  import slinky.core.TagMod

  type CustomDotLabel = js.Function1[/* repeated */ js.Any, TagMod[Any]]
  type CustomDotSymbol = js.Function1[/* repeated */ js.Any, TagMod[Any]]
  type CustomFormatter = js.Function1[/* repeated */ js.Any, TagMod[Any]]
  type GridLabelCustomFunction = js.Function1[/* repeated */ js.Any, String]
  type IndexByCustomFunctiono[D] = js.Function1[/* datum */ D, String | Double]
}
