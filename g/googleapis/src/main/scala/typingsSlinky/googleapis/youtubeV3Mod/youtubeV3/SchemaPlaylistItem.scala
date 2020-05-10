package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A playlistItem resource identifies another resource, such as a video, that
  * is included in a playlist. In addition, the playlistItem  resource contains
  * details about the included resource that pertain specifically to how that
  * resource is used in that playlist.  YouTube uses playlists to identify
  * special collections of videos for a channel, such as:   - uploaded videos
  * - favorite videos  - positively rated (liked) videos  - watch history  -
  * watch later  To be more specific, these lists are associated with a
  * channel, which is a collection of a person, group, or company&#39;s videos,
  * playlists, and other YouTube information.  You can retrieve the playlist
  * IDs for each of these lists from the  channel resource  for a given
  * channel. You can then use the   playlistItems.list method to retrieve any
  * of those lists. You can also add or remove items from those lists by
  * calling the   playlistItems.insert and   playlistItems.delete methods. For
  * example, if a user gives a positive rating to a video, you would insert
  * that video into the liked videos playlist for that user&#39;s channel.
  */
@js.native
trait SchemaPlaylistItem extends js.Object {
  /**
    * The contentDetails object is included in the resource if the included
    * item is a YouTube video. The object contains additional information about
    * the video.
    */
  var contentDetails: js.UndefOr[SchemaPlaylistItemContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the playlist item.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#playlistItem&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the playlist item, such
    * as its title and position in the playlist.
    */
  var snippet: js.UndefOr[SchemaPlaylistItemSnippet] = js.native
  /**
    * The status object contains information about the playlist item&#39;s
    * privacy status.
    */
  var status: js.UndefOr[SchemaPlaylistItemStatus] = js.native
}

object SchemaPlaylistItem {
  @scala.inline
  def apply(): SchemaPlaylistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistItem]
  }
  @scala.inline
  implicit class SchemaPlaylistItemOps[Self <: SchemaPlaylistItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentDetails(value: SchemaPlaylistItemContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippet(value: SchemaPlaylistItemSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaPlaylistItemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

