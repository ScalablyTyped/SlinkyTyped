package typingsSlinky.baseui.dndDashListMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var items: js.Array[TagMod[Any]]
}

object State {
  @scala.inline
  def apply(items: js.Array[TagMod[Any]]): State = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

