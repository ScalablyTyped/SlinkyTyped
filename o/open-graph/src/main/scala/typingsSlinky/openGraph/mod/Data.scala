package typingsSlinky.openGraph.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openGraph.AnonAlternate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data
  extends /* key */ StringDictionary[js.UndefOr[String | js.Array[String] | ImageVideoMetadata | Metadata]] {
  /** A URL to an audio file to accompany this object. */
  var audio: js.UndefOr[String | js.Array[String] | Metadata] = js.native
  /** A one to two sentence description of your object. */
  var description: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The word that appears before this object's title in a sentence. An enum of (a, an, the, "", auto).
    * If auto is chosen, the consumer of your data should chose between "a" or "an". Default is "" (blank).
    */
  var determiner: js.UndefOr[String | js.Array[String]] = js.native
  /** An image URL which should represent your object within the graph. */
  var image: js.UndefOr[String | js.Array[String] | ImageVideoMetadata] = js.native
  /** The locale these tags are marked up in. Of the format `language_TERRITORY`. Default is `en_US`. */
  var locale: js.UndefOr[String | js.Array[String] | AnonAlternate] = js.native
  /** If your object is part of a larger web site, the name which should be displayed for the overall site. e.g., "IMDb". */
  var site_name: js.UndefOr[String | js.Array[String]] = js.native
  /** The title of your object as it should appear within the graph, e.g., "The Rock". */
  var title: String | js.Array[String] = js.native
  /** The type of your object, e.g., "video.movie". Depending on the type you specify, other properties may also be required. */
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  /** The canonical URL of your object that will be used as its permanent ID in the graph, e.g., "http://www.imdb.com/title/tt0117500/". */
  var url: js.UndefOr[String | js.Array[String]] = js.native
  /** A URL to a video file that complements this object. */
  var video: js.UndefOr[String | js.Array[String] | ImageVideoMetadata] = js.native
}

object Data {
  @scala.inline
  def apply(title: String | js.Array[String]): Data = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudio(value: String | js.Array[String] | Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String | js.Array[String]): Self = {
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
    def withDeterminer(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("determiner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeterminer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("determiner")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String | js.Array[String] | ImageVideoMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String | js.Array[String] | AnonAlternate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withSite_name(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String | js.Array[String]): Self = {
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
    @scala.inline
    def withVideo(value: String | js.Array[String] | ImageVideoMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
  }
  
}

