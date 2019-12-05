package typingsSlinky.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----网络状态
/* Rewritten from type alias, can be one of: 
  - typings.baiduDashApp.baiduDashAppStrings.`2g`
  - typings.baiduDashApp.baiduDashAppStrings.`3g`
  - typings.baiduDashApp.baiduDashAppStrings.`4g`
  - typings.baiduDashApp.baiduDashAppStrings.wifi
  - typings.baiduDashApp.baiduDashAppStrings.unknown
  - typings.baiduDashApp.baiduDashAppStrings.none
*/
trait networkType extends js.Object

object networkType {
  @scala.inline
  def `2g`: typingsSlinky.baiduDashApp.baiduDashAppStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typingsSlinky.baiduDashApp.baiduDashAppStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typingsSlinky.baiduDashApp.baiduDashAppStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.baiduDashApp.baiduDashAppStrings.none = this.cast("none")
  @scala.inline
  def unknown: typingsSlinky.baiduDashApp.baiduDashAppStrings.unknown = this.cast("unknown")
  @scala.inline
  def wifi: typingsSlinky.baiduDashApp.baiduDashAppStrings.wifi = this.cast("wifi")
}

