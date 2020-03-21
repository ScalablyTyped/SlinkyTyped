package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRenderCell extends js.Object {
  var renderedWindowsAhead: Double
  var renderedWindowsBehind: Double
  var startIndex: Double
  def onRenderCell(item: js.Any, index: Double, containsFocus: Boolean): ReactElement
}

object AnonOnRenderCell {
  @scala.inline
  def apply(
    onRenderCell: (js.Any, Double, Boolean) => ReactElement,
    renderedWindowsAhead: Double,
    renderedWindowsBehind: Double,
    startIndex: Double
  ): AnonOnRenderCell = {
    val __obj = js.Dynamic.literal(onRenderCell = js.Any.fromFunction3(onRenderCell), renderedWindowsAhead = renderedWindowsAhead.asInstanceOf[js.Any], renderedWindowsBehind = renderedWindowsBehind.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnRenderCell]
  }
}

