package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var event: org.scalajs.dom.raw.Event
  var source: js.Any
  var target: js.Any
}

object Source {
  @scala.inline
  def apply(event: org.scalajs.dom.raw.Event, source: js.Any, target: js.Any): Source = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

