package typingsSlinky.fingerprintjs2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExcludeIOS11 extends js.Object {
  /**
    * On iOS 11, audio context can only be used in response to user interaction.
    * We require users to explicitly enable audio fingerprinting on iOS 11.
    * See https://stackoverflow.com/questions/46363048/onaudioprocess-not-called-on-ios11#46534088
    */
  var excludeIOS11: Boolean = js.native
  var timeout: Double = js.native
}

object AnonExcludeIOS11 {
  @scala.inline
  def apply(excludeIOS11: Boolean, timeout: Double): AnonExcludeIOS11 = {
    val __obj = js.Dynamic.literal(excludeIOS11 = excludeIOS11.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeIOS11]
  }
  @scala.inline
  implicit class AnonExcludeIOS11Ops[Self <: AnonExcludeIOS11] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeIOS11(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeIOS11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

