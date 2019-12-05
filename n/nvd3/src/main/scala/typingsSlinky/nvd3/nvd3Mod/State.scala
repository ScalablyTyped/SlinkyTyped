package typingsSlinky.nvd3.nvd3Mod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.d3DashDispatch.d3DashDispatchMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var dispatch: Dispatch[EventTarget]
}

object State {
  @scala.inline
  def apply(dispatch: Dispatch[EventTarget]): State = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

