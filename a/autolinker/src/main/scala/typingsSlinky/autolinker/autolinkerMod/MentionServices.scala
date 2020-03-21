package typingsSlinky.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.autolinker.autolinkerStrings.twitter
  - typingsSlinky.autolinker.autolinkerStrings.instagram
  - typingsSlinky.autolinker.autolinkerStrings.soundcloud
*/
trait MentionServices extends js.Object

object MentionServices {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def instagram: typingsSlinky.autolinker.autolinkerStrings.instagram = this.cast("instagram")
  @scala.inline
  def soundcloud: typingsSlinky.autolinker.autolinkerStrings.soundcloud = this.cast("soundcloud")
  @scala.inline
  def twitter: typingsSlinky.autolinker.autolinkerStrings.twitter = this.cast("twitter")
}

