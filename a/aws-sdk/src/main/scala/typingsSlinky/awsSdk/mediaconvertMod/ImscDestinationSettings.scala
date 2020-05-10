package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImscDestinationSettings extends js.Object {
  /**
    * Keep this setting enabled to have MediaConvert use the font style and position information from the captions source in the output. This option is available only when your input captions are CFF-TT, IMSC, SMPTE-TT, or TTML. Disable this setting for simplified output captions.
    */
  var StylePassthrough: js.UndefOr[ImscStylePassthrough] = js.native
}

object ImscDestinationSettings {
  @scala.inline
  def apply(): ImscDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImscDestinationSettings]
  }
  @scala.inline
  implicit class ImscDestinationSettingsOps[Self <: ImscDestinationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStylePassthrough(value: ImscStylePassthrough): Self = {
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

