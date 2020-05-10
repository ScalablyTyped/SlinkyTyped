package typingsSlinky.fingerprintjs2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetectScreenOrientation extends js.Object {
  /**
    * To ensure consistent fingerprints when users rotate their mobile devices
    */
  var detectScreenOrientation: Boolean = js.native
}

object AnonDetectScreenOrientation {
  @scala.inline
  def apply(detectScreenOrientation: Boolean): AnonDetectScreenOrientation = {
    val __obj = js.Dynamic.literal(detectScreenOrientation = detectScreenOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetectScreenOrientation]
  }
  @scala.inline
  implicit class AnonDetectScreenOrientationOps[Self <: AnonDetectScreenOrientation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectScreenOrientation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectScreenOrientation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

