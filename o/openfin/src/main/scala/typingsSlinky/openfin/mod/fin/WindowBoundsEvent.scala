package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.openfinStrings.`bounds-changed`
import typingsSlinky.openfin.openfinStrings.`bounds-changing`
import typingsSlinky.openfin.openfinStrings.`disabled-frame-bounds-changed`
import typingsSlinky.openfin.openfinStrings.`disabled-frame-bounds-changing`
import typingsSlinky.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowBoundsEvent extends WindowBaseEvent {
  /**
    * describes what kind of change occurred.
    * 0 means a change in position.
    * 1 means a change in size.
    * 2 means a change in position and size.
    */
  var changeType: Double = js.native
  /**
    * true when pending changes have been applied to the window.
    */
  var deferred: Boolean = js.native
  /**
    * the new height of the window.
    */
  var height: Double = js.native
  /**
    * the left-most coordinate of the window.
    */
  var left: Double = js.native
  /**
    * the top-most coordinate of the window.
    */
  var top: Double = js.native
  @JSName("type")
  var type_WindowBoundsEvent: `bounds-changed` | `bounds-changing` | `disabled-frame-bounds-changed` | `disabled-frame-bounds-changing` = js.native
  /**
    * the new width of the window.
    */
  var width: Double = js.native
}

object WindowBoundsEvent {
  @scala.inline
  def apply(
    changeType: Double,
    deferred: Boolean,
    height: Double,
    left: Double,
    name: String,
    top: Double,
    topic: window,
    `type`: `bounds-changed` | `bounds-changing` | `disabled-frame-bounds-changed` | `disabled-frame-bounds-changing`,
    uuid: String,
    width: Double
  ): WindowBoundsEvent = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], deferred = deferred.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowBoundsEvent]
  }
  @scala.inline
  implicit class WindowBoundsEventOps[Self <: WindowBoundsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeferred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: `bounds-changed` | `bounds-changing` | `disabled-frame-bounds-changed` | `disabled-frame-bounds-changing`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

