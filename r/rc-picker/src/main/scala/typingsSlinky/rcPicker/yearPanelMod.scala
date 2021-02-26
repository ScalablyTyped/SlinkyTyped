package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.interfaceMod.PanelSharedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yearPanelMod {
  
  @JSImport("rc-picker/es/panels/YearPanel", JSImport.Default)
  @js.native
  def default[DateType](props: YearPanelProps[DateType]): ReactElement = js.native
  
  @JSImport("rc-picker/es/panels/YearPanel", "YEAR_DECADE_COUNT")
  @js.native
  val YEAR_DECADE_COUNT: /* 10 */ Double = js.native
  
  @js.native
  trait YearPanelProps[DateType] extends PanelSharedProps[DateType] {
    
    var sourceMode: PanelMode = js.native
  }
}
