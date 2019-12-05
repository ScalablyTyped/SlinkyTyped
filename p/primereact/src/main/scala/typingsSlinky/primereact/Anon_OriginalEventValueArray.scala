package typingsSlinky.primereact

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalEventValueArray extends js.Object {
  var originalEvent: Event
  var value: js.Date | js.Array[js.Date]
}

object Anon_OriginalEventValueArray {
  @scala.inline
  def apply(originalEvent: Event, value: js.Date | js.Array[js.Date]): Anon_OriginalEventValueArray = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OriginalEventValueArray]
  }
}

