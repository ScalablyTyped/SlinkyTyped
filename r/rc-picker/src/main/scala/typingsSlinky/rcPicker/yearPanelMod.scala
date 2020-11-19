package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/panels/YearPanel", JSImport.Namespace)
@js.native
object yearPanelMod extends js.Object {
  
  val YEAR_DECADE_COUNT: /* 10 */ Double = js.native
  
  def default[DateType](props: YearPanelProps[DateType]): ReactElement = js.native
  
  @js.native
  trait YearPanelProps[DateType] extends PanelSharedProps[DateType] {
    
    var sourceMode: PanelMode = js.native
  }
}
