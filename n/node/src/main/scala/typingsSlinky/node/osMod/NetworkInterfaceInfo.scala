package typingsSlinky.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.osMod.NetworkInterfaceInfoIPv4
  - typingsSlinky.node.osMod.NetworkInterfaceInfoIPv6
*/
trait NetworkInterfaceInfo extends js.Object

object NetworkInterfaceInfo {
  @scala.inline
  implicit def apply(value: NetworkInterfaceInfoIPv4): NetworkInterfaceInfo = value.asInstanceOf[NetworkInterfaceInfo]
  @scala.inline
  implicit def apply(value: NetworkInterfaceInfoIPv6): NetworkInterfaceInfo = value.asInstanceOf[NetworkInterfaceInfo]
}

