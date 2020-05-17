package typingsSlinky.chrome.chrome.cast.media

import typingsSlinky.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovieMediaMetadata extends js.Object {
  var images: js.Array[Image] = js.native
  var metadataType: MetadataType = js.native
  var releaseDate: String = js.native
  /** @deprecated. Use releaseDate instead. */
  var releaseYear: Double = js.native
  var studio: String = js.native
  var subtitle: String = js.native
  var title: String = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}

object MovieMediaMetadata {
  @scala.inline
  def apply(
    images: js.Array[Image],
    metadataType: MetadataType,
    releaseDate: String,
    releaseYear: Double,
    studio: String,
    subtitle: String,
    title: String,
    `type`: MetadataType
  ): MovieMediaMetadata = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], releaseYear = releaseYear.asInstanceOf[js.Any], studio = studio.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovieMediaMetadata]
  }
  @scala.inline
  implicit class MovieMediaMetadataOps[Self <: MovieMediaMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImages(value: js.Array[Image]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataType(value: MetadataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStudio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
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
  }
  
}

