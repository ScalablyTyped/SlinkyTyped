package typingsSlinky.preloadjs.global.createjs

import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MediaTagRequest")
@js.native
class MediaTagRequest protected ()
  extends typingsSlinky.preloadjs.createjs.MediaTagRequest {
  def this(loadItem: typingsSlinky.preloadjs.createjs.LoadItem, tag: HTMLAudioElement, srcAttribute: String) = this()
  def this(loadItem: typingsSlinky.preloadjs.createjs.LoadItem, tag: HTMLVideoElement, srcAttribute: String) = this()
}

