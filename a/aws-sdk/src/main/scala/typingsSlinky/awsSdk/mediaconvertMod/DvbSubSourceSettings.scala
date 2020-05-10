package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbSubSourceSettings extends js.Object {
  /**
    * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed through, regardless of selectors.
    */
  var Pid: js.UndefOr[integerMin1Max2147483647] = js.native
}

object DvbSubSourceSettings {
  @scala.inline
  def apply(): DvbSubSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbSubSourceSettings]
  }
  @scala.inline
  implicit class DvbSubSourceSettingsOps[Self <: DvbSubSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPid(value: integerMin1Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pid")(js.undefined)
        ret
    }
  }
  
}

