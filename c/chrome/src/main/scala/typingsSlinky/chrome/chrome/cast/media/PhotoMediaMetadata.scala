package typingsSlinky.chrome.chrome.cast.media

import typingsSlinky.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotoMediaMetadata extends js.Object {
  var artist: String = js.native
  var creationDateTime: String = js.native
  var height: Double = js.native
  var images: js.Array[Image] = js.native
  var latitude: Double = js.native
  var location: String = js.native
  var longitude: Double = js.native
  var metadataType: MetadataType = js.native
  var title: String = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
  var width: Double = js.native
}

object PhotoMediaMetadata {
  @scala.inline
  def apply(
    artist: String,
    creationDateTime: String,
    height: Double,
    images: js.Array[Image],
    latitude: Double,
    location: String,
    longitude: Double,
    metadataType: MetadataType,
    title: String,
    `type`: MetadataType,
    width: Double
  ): PhotoMediaMetadata = {
    val __obj = js.Dynamic.literal(artist = artist.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoMediaMetadata]
  }
  @scala.inline
  implicit class PhotoMediaMetadataOps[Self <: PhotoMediaMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[Image]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataType(value: MetadataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MetadataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

