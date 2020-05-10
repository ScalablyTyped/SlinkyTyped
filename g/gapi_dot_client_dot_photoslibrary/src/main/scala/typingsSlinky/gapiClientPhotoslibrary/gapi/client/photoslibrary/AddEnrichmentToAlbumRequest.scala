package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddEnrichmentToAlbumRequest extends js.Object {
  /** The position in the album where the enrichment is to be inserted. */
  var albumPosition: js.UndefOr[AlbumPosition] = js.native
  /** The enrichment to be added. */
  var newEnrichmentItem: js.UndefOr[NewEnrichmentItem] = js.native
}

object AddEnrichmentToAlbumRequest {
  @scala.inline
  def apply(): AddEnrichmentToAlbumRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddEnrichmentToAlbumRequest]
  }
  @scala.inline
  implicit class AddEnrichmentToAlbumRequestOps[Self <: AddEnrichmentToAlbumRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbumPosition(value: AlbumPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withNewEnrichmentItem(value: NewEnrichmentItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEnrichmentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewEnrichmentItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEnrichmentItem")(js.undefined)
        ret
    }
  }
  
}

