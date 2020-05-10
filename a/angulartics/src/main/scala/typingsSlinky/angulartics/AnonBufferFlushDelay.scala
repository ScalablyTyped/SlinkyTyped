package typingsSlinky.angulartics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBufferFlushDelay extends js.Object {
  var bufferFlushDelay: Double = js.native
  var developerMode: Boolean = js.native
  var optOut: Boolean = js.native
  var pageTracking: AnonAutoBasePath = js.native
  var trackExceptions: Boolean = js.native
}

object AnonBufferFlushDelay {
  @scala.inline
  def apply(
    bufferFlushDelay: Double,
    developerMode: Boolean,
    optOut: Boolean,
    pageTracking: AnonAutoBasePath,
    trackExceptions: Boolean
  ): AnonBufferFlushDelay = {
    val __obj = js.Dynamic.literal(bufferFlushDelay = bufferFlushDelay.asInstanceOf[js.Any], developerMode = developerMode.asInstanceOf[js.Any], optOut = optOut.asInstanceOf[js.Any], pageTracking = pageTracking.asInstanceOf[js.Any], trackExceptions = trackExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferFlushDelay]
  }
  @scala.inline
  implicit class AnonBufferFlushDelayOps[Self <: AnonBufferFlushDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferFlushDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferFlushDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeveloperMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageTracking(value: AnonAutoBasePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackExceptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

