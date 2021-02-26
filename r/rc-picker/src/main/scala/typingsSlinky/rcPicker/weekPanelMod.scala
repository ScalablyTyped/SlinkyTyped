package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weekPanelMod {
  
  @JSImport("rc-picker/es/panels/WeekPanel", JSImport.Default)
  @js.native
  def default[DateType](props: WeekPanelProps[DateType]): ReactElement = js.native
  
  type WeekPanelProps[DateType] = PanelSharedProps[DateType]
}
