package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal representation of thumbnails for a YouTube resource.
  */
@js.native
trait SchemaThumbnailDetails extends js.Object {
  /**
    * The default image for this resource.
    */
  var default: js.UndefOr[SchemaThumbnail] = js.native
  /**
    * The high quality image for this resource.
    */
  var high: js.UndefOr[SchemaThumbnail] = js.native
  /**
    * The maximum resolution quality image for this resource.
    */
  var maxres: js.UndefOr[SchemaThumbnail] = js.native
  /**
    * The medium quality image for this resource.
    */
  var medium: js.UndefOr[SchemaThumbnail] = js.native
  /**
    * The standard quality image for this resource.
    */
  var standard: js.UndefOr[SchemaThumbnail] = js.native
}

object SchemaThumbnailDetails {
  @scala.inline
  def apply(): SchemaThumbnailDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThumbnailDetails]
  }
  @scala.inline
  implicit class SchemaThumbnailDetailsOps[Self <: SchemaThumbnailDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: SchemaThumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withHigh(value: SchemaThumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxres(value: SchemaThumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxres: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxres")(js.undefined)
        ret
    }
    @scala.inline
    def withMedium(value: SchemaThumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(js.undefined)
        ret
    }
    @scala.inline
    def withStandard(value: SchemaThumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(js.undefined)
        ret
    }
  }
  
}

