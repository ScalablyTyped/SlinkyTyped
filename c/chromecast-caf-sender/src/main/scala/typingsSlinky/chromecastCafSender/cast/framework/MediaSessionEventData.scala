package typingsSlinky.chromecastCafSender.cast.framework

import typingsSlinky.chrome.chrome.cast.media.Media
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.MediaSessionEventData")
@js.native
class MediaSessionEventData protected () extends EventData {
  def this(mediaSession: Media) = this()
  var mediaSession: Media = js.native
}

