package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.interface_
  - typingsSlinky.awsSdk.awsSdkStrings.natGateway
  - typingsSlinky.awsSdk.awsSdkStrings.efa
  - java.lang.String
*/
trait NetworkInterfaceType extends js.Object

object NetworkInterfaceType {
  @scala.inline
  def interface_ : typingsSlinky.awsSdk.awsSdkStrings.interface_ = "interface".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.interface_]
  @scala.inline
  def natGateway: typingsSlinky.awsSdk.awsSdkStrings.natGateway = "natGateway".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.natGateway]
  @scala.inline
  def efa: typingsSlinky.awsSdk.awsSdkStrings.efa = "efa".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.efa]
  @scala.inline
  implicit def apply(value: java.lang.String): NetworkInterfaceType = value.asInstanceOf[NetworkInterfaceType]
}

