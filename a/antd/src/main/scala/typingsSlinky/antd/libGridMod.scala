package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.antd.gridRowMod.RowProps
import typingsSlinky.antd.responsiveObserveMod.ScreenMap
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/grid", JSImport.Namespace)
@js.native
object libGridMod extends js.Object {
  val Col: ForwardRefExoticComponent[ColProps with RefAttributes[HTMLDivElement]] = js.native
  val Row: ForwardRefExoticComponent[RowProps with RefAttributes[HTMLDivElement]] = js.native
  @js.native
  object default extends js.Object {
    var useBreakpoint: js.Function0[ScreenMap] = js.native
  }
  
}

