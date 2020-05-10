package typingsSlinky.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadlessTaskEvent extends js.Object {
  /** Name of the event [ "location", "stationary", "activity" ] */
  var name: HeadlessTaskEventName = js.native
  /** Event parameters. */
  var params: js.Any = js.native
}

object HeadlessTaskEvent {
  @scala.inline
  def apply(name: HeadlessTaskEventName, params: js.Any): HeadlessTaskEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadlessTaskEvent]
  }
  @scala.inline
  implicit class HeadlessTaskEventOps[Self <: HeadlessTaskEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: HeadlessTaskEventName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

