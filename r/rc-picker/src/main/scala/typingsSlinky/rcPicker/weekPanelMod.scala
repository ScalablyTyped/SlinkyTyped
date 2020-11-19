package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/panels/WeekPanel", JSImport.Namespace)
@js.native
object weekPanelMod extends js.Object {
  
  def default[DateType](props: WeekPanelProps[DateType]): ReactElement = js.native
  
  type WeekPanelProps[DateType] = PanelSharedProps[DateType]
}
