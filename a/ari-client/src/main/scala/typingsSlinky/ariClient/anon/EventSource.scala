package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSource extends js.Object {
  var applicationName: String = js.native
  var eventSource: String | js.Array[String] = js.native
}

object EventSource {
  @scala.inline
  def apply(applicationName: String, eventSource: String | js.Array[String]): EventSource = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSource]
  }
  @scala.inline
  implicit class EventSourceOps[Self <: EventSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSource(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

