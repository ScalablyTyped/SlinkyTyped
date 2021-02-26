package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.pickerPanelMod.PickerPanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-picker", JSImport.Default)
  @js.native
  class default[DateType] ()
    extends typingsSlinky.rcPicker.pickerMod.default[DateType]
  
  @JSImport("rc-picker", "PickerPanel")
  @js.native
  def PickerPanel[DateType](props: PickerPanelProps[DateType]): ReactElement = js.native
  
  @JSImport("rc-picker", "RangePicker")
  @js.native
  class RangePicker[DateType] ()
    extends typingsSlinky.rcPicker.rangePickerMod.default[DateType]
}
