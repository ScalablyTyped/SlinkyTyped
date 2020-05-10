package typingsSlinky.d3Selection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEventParameters extends js.Object {
  /**
    * If true, the event is dispatched to ancestors in reverse tree order
    */
  var bubbles: Boolean = js.native
  /**
    * If true, event.preventDefault is allowed
    */
  var cancelable: Boolean = js.native
  /**
    * Any custom data associated with the event
    */
  var detail: js.Any = js.native
}

object CustomEventParameters {
  @scala.inline
  def apply(bubbles: Boolean, cancelable: Boolean, detail: js.Any): CustomEventParameters = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEventParameters]
  }
  @scala.inline
  implicit class CustomEventParametersOps[Self <: CustomEventParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

