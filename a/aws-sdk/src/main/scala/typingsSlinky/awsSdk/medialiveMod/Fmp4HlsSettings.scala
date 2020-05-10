package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fmp4HlsSettings extends js.Object {
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[string] = js.native
}

object Fmp4HlsSettings {
  @scala.inline
  def apply(): Fmp4HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fmp4HlsSettings]
  }
  @scala.inline
  implicit class Fmp4HlsSettingsOps[Self <: Fmp4HlsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioRenditionSets(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioRenditionSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioRenditionSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioRenditionSets")(js.undefined)
        ret
    }
  }
  
}

