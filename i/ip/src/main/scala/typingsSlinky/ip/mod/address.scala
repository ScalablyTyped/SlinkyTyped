package typingsSlinky.ip.mod

import typingsSlinky.ip.ipStrings.`private`
import typingsSlinky.ip.ipStrings.ipv4
import typingsSlinky.ip.ipStrings.ipv6
import typingsSlinky.ip.ipStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ip", "address")
@js.native
object address extends js.Object {
  
  def apply(): String = js.native
  def apply(name: String): String = js.native
  def apply(name: `private`, family: ipv4): String = js.native
  def apply(name: `private`, family: ipv6): String = js.native
  def apply(name: public, family: ipv4): String = js.native
  def apply(name: public, family: ipv6): String = js.native
}
