package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ovm
  - typingsSlinky.awsSdk.awsSdkStrings.xen
  - java.lang.String
*/
trait HypervisorType extends js.Object

object HypervisorType {
  @scala.inline
  def ovm: typingsSlinky.awsSdk.awsSdkStrings.ovm = "ovm".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ovm]
  @scala.inline
  def xen: typingsSlinky.awsSdk.awsSdkStrings.xen = "xen".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.xen]
  @scala.inline
  implicit def apply(value: java.lang.String): HypervisorType = value.asInstanceOf[HypervisorType]
}

