package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var item: this.type
  var originalEvent: org.scalajs.dom.raw.Event
}

object Item {
  @scala.inline
  def apply(item: Item, originalEvent: org.scalajs.dom.raw.Event): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

