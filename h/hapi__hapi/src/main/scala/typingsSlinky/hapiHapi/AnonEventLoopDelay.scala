package typingsSlinky.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEventLoopDelay extends js.Object {
  /**
    * event loop delay milliseconds.
    */
  var eventLoopDelay: Double = js.native
  /**
    * V8 heap usage.
    */
  var heapUsed: Double = js.native
  /**
    * RSS memory usage.
    */
  var rss: Double = js.native
}

object AnonEventLoopDelay {
  @scala.inline
  def apply(eventLoopDelay: Double, heapUsed: Double, rss: Double): AnonEventLoopDelay = {
    val __obj = js.Dynamic.literal(eventLoopDelay = eventLoopDelay.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventLoopDelay]
  }
  @scala.inline
  implicit class AnonEventLoopDelayOps[Self <: AnonEventLoopDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventLoopDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLoopDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeapUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rss")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

