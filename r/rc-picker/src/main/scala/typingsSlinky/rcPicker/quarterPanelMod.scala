package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quarterPanelMod {
  
  @JSImport("rc-picker/es/panels/QuarterPanel", JSImport.Default)
  @js.native
  def default[DateType](props: QuarterPanelProps[DateType]): ReactElement = js.native
  
  type QuarterPanelProps[DateType] = PanelSharedProps[DateType]
}
