package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var direction: String
  var originalEvent: org.scalajs.dom.raw.Event
  var source: js.Array[_]
  var target: js.Array[_]
}

object Target {
  @scala.inline
  def apply(
    direction: String,
    originalEvent: org.scalajs.dom.raw.Event,
    source: js.Array[_],
    target: js.Array[_]
  ): Target = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

