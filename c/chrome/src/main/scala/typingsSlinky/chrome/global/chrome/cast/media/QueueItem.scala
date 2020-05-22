package typingsSlinky.chrome.global.chrome.cast.media

import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.QueueItem")
@js.native
class QueueItem protected ()
  extends typingsSlinky.chrome.chrome.cast.media.QueueItem {
  /**
    * @param {!chrome.cast.media.MediaInfo} mediaInfo
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.QueueItem
    */
  def this(mediaInfo: typingsSlinky.chrome.chrome.cast.media.MediaInfo) = this()
  /* CompleteClass */
  override var activeTrackIds: js.Array[Number] = js.native
  /* CompleteClass */
  override var autoplay: Boolean = js.native
  /* CompleteClass */
  override var customData: js.Object = js.native
  /* CompleteClass */
  override var itemId: Double = js.native
  /* CompleteClass */
  override var media: typingsSlinky.chrome.chrome.cast.media.MediaInfo = js.native
  /* CompleteClass */
  override var preloadTime: Double = js.native
  /* CompleteClass */
  override var startTime: Double = js.native
}

