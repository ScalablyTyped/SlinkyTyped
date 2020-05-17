package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.READ
  - typingsSlinky.awsSdk.awsSdkStrings.WRITE
  - typingsSlinky.awsSdk.awsSdkStrings.MKNOD
  - java.lang.String
*/
trait DeviceCgroupPermission extends js.Object

object DeviceCgroupPermission {
  @scala.inline
  def READ: typingsSlinky.awsSdk.awsSdkStrings.READ = "READ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READ]
  @scala.inline
  def WRITE: typingsSlinky.awsSdk.awsSdkStrings.WRITE = "WRITE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WRITE]
  @scala.inline
  def MKNOD: typingsSlinky.awsSdk.awsSdkStrings.MKNOD = "MKNOD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MKNOD]
  @scala.inline
  implicit def apply(value: java.lang.String): DeviceCgroupPermission = value.asInstanceOf[DeviceCgroupPermission]
}

