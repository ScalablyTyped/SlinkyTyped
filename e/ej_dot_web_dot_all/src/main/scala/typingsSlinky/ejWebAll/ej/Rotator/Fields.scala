package typingsSlinky.ejWebAll.ej.Rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  /** Specifies a link for the image.
    */
  var linkAttribute: js.UndefOr[String] = js.native
  /** Specifies where to open a given link.
    */
  var targetAttribute: js.UndefOr[String] = js.native
  /** Specifies a caption for the image.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies a caption for the thumbnail image.
    */
  var thumbnailText: js.UndefOr[String] = js.native
  /** Specifies the URL for an thumbnail image.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  /** Specifies the URL for an image.
    */
  var url: js.UndefOr[String] = js.native
}

object Fields {
  @scala.inline
  def apply(): Fields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailText")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

