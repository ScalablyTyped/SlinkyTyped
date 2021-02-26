package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import typingsSlinky.rcPicker.monthBodyMod.MonthCellRender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monthPanelMod {
  
  @JSImport("rc-picker/es/panels/MonthPanel", JSImport.Default)
  @js.native
  def default[DateType](props: MonthPanelProps[DateType]): ReactElement = js.native
  
  @js.native
  trait MonthPanelProps[DateType] extends PanelSharedProps[DateType] {
    
    var monthCellContentRender: js.UndefOr[MonthCellRender[DateType]] = js.native
  }
}
