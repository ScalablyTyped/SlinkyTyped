package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TtmlDestinationSettings extends js.Object {
  /**
    * Pass through style and position information from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
    */
  var StylePassthrough: js.UndefOr[TtmlStylePassthrough] = js.native
}

object TtmlDestinationSettings {
  @scala.inline
  def apply(): TtmlDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TtmlDestinationSettings]
  }
  @scala.inline
  implicit class TtmlDestinationSettingsOps[Self <: TtmlDestinationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStylePassthrough(value: TtmlStylePassthrough): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StylePassthrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylePassthrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StylePassthrough")(js.undefined)
        ret
    }
  }
  
}

