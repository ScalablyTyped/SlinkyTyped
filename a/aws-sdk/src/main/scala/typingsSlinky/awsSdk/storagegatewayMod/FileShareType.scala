package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NFS
  - typingsSlinky.awsSdk.awsSdkStrings.SMB
  - java.lang.String
*/
trait FileShareType extends js.Object

object FileShareType {
  @scala.inline
  def NFS: typingsSlinky.awsSdk.awsSdkStrings.NFS = "NFS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NFS]
  @scala.inline
  def SMB: typingsSlinky.awsSdk.awsSdkStrings.SMB = "SMB".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SMB]
  @scala.inline
  implicit def apply(value: String): FileShareType = value.asInstanceOf[FileShareType]
}

