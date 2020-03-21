package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----网络状态
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baiduApp.baiduAppStrings.`2g`
  - typingsSlinky.baiduApp.baiduAppStrings.`3g`
  - typingsSlinky.baiduApp.baiduAppStrings.`4g`
  - typingsSlinky.baiduApp.baiduAppStrings.wifi
  - typingsSlinky.baiduApp.baiduAppStrings.unknown
  - typingsSlinky.baiduApp.baiduAppStrings.none
*/
trait networkType extends js.Object

object networkType {
  @scala.inline
  def `2g`: typingsSlinky.baiduApp.baiduAppStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typingsSlinky.baiduApp.baiduAppStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typingsSlinky.baiduApp.baiduAppStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.baiduApp.baiduAppStrings.none = this.cast("none")
  @scala.inline
  def unknown: typingsSlinky.baiduApp.baiduAppStrings.unknown = this.cast("unknown")
  @scala.inline
  def wifi: typingsSlinky.baiduApp.baiduAppStrings.wifi = this.cast("wifi")
}

