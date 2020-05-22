package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var data: js.Any
  var originalEvent: org.scalajs.dom.raw.Event
  var `type`: String
}

object Type {
  @scala.inline
  def apply(data: js.Any, originalEvent: org.scalajs.dom.raw.Event, `type`: String): Type = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

