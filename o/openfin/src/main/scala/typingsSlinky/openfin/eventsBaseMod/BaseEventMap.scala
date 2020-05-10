package typingsSlinky.openfin.eventsBaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseEventMap
  extends /* name */ StringDictionary[js.Any] {
  var listenerRemoved: String = js.native
  var newListener: String = js.native
}

object BaseEventMap {
  @scala.inline
  def apply(listenerRemoved: String, newListener: String): BaseEventMap = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEventMap]
  }
  @scala.inline
  implicit class BaseEventMapOps[Self <: BaseEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListenerRemoved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewListener(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newListener")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

