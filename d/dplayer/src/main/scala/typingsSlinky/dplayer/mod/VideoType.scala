package typingsSlinky.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dplayer.dplayerStrings.auto
  - typingsSlinky.dplayer.dplayerStrings.hls
  - typingsSlinky.dplayer.dplayerStrings.flv
  - typingsSlinky.dplayer.dplayerStrings.dash
  - typingsSlinky.dplayer.dplayerStrings.webtorrent
  - typingsSlinky.dplayer.dplayerStrings.normal
*/
trait VideoType extends js.Object

object VideoType {
  @scala.inline
  def auto: typingsSlinky.dplayer.dplayerStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dash: typingsSlinky.dplayer.dplayerStrings.dash = this.cast("dash")
  @scala.inline
  def flv: typingsSlinky.dplayer.dplayerStrings.flv = this.cast("flv")
  @scala.inline
  def hls: typingsSlinky.dplayer.dplayerStrings.hls = this.cast("hls")
  @scala.inline
  def normal: typingsSlinky.dplayer.dplayerStrings.normal = this.cast("normal")
  @scala.inline
  def webtorrent: typingsSlinky.dplayer.dplayerStrings.webtorrent = this.cast("webtorrent")
}

