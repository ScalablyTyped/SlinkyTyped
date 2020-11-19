package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/wia-aria/usePreviousFocus", JSImport.Namespace)
@js.native
object usePreviousFocusMod extends js.Object {
  
  def default(disabled: Boolean): Unit = js.native
  def default(disabled: Boolean, fallback: js.UndefOr[FocusFallback], previousElement: HTMLElement): Unit = js.native
  def default(disabled: Boolean, fallback: FocusFallback): Unit = js.native
  
  type FocusFallback = js.UndefOr[String | HTMLElement | (js.Function0[HTMLElement | Null]) | Null]
}
