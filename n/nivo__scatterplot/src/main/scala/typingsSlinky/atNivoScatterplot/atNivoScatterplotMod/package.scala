package typingsSlinky.atNivoScatterplot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoScatterplotMod {
  import org.scalajs.dom.raw.CanvasRenderingContext2D
  import slinky.core.TagMod
  import slinky.web.SyntheticMouseEvent

  type CustomCanvasLayer = js.Function2[/* ctx */ CanvasRenderingContext2D, /* props */ CustomCanvasLayerProps, Unit]
  type CustomSvgLayer = js.Function1[/* props */ CustomSvgLayerProps, TagMod[Any]]
  type CustomTooltip = js.Function1[/* hasNode */ js.Any, TagMod[Any]]
  type DerivedDatumProp[T] = js.Function1[/* node */ Datum, T]
  type DerivedNodeProp[T] = js.Function1[/* node */ Node, T]
  type MouseHandler = js.Function2[/* node */ Node, /* event */ SyntheticMouseEvent[js.Any], Unit]
  type NodeCanvasComponent = js.Function2[/* ctx */ CanvasRenderingContext2D, /* props */ NodeProps, Unit]
  type NodeComponent = js.Function1[/* props */ NodeProps, TagMod[Any]]
  type Scale = js.Function1[/* value */ Value, Double]
  type Value = Double | String | js.Date
  type ValueFormatter = js.Function1[/* value */ Value, String | Double]
}
