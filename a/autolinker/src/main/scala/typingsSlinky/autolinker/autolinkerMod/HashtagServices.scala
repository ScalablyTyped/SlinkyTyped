package typingsSlinky.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.autolinker.autolinkerStrings.twitter
  - typingsSlinky.autolinker.autolinkerStrings.facebook
  - typingsSlinky.autolinker.autolinkerStrings.instagram
*/
trait HashtagServices extends js.Object

object HashtagServices {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facebook: typingsSlinky.autolinker.autolinkerStrings.facebook = this.cast("facebook")
  @scala.inline
  def instagram: typingsSlinky.autolinker.autolinkerStrings.instagram = this.cast("instagram")
  @scala.inline
  def twitter: typingsSlinky.autolinker.autolinkerStrings.twitter = this.cast("twitter")
}

