package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hdr10Settings extends js.Object {
  /**
    * Maximum Content Light Level
  An integer metadata value defining the maximum light level, in nits,
  of any single pixel within an encoded HDR video stream or file.
    */
  var MaxCll: js.UndefOr[integerMin0Max32768] = js.native
  /**
    * Maximum Frame Average Light Level
  An integer metadata value defining the maximum average light level, in nits,
  for any single frame within an encoded HDR video stream or file.
    */
  var MaxFall: js.UndefOr[integerMin0Max32768] = js.native
}

object Hdr10Settings {
  @scala.inline
  def apply(): Hdr10Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hdr10Settings]
  }
  @scala.inline
  implicit class Hdr10SettingsOps[Self <: Hdr10Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxCll(value: integerMin0Max32768): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCll")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFall(value: integerMin0Max32768): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFall")(js.undefined)
        ret
    }
  }
  
}

