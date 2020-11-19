package typingsSlinky.rmcTooltip.tooltipMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltip
  extends Component[ITooltipProps, js.Any, js.Any] {
  
  def getPopupDomNode(): js.Any = js.native
  
  def getPopupElement(): js.Array[ReactElement] = js.native
  
  def saveTrigger(node: js.Any): Unit = js.native
  
  var trigger: js.Any = js.native
}
