package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.WARM
  - typingsSlinky.awsSdk.awsSdkStrings.COLD
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
trait StorageClass extends js.Object

object StorageClass {
  @scala.inline
  def WARM: typingsSlinky.awsSdk.awsSdkStrings.WARM = "WARM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WARM]
  @scala.inline
  def COLD: typingsSlinky.awsSdk.awsSdkStrings.COLD = "COLD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COLD]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  implicit def apply(value: String): StorageClass = value.asInstanceOf[StorageClass]
}

