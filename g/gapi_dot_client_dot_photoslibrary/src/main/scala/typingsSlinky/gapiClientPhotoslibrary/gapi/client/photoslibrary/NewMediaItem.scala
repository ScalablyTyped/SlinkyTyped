package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewMediaItem extends js.Object {
  /**
    * Description of the media item. This will be shown to the user in the item's
    * info section in the Google Photos app.
    * This string shouldn't be more than 1000 characters.
    */
  var description: js.UndefOr[String] = js.native
  /** A new media item that has been uploaded via the included `uploadToken`. */
  var simpleMediaItem: js.UndefOr[SimpleMediaItem] = js.native
}

object NewMediaItem {
  @scala.inline
  def apply(): NewMediaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewMediaItem]
  }
  @scala.inline
  implicit class NewMediaItemOps[Self <: NewMediaItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSimpleMediaItem(value: SimpleMediaItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleMediaItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleMediaItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleMediaItem")(js.undefined)
        ret
    }
  }
  
}

