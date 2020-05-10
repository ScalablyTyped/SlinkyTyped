package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLivebroadcastsControl extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The displaySlate parameter specifies whether the slate is being enabled
    * or disabled.
    */
  var displaySlate: js.UndefOr[Boolean] = js.native
  /**
    * The id parameter specifies the YouTube live broadcast ID that uniquely
    * identifies the broadcast in which the slate is being updated.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The offsetTimeMs parameter specifies a positive time offset when the
    * specified slate change will occur. The value is measured in milliseconds
    * from the beginning of the broadcast's monitor stream, which is the time
    * that the testing phase for the broadcast began. Even though it is
    * specified in milliseconds, the value is actually an approximation, and
    * YouTube completes the requested action as closely as possible to that
    * time.  If you do not specify a value for this parameter, then YouTube
    * performs the action as soon as possible. See the Getting started guide
    * for more details.  Important: You should only specify a value for this
    * parameter if your broadcast stream is delayed.
    */
  var offsetTimeMs: js.UndefOr[String] = js.native
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  The onBehalfOfContentOwner parameter indicates that the
    * request's authorization credentials identify a YouTube CMS user who is
    * acting on behalf of the content owner specified in the parameter value.
    * This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to
    * authenticate once and get access to all their video and channel data,
    * without having to provide authentication credentials for each individual
    * channel. The CMS account that the user authenticates with must be linked
    * to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  /**
    * This parameter can only be used in a properly authorized request. Note:
    * This parameter is intended exclusively for YouTube content partners.  The
    * onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID
    * of the channel to which a video is being added. This parameter is
    * required when a request specifies a value for the onBehalfOfContentOwner
    * parameter, and it can only be used in conjunction with that parameter. In
    * addition, the request must be authorized using a CMS account that is
    * linked to the content owner that the onBehalfOfContentOwner parameter
    * specifies. Finally, the channel that the onBehalfOfContentOwnerChannel
    * parameter value specifies must be linked to the content owner that the
    * onBehalfOfContentOwner parameter specifies.  This parameter is intended
    * for YouTube content partners that own and manage many different YouTube
    * channels. It allows content owners to authenticate once and perform
    * actions on behalf of the channel specified in the parameter value,
    * without having to provide authentication credentials for each separate
    * channel.
    */
  var onBehalfOfContentOwnerChannel: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies a comma-separated list of one or more
    * liveBroadcast resource properties that the API response will include. The
    * part names that you can include in the parameter value are id, snippet,
    * contentDetails, and status.
    */
  var part: js.UndefOr[String] = js.native
  /**
    * The walltime parameter specifies the wall clock time at which the
    * specified slate change will occur. The value is specified in ISO 8601
    * (YYYY-MM-DDThh:mm:ss.sssZ) format.
    */
  var walltime: js.UndefOr[String] = js.native
}

object ParamsResourceLivebroadcastsControl {
  @scala.inline
  def apply(): ParamsResourceLivebroadcastsControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLivebroadcastsControl]
  }
  @scala.inline
  implicit class ParamsResourceLivebroadcastsControlOps[Self <: ParamsResourceLivebroadcastsControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplaySlate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySlate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplaySlate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaySlate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBehalfOfContentOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfContentOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBehalfOfContentOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfContentOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBehalfOfContentOwnerChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfContentOwnerChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBehalfOfContentOwnerChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfContentOwnerChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withPart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(js.undefined)
        ret
    }
    @scala.inline
    def withWalltime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walltime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWalltime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walltime")(js.undefined)
        ret
    }
  }
  
}

