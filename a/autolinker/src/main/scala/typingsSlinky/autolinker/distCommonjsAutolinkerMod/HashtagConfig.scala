package typingsSlinky.autolinker.distCommonjsAutolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.autolinker.autolinkerNumbers.`false`
  - typings.autolinker.autolinkerStrings.twitter
  - typings.autolinker.autolinkerStrings.facebook
  - typings.autolinker.autolinkerStrings.instagram
*/
trait HashtagConfig extends js.Object

object HashtagConfig {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facebook: typingsSlinky.autolinker.autolinkerStrings.facebook = this.cast("facebook")
  @scala.inline
  def `false`: typingsSlinky.autolinker.autolinkerNumbers.`false` = this.cast(false)
  @scala.inline
  def instagram: typingsSlinky.autolinker.autolinkerStrings.instagram = this.cast("instagram")
  @scala.inline
  def twitter: typingsSlinky.autolinker.autolinkerStrings.twitter = this.cast("twitter")
}

