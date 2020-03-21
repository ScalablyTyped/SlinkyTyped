package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import typingsSlinky.rcPicker.rcPickerNumbers.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/panels/DecadePanel", JSImport.Namespace)
@js.native
object decadePanelMod extends js.Object {
  val DECADE_DISTANCE_COUNT: Double = js.native
  val DECADE_UNIT_DIFF: `10` = js.native
  def default[DateType](props: DecadePanelProps[DateType]): ReactElement = js.native
  type DecadePanelProps[DateType] = PanelSharedProps[DateType]
}

