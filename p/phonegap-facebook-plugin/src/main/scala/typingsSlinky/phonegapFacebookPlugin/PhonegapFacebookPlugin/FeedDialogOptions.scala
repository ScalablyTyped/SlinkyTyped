package typingsSlinky.phonegapFacebookPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can add the Feed Dialog to your app so people can publish individual stories to their timeline. This
  * includes captions that your app manages and a personal comment from the person sharing the content.
  *
  * For use with showDialog() of method type 'feed'.
  */
@js.native
trait FeedDialogOptions extends BaseDialogOptions {
  /**
    * The caption of the link (appears beneath the link name). If not specified, this field is automatically
    * populated with the URL of the link.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * The description of the link (appears beneath the link caption). If not specified, this field is
    * automatically populated by information scraped from the link, typically the title of the page.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The ID of the person posting the message. If this is unspecified, it defaults to the current person.
    * If specified, it must be the ID of the person or of a page that the person administers.
    */
  var from: js.UndefOr[String] = js.native
  /**
    * The link attached to this post.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * The name of the link attachment.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of a picture attached to this post. The picture must be at least 200px by 200px.
    */
  var picture: js.UndefOr[String] = js.native
  /**
    * This argument is a comma-separated list, consisting of at most 5 distinct items, each of length at
    * least 1 and at most 15 characters drawn from the set
    * '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_'.
    * Each category is used in Facebook Insights to help you measure the performance of different types
    * of post.
    */
  var ref: js.UndefOr[String] = js.native
  /**
    * The URL of a media file (either SWF or MP3) attached to this post. If SWF, you must also specify
    * 'picture' to provide a thumbnail for the video.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The ID of the profile that this story will be published to. If this is unspecified, it defaults to
    * the value of from. The ID must be a friend who also uses your app.
    */
  var to: js.UndefOr[String] = js.native
}

object FeedDialogOptions {
  @scala.inline
  def apply(method: String): FeedDialogOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedDialogOptions]
  }
  @scala.inline
  implicit class FeedDialogOptionsOps[Self <: FeedDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
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
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPicture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

