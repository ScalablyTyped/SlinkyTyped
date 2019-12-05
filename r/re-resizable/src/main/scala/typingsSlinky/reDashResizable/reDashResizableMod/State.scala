package typingsSlinky.reDashResizable.reDashResizableMod

import typingsSlinky.reDashResizable.Anon_HeightWidthX
import typingsSlinky.reDashResizable.libResizerMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var direction: Direction
  var height: Double | String
  var isResizing: Boolean
  var original: Anon_HeightWidthX
  var resizeCursor: String
  var width: Double | String
}

object State {
  @scala.inline
  def apply(
    direction: Direction,
    height: Double | String,
    isResizing: Boolean,
    original: Anon_HeightWidthX,
    resizeCursor: String,
    width: Double | String
  ): State = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], resizeCursor = resizeCursor.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

