package typingsSlinky.rcPicker

import typingsSlinky.rcPicker.useValueTextsMod.ValueTextConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useHoverValueMod {
  
  @JSImport("rc-picker/es/hooks/useHoverValue", JSImport.Default)
  @js.native
  def default[DateType](valueText: String, hasFormatListGenerateConfigLocale: ValueTextConfig[DateType]): js.Tuple3[
    String, 
    js.Function1[/* date */ DateType, Unit], 
    js.Function1[/* immediately */ js.UndefOr[Boolean], Unit]
  ] = js.native
}
