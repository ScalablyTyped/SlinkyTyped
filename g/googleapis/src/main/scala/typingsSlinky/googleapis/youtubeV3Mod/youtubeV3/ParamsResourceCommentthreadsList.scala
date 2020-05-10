package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCommentthreadsList extends StandardParameters {
  /**
    * The allThreadsRelatedToChannelId parameter instructs the API to return
    * all comment threads associated with the specified channel. The response
    * can include comments about the channel or about the channel's videos.
    */
  var allThreadsRelatedToChannelId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The channelId parameter instructs the API to return comment threads
    * containing comments about the specified channel. (The response will not
    * include comments left on videos that the channel uploaded.)
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The id parameter specifies a comma-separated list of comment thread IDs
    * for the resources that should be retrieved.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The maxResults parameter specifies the maximum number of items that
    * should be returned in the result set.  Note: This parameter is not
    * supported for use in conjunction with the id parameter.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Set this parameter to limit the returned comment threads to a particular
    * moderation state.  Note: This parameter is not supported for use in
    * conjunction with the id parameter.
    */
  var moderationStatus: js.UndefOr[String] = js.native
  /**
    * The order parameter specifies the order in which the API response should
    * list comment threads. Valid values are:  - time - Comment threads are
    * ordered by time. This is the default behavior. - relevance - Comment
    * threads are ordered by relevance.Note: This parameter is not supported
    * for use in conjunction with the id parameter.
    */
  var order: js.UndefOr[String] = js.native
  /**
    * The pageToken parameter identifies a specific page in the result set that
    * should be returned. In an API response, the nextPageToken property
    * identifies the next page of the result that can be retrieved.  Note: This
    * parameter is not supported for use in conjunction with the id parameter.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies a comma-separated list of one or more
    * commentThread resource properties that the API response will include.
    */
  var part: js.UndefOr[String] = js.native
  /**
    * The searchTerms parameter instructs the API to limit the API response to
    * only contain comments that contain the specified search terms.  Note:
    * This parameter is not supported for use in conjunction with the id
    * parameter.
    */
  var searchTerms: js.UndefOr[String] = js.native
  /**
    * Set this parameter's value to html or plainText to instruct the API to
    * return the comments left by users in html formatted or in plain text.
    */
  var textFormat: js.UndefOr[String] = js.native
  /**
    * The videoId parameter instructs the API to return comment threads
    * associated with the specified video ID.
    */
  var videoId: js.UndefOr[String] = js.native
}

object ParamsResourceCommentthreadsList {
  @scala.inline
  def apply(): ParamsResourceCommentthreadsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentthreadsList]
  }
  @scala.inline
  implicit class ParamsResourceCommentthreadsListOps[Self <: ParamsResourceCommentthreadsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllThreadsRelatedToChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allThreadsRelatedToChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllThreadsRelatedToChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allThreadsRelatedToChannelId")(js.undefined)
        ret
    }
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
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
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
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withModerationStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModerationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
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
    def withSearchTerms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(js.undefined)
        ret
    }
  }
  
}

