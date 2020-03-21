package typingsSlinky.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================智能接口================================*/
/*=============================设备信息================================*/
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jweixin.jweixinStrings.`2g`
  - typingsSlinky.jweixin.jweixinStrings.`3g`
  - typingsSlinky.jweixin.jweixinStrings.`4g`
  - typingsSlinky.jweixin.jweixinStrings.wifi
*/
trait networkType extends js.Object

object networkType {
  @scala.inline
  def `2g`: typingsSlinky.jweixin.jweixinStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typingsSlinky.jweixin.jweixinStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typingsSlinky.jweixin.jweixinStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wifi: typingsSlinky.jweixin.jweixinStrings.wifi = this.cast("wifi")
}

