package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a search result, including title, description and
  * thumbnails of the item referenced by the search result.
  */
@js.native
trait SchemaSearchResultSnippet extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the channel that
    * published the resource that the search result identifies.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The title of the channel that published the resource that the search
    * result identifies.
    */
  var channelTitle: js.UndefOr[String] = js.native
  /**
    * A description of the search result.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * It indicates if the resource (video or channel) has upcoming/active live
    * broadcast content. Or it&#39;s &quot;none&quot; if there is not any
    * upcoming/active live broadcasts.
    */
  var liveBroadcastContent: js.UndefOr[String] = js.native
  /**
    * The creation date and time of the resource that the search result
    * identifies. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ)
    * format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * A map of thumbnail images associated with the search result. For each
    * object in the map, the key is the name of the thumbnail image, and the
    * value is an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  /**
    * The title of the search result.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaSearchResultSnippet {
  @scala.inline
  def apply(): SchemaSearchResultSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResultSnippet]
  }
  @scala.inline
  implicit class SchemaSearchResultSnippetOps[Self <: SchemaSearchResultSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withChannelTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveBroadcastContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveBroadcastContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveBroadcastContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveBroadcastContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnails(value: SchemaThumbnailDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

