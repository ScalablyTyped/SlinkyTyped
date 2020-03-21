package typingsSlinky.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 0: No repeat\
  * 1: Repeat all\
  * 2: Repeat one
  *
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}\
  * {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.deezerSdk.deezerSdkNumbers.`0`
  - typingsSlinky.deezerSdk.deezerSdkNumbers.`1`
  - typingsSlinky.deezerSdk.deezerSdkNumbers.`2`
*/
trait RepeatMode extends js.Object

object RepeatMode {
  @scala.inline
  def `0`: typingsSlinky.deezerSdk.deezerSdkNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typingsSlinky.deezerSdk.deezerSdkNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typingsSlinky.deezerSdk.deezerSdkNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

