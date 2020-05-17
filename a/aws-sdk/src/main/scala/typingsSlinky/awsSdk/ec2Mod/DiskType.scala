package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.hdd
  - typingsSlinky.awsSdk.awsSdkStrings.ssd
  - java.lang.String
*/
trait DiskType extends js.Object

object DiskType {
  @scala.inline
  def hdd: typingsSlinky.awsSdk.awsSdkStrings.hdd = "hdd".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.hdd]
  @scala.inline
  def ssd: typingsSlinky.awsSdk.awsSdkStrings.ssd = "ssd".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ssd]
  @scala.inline
  implicit def apply(value: java.lang.String): DiskType = value.asInstanceOf[DiskType]
}

