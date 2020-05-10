package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeletextSourceSettings extends js.Object {
  /**
    * Use Page Number (PageNumber) to specify the three-digit hexadecimal page number that will be used for Teletext captions. Do not use this setting if you are passing through teletext from the input source to output.
    */
  var PageNumber: js.UndefOr[stringMin3Max3Pattern1809aFAF09aEAE] = js.native
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
    def withPageNumber(value: stringMin3Max3Pattern1809aFAF09aEAE): Self = {
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

