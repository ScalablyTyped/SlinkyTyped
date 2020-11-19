package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.dateBodyMod.DateRender
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import typingsSlinky.rcPicker.uiUtilMod.KeyboardConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/panels/DatePanel", JSImport.Namespace)
@js.native
object datePanelMod extends js.Object {
  
  def default[DateType](props: DatePanelProps[DateType]): ReactElement = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rcPicker.dateBodyMod.DateBodyPassProps because var conflicts: disabledDate. Inlined dateRender, prefixColumn, rowClassName */ @js.native
  trait DatePanelProps[DateType] extends PanelSharedProps[DateType] {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.native
    
    var keyboardConfig: js.UndefOr[KeyboardConfig] = js.native
    
    var panelName: js.UndefOr[String] = js.native
    
    var prefixColumn: js.UndefOr[js.Function1[DateType, ReactElement]] = js.native
    
    var rowClassName: js.UndefOr[js.Function1[DateType, String]] = js.native
  }
}
