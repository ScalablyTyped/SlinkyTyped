package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPlacement extends js.Object {
  /**
    * The audio fallback URL.
    */
  var AudioFallbackUrl: js.UndefOr[UriType] = js.native
  /**
    * The audio host URL.
    */
  var AudioHostUrl: js.UndefOr[UriType] = js.native
  /**
    * The screen data URL.
    */
  var ScreenDataUrl: js.UndefOr[UriType] = js.native
  /**
    * The screen sharing URL.
    */
  var ScreenSharingUrl: js.UndefOr[UriType] = js.native
  /**
    * The screen viewing URL.
    */
  var ScreenViewingUrl: js.UndefOr[UriType] = js.native
  /**
    * The signaling URL.
    */
  var SignalingUrl: js.UndefOr[UriType] = js.native
  /**
    * The turn control URL.
    */
  var TurnControlUrl: js.UndefOr[UriType] = js.native
}

object MediaPlacement {
  @scala.inline
  def apply(): MediaPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlacement]
  }
  @scala.inline
  implicit class MediaPlacementOps[Self <: MediaPlacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioFallbackUrl(value: UriType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioFallbackUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioFallbackUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioFallbackUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioHostUrl(value: UriType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioHostUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioHostUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioHostUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenDataUrl(value: UriType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScreenDataUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenDataUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScreenDataUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenSharingUrl(value: UriType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScreenSharingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenSharingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScreenSharingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenViewingUrl(value: UriType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScreenViewingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenViewingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScreenViewingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalingUrl(value: UriType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTurnControlUrl(value: UriType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TurnControlUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTurnControlUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TurnControlUrl")(js.undefined)
        ret
    }
  }
  
}

