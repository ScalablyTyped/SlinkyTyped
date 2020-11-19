package typingsSlinky.portNumbers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("port-numbers", "getPort")
@js.native
object getPort extends js.Object {
  
  def apply(service: String): PortInfo | Null = js.native
  def apply(service: String, protocol: String): PortInfo | Null = js.native
}
