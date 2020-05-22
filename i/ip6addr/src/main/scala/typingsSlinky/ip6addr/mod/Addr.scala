package typingsSlinky.ip6addr.mod

import typingsSlinky.ip6addr.ip6addrStrings.ipv4
import typingsSlinky.ip6addr.ip6addrStrings.ipv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addr extends js.Object {
  def compare(other: Addr): Double = js.native
  def kind(): ipv4 | ipv6 = js.native
  def offset(num: Double): Addr | Null = js.native
  def toBuffer(): js.typedarray.Uint8Array = js.native
  def toBuffer(buff: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def toLong(): Double = js.native
  def toString(opts: ToStringOpts): String = js.native
}

