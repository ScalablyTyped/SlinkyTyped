package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsSettings extends js.Object {
  var AudioOnlyHlsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AudioOnlyHlsSettings] = js.native
  var Fmp4HlsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Fmp4HlsSettings] = js.native
  var StandardHlsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.StandardHlsSettings] = js.native
}

object HlsSettings {
  @scala.inline
  def apply(
    AudioOnlyHlsSettings: AudioOnlyHlsSettings = null,
    Fmp4HlsSettings: Fmp4HlsSettings = null,
    StandardHlsSettings: StandardHlsSettings = null
  ): HlsSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioOnlyHlsSettings != null) __obj.updateDynamic("AudioOnlyHlsSettings")(AudioOnlyHlsSettings.asInstanceOf[js.Any])
    if (Fmp4HlsSettings != null) __obj.updateDynamic("Fmp4HlsSettings")(Fmp4HlsSettings.asInstanceOf[js.Any])
    if (StandardHlsSettings != null) __obj.updateDynamic("StandardHlsSettings")(StandardHlsSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsSettings]
  }
}

