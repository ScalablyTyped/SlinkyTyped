package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeletextSourceSettings extends js.Object {
  /**
    * Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100 (256) to 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x" prefix.
    */
  var PageNumber: js.UndefOr[string] = js.native
}

object TeletextSourceSettings {
  @scala.inline
  def apply(): TeletextSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeletextSourceSettings]
  }
  @scala.inline
  implicit class TeletextSourceSettingsOps[Self <: TeletextSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageNumber(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageNumber")(js.undefined)
        ret
    }
  }
  
}

