package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.responseMediaMod.MediaObjectString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2MediaObject extends MediaObjectString {
  /**
    * The url pointing to the media content.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * Description of this media object.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A small image icon displayed on the right from the title.
    * It's resized to 36x36 dp.
    */
  var icon: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * A large image, such as the cover of the album, etc.
    */
  var largeImage: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Name of this media object.
    */
  var name: js.UndefOr[String] = js.native
}

object GoogleActionsV2MediaObject {
  @scala.inline
  def apply(): GoogleActionsV2MediaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2MediaObject]
  }
  @scala.inline
  implicit class GoogleActionsV2MediaObjectOps[Self <: GoogleActionsV2MediaObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(js.undefined)
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
    def withIcon(value: GoogleActionsV2UiElementsImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeImage(value: GoogleActionsV2UiElementsImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeImage")(js.undefined)
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
  }
  
}

