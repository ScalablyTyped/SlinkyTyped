package typingsSlinky.nivoTooltip.contextMod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoTooltip.typesMod.TooltipAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipActionsContextData extends js.Object {
  
  def hideTooltip(): Unit = js.native
  
  def showTooltipAt(content: ReactElement, position: js.Tuple2[Double, Double]): Unit = js.native
  def showTooltipAt(content: ReactElement, position: js.Tuple2[Double, Double], anchor: TooltipAnchor): Unit = js.native
  
  def showTooltipFromEvent(content: ReactElement, event: SyntheticMouseEvent[Element]): Unit = js.native
}
