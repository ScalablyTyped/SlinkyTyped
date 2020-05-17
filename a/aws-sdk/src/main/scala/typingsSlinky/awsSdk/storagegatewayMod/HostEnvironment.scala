package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.VMWARE
  - typingsSlinky.awsSdk.awsSdkStrings.`HYPER-V`
  - typingsSlinky.awsSdk.awsSdkStrings.EC2
  - typingsSlinky.awsSdk.awsSdkStrings.KVM
  - typingsSlinky.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
trait HostEnvironment extends js.Object

object HostEnvironment {
  @scala.inline
  def VMWARE: typingsSlinky.awsSdk.awsSdkStrings.VMWARE = "VMWARE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VMWARE]
  @scala.inline
  def `HYPER-V`: typingsSlinky.awsSdk.awsSdkStrings.`HYPER-V` = "HYPER-V".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`HYPER-V`]
  @scala.inline
  def EC2: typingsSlinky.awsSdk.awsSdkStrings.EC2 = "EC2".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EC2]
  @scala.inline
  def KVM: typingsSlinky.awsSdk.awsSdkStrings.KVM = "KVM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.KVM]
  @scala.inline
  def OTHER: typingsSlinky.awsSdk.awsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OTHER]
  @scala.inline
  implicit def apply(value: String): HostEnvironment = value.asInstanceOf[HostEnvironment]
}

