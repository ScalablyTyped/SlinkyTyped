package typingsSlinky.playerframework.global.PlayerFramework

import typingsSlinky.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PlayerFramework.PluginBase")
@js.native
class PluginBase ()
  extends typingsSlinky.playerframework.PlayerFramework.PluginBase {
  /* CompleteClass */
  override var currentMediaSource: MediaSource = js.native
  /* CompleteClass */
  override var isActive: Boolean = js.native
  /* CompleteClass */
  override var isEnabled: Boolean = js.native
  /* CompleteClass */
  override var isLoaded: Boolean = js.native
  /* CompleteClass */
  override var mediaPlayer: typingsSlinky.playerframework.PlayerFramework.MediaPlayer = js.native
  /* CompleteClass */
  override def load(): Unit = js.native
  /* CompleteClass */
  override def unload(): Unit = js.native
  /* CompleteClass */
  override def update(mediaSource: MediaSource): Unit = js.native
}

