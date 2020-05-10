package typingsSlinky.node.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitterOptions extends js.Object {
  /**
    * Enables automatic capturing of promise rejection.
    */
  var captureRejections: js.UndefOr[Boolean] = js.native
}

object EventEmitterOptions {
  @scala.inline
  def apply(): EventEmitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventEmitterOptions]
  }
  @scala.inline
  implicit class EventEmitterOptionsOps[Self <: EventEmitterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureRejections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureRejections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureRejections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureRejections")(js.undefined)
        ret
    }
  }
  
}

