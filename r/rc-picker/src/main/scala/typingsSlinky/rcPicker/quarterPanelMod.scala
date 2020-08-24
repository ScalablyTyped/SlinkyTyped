package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/es/panels/QuarterPanel", JSImport.Namespace)
@js.native
object quarterPanelMod extends js.Object {
  def default[DateType](props: QuarterPanelProps[DateType]): ReactElement = js.native
  type QuarterPanelProps[DateType] = PanelSharedProps[DateType]
}

