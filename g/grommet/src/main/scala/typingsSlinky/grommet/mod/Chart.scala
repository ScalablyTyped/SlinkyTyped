package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.chartMod.ChartProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "Chart")
@js.native
class Chart protected ()
  extends Component[ChartProps, js.Object, js.Any] {
  def this(props: ChartProps) = this()
  def this(props: ChartProps, context: js.Any) = this()
}

@JSImport("grommet/es6", "Chart")
@js.native
object Chart extends TopLevel[ReactComponentClass[ChartProps]]

