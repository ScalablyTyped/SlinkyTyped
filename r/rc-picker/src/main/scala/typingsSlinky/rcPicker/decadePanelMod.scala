package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/panels/DecadePanel", JSImport.Namespace)
@js.native
object decadePanelMod extends js.Object {
  
  val DECADE_DISTANCE_COUNT: Double = js.native
  
  val DECADE_UNIT_DIFF: /* 10 */ Double = js.native
  
  def default[DateType](props: DecadePanelProps[DateType]): ReactElement = js.native
  
  type DecadePanelProps[DateType] = PanelSharedProps[DateType]
}
