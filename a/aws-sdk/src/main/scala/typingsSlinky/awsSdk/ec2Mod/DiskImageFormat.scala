package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.VMDK
  - typingsSlinky.awsSdk.awsSdkStrings.RAW
  - typingsSlinky.awsSdk.awsSdkStrings.VHD
  - java.lang.String
*/
trait DiskImageFormat extends js.Object

object DiskImageFormat {
  @scala.inline
  def VMDK: typingsSlinky.awsSdk.awsSdkStrings.VMDK = "VMDK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VMDK]
  @scala.inline
  def RAW: typingsSlinky.awsSdk.awsSdkStrings.RAW = "RAW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RAW]
  @scala.inline
  def VHD: typingsSlinky.awsSdk.awsSdkStrings.VHD = "VHD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VHD]
  @scala.inline
  implicit def apply(value: java.lang.String): DiskImageFormat = value.asInstanceOf[DiskImageFormat]
}

