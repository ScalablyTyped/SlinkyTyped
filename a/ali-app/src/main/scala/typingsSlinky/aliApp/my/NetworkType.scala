package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aliApp.aliAppStrings.UNKNOWN
  - typingsSlinky.aliApp.aliAppStrings.NOTREACHABLE
  - typingsSlinky.aliApp.aliAppStrings.WIFI
  - typingsSlinky.aliApp.aliAppStrings.`3G`
  - typingsSlinky.aliApp.aliAppStrings.`2G`
  - typingsSlinky.aliApp.aliAppStrings.`4G`
  - typingsSlinky.aliApp.aliAppStrings.WWAN
*/
trait NetworkType extends js.Object

object NetworkType {
  @scala.inline
  def `2G`: typingsSlinky.aliApp.aliAppStrings.`2G` = this.cast("2G")
  @scala.inline
  def `3G`: typingsSlinky.aliApp.aliAppStrings.`3G` = this.cast("3G")
  @scala.inline
  def `4G`: typingsSlinky.aliApp.aliAppStrings.`4G` = this.cast("4G")
  @scala.inline
  def NOTREACHABLE: typingsSlinky.aliApp.aliAppStrings.NOTREACHABLE = this.cast("NOTREACHABLE")
  @scala.inline
  def UNKNOWN: typingsSlinky.aliApp.aliAppStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def WIFI: typingsSlinky.aliApp.aliAppStrings.WIFI = this.cast("WIFI")
  @scala.inline
  def WWAN: typingsSlinky.aliApp.aliAppStrings.WWAN = this.cast("WWAN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

