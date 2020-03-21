package typingsSlinky.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dplayer.dplayerStrings.en
  - typingsSlinky.dplayer.dplayerStrings.`zh-cn`
  - typingsSlinky.dplayer.dplayerStrings.`zh-tw`
*/
trait Lang extends js.Object

object Lang {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def en: typingsSlinky.dplayer.dplayerStrings.en = this.cast("en")
  @scala.inline
  def `zh-cn`: typingsSlinky.dplayer.dplayerStrings.`zh-cn` = this.cast("zh-cn")
  @scala.inline
  def `zh-tw`: typingsSlinky.dplayer.dplayerStrings.`zh-tw` = this.cast("zh-tw")
}

