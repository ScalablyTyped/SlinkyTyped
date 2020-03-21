package typingsSlinky.nivoRadar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomDotLabel = js.Function1[/* repeated */ js.Any, slinky.core.TagMod[scala.Any]]
  type CustomDotSymbol = js.Function1[/* repeated */ js.Any, slinky.core.TagMod[scala.Any]]
  type CustomFormatter = js.Function1[/* repeated */ js.Any, slinky.core.TagMod[scala.Any]]
  type GridLabelCustomFunction = js.Function1[/* repeated */ js.Any, java.lang.String]
  type IndexByCustomFunctiono[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type RadarProps = typingsSlinky.nivoRadar.mod.CommonRadarProps[_] with typingsSlinky.nivoCore.mod.MotionProps
}
