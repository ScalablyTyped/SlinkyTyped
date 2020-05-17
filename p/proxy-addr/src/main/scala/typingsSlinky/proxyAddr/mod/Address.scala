package typingsSlinky.proxyAddr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.proxyAddr.proxyAddrStrings.loopback
  - typingsSlinky.proxyAddr.proxyAddrStrings.linklocal
  - typingsSlinky.proxyAddr.proxyAddrStrings.uniquelocal
  - java.lang.String
*/
trait Address extends js.Object

object Address {
  @scala.inline
  def loopback: typingsSlinky.proxyAddr.proxyAddrStrings.loopback = "loopback".asInstanceOf[typingsSlinky.proxyAddr.proxyAddrStrings.loopback]
  @scala.inline
  def linklocal: typingsSlinky.proxyAddr.proxyAddrStrings.linklocal = "linklocal".asInstanceOf[typingsSlinky.proxyAddr.proxyAddrStrings.linklocal]
  @scala.inline
  def uniquelocal: typingsSlinky.proxyAddr.proxyAddrStrings.uniquelocal = "uniquelocal".asInstanceOf[typingsSlinky.proxyAddr.proxyAddrStrings.uniquelocal]
  @scala.inline
  implicit def apply(value: String): Address = value.asInstanceOf[Address]
}

