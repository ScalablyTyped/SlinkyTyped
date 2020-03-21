package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Strings.bottom
import typingsSlinky.antvG2.antvG2Strings.left
import typingsSlinky.antvG2.antvG2Strings.right
import typingsSlinky.antvG2.antvG2Strings.top
import typingsSlinky.antvG2.mod.Styles.tickLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/g2", "ChartAxisConfig")
@js.native
class ChartAxisConfig () extends js.Object {
  var grid: js.UndefOr[AxisGrid | Null] = js.native
  var label: js.UndefOr[AxisLabel] = js.native
  var line: js.UndefOr[typingsSlinky.antvG2.mod.Styles.line] = js.native
  var position: js.UndefOr[top | bottom | left | right] = js.native
  var subTickCount: js.UndefOr[Double] = js.native
  var subTickLine: js.UndefOr[tickLine | Null] = js.native
  var tickLine: js.UndefOr[typingsSlinky.antvG2.mod.Styles.tickLine | Null] = js.native
  var title: js.UndefOr[AxisTitle] = js.native
}

