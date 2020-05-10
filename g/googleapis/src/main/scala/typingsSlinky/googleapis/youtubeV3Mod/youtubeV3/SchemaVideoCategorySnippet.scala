package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a video category, such as its localized title.
  */
@js.native
trait SchemaVideoCategorySnippet extends js.Object {
  var assignable: js.UndefOr[Boolean] = js.native
  /**
    * The YouTube channel that created the video category.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The video category&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaVideoCategorySnippet {
  @scala.inline
  def apply(): SchemaVideoCategorySnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoCategorySnippet]
  }
  @scala.inline
  implicit class SchemaVideoCategorySnippetOps[Self <: SchemaVideoCategorySnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignable")(js.undefined)
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

