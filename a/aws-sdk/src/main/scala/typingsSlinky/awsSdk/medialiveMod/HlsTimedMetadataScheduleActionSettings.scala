package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsTimedMetadataScheduleActionSettings extends js.Object {
  /**
    * Base64 string formatted according to the ID3 specification: http://id3.org/id3v2.4.0-structure
    */
  var Id3: string = js.native
}

object HlsTimedMetadataScheduleActionSettings {
  @scala.inline
  def apply(Id3: string): HlsTimedMetadataScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Id3 = Id3.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsTimedMetadataScheduleActionSettings]
  }
  @scala.inline
  implicit class HlsTimedMetadataScheduleActionSettingsOps[Self <: HlsTimedMetadataScheduleActionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId3(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id3")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

