package typingsSlinky.chrome.global.chrome.cast.media

import typingsSlinky.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.TvShowMediaMetadata")
@js.native
/**
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.TvShowMediaMetadata
  */
class TvShowMediaMetadata ()
  extends typingsSlinky.chrome.chrome.cast.media.TvShowMediaMetadata {
  /* CompleteClass */
  override var episode: Double = js.native
  /** @deprecated. Use episode instead. */
  /* CompleteClass */
  override var episodeNumber: Double = js.native
  /** @deprecated. Use title instead. */
  /* CompleteClass */
  override var episodeTitle: String = js.native
  /* CompleteClass */
  override var images: js.Array[Image] = js.native
  /* CompleteClass */
  override var metadataType: typingsSlinky.chrome.chrome.cast.media.MetadataType = js.native
  /* CompleteClass */
  override var originalAirdate: String = js.native
  /** @deprecated. Use originalAirdate instead. */
  /* CompleteClass */
  override var releaseYear: Double = js.native
  /* CompleteClass */
  override var season: Double = js.native
  /** @deprecated. Use season instead. */
  /* CompleteClass */
  override var seasonNumber: Double = js.native
  /* CompleteClass */
  override var seriesTitle: String = js.native
  /* CompleteClass */
  override var title: String = js.native
  /** @deprecated. Use metadataType instead. */
  /* CompleteClass */
  override var `type`: typingsSlinky.chrome.chrome.cast.media.MetadataType = js.native
}

