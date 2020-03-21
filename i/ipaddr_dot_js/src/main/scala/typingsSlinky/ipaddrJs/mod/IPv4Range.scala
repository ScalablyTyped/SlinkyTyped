package typingsSlinky.ipaddrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ipaddrJs.ipaddrJsStrings.unicast
  - typingsSlinky.ipaddrJs.ipaddrJsStrings.unspecified
  - typingsSlinky.ipaddrJs.ipaddrJsStrings.broadcast
  - typingsSlinky.ipaddrJs.ipaddrJsStrings.multicast
  - typingsSlinky.ipaddrJs.ipaddrJsStrings.linkLocal
  - typingsSlinky.ipaddrJs.ipaddrJsStrings.loopback
  - typingsSlinky.ipaddrJs.ipaddrJsStrings.carrierGradeNat
  - typingsSlinky.ipaddrJs.ipaddrJsStrings.`private`
  - typingsSlinky.ipaddrJs.ipaddrJsStrings.reserved
*/
trait IPv4Range extends js.Object

object IPv4Range {
  @scala.inline
  def broadcast: typingsSlinky.ipaddrJs.ipaddrJsStrings.broadcast = this.cast("broadcast")
  @scala.inline
  def carrierGradeNat: typingsSlinky.ipaddrJs.ipaddrJsStrings.carrierGradeNat = this.cast("carrierGradeNat")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linkLocal: typingsSlinky.ipaddrJs.ipaddrJsStrings.linkLocal = this.cast("linkLocal")
  @scala.inline
  def loopback: typingsSlinky.ipaddrJs.ipaddrJsStrings.loopback = this.cast("loopback")
  @scala.inline
  def multicast: typingsSlinky.ipaddrJs.ipaddrJsStrings.multicast = this.cast("multicast")
  @scala.inline
  def `private`: typingsSlinky.ipaddrJs.ipaddrJsStrings.`private` = this.cast("private")
  @scala.inline
  def reserved: typingsSlinky.ipaddrJs.ipaddrJsStrings.reserved = this.cast("reserved")
  @scala.inline
  def unicast: typingsSlinky.ipaddrJs.ipaddrJsStrings.unicast = this.cast("unicast")
  @scala.inline
  def unspecified: typingsSlinky.ipaddrJs.ipaddrJsStrings.unspecified = this.cast("unspecified")
}

