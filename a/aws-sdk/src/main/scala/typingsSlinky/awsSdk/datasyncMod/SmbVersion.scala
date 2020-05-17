package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC
  - typingsSlinky.awsSdk.awsSdkStrings.SMB2
  - typingsSlinky.awsSdk.awsSdkStrings.SMB3
  - java.lang.String
*/
trait SmbVersion extends js.Object

object SmbVersion {
  @scala.inline
  def AUTOMATIC: typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC = "AUTOMATIC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC]
  @scala.inline
  def SMB2: typingsSlinky.awsSdk.awsSdkStrings.SMB2 = "SMB2".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SMB2]
  @scala.inline
  def SMB3: typingsSlinky.awsSdk.awsSdkStrings.SMB3 = "SMB3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SMB3]
  @scala.inline
  implicit def apply(value: String): SmbVersion = value.asInstanceOf[SmbVersion]
}

