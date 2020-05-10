package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlbumPosition extends js.Object {
  /** Type of position, for a media or enrichment item. */
  var position: js.UndefOr[String] = js.native
  /**
    * The enrichment item to which the position is relative to.
    * Only used when position type is AFTER_ENRICHMENT_ITEM.
    */
  var relativeEnrichmentItemId: js.UndefOr[String] = js.native
  /**
    * The media item to which the position is relative to.
    * Only used when position type is AFTER_MEDIA_ITEM.
    */
  var relativeMediaItemId: js.UndefOr[String] = js.native
}

object AlbumPosition {
  @scala.inline
  def apply(): AlbumPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlbumPosition]
  }
  @scala.inline
  implicit class AlbumPositionOps[Self <: AlbumPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeEnrichmentItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeEnrichmentItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeEnrichmentItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeEnrichmentItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeMediaItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeMediaItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeMediaItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeMediaItemId")(js.undefined)
        ret
    }
  }
  
}

