package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import typingsSlinky.rcPicker.monthBodyMod.MonthCellRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/panels/MonthPanel", JSImport.Namespace)
@js.native
object monthPanelMod extends js.Object {
  @js.native
  trait MonthPanelProps[DateType] extends PanelSharedProps[DateType] {
    var monthCellContentRender: js.UndefOr[MonthCellRender[DateType]] = js.native
  }
  
  def default[DateType](props: MonthPanelProps[DateType]): ReactElement = js.native
}

