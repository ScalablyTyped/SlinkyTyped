package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FULL_CONTROL
  - typingsSlinky.awsSdk.awsSdkStrings.WRITE
  - typingsSlinky.awsSdk.awsSdkStrings.WRITE_ACP
  - typingsSlinky.awsSdk.awsSdkStrings.READ
  - typingsSlinky.awsSdk.awsSdkStrings.READ_ACP
  - java.lang.String
*/
trait Permission extends js.Object

object Permission {
  @scala.inline
  def FULL_CONTROL: typingsSlinky.awsSdk.awsSdkStrings.FULL_CONTROL = "FULL_CONTROL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FULL_CONTROL]
  @scala.inline
  def WRITE: typingsSlinky.awsSdk.awsSdkStrings.WRITE = "WRITE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WRITE]
  @scala.inline
  def WRITE_ACP: typingsSlinky.awsSdk.awsSdkStrings.WRITE_ACP = "WRITE_ACP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WRITE_ACP]
  @scala.inline
  def READ: typingsSlinky.awsSdk.awsSdkStrings.READ = "READ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READ]
  @scala.inline
  def READ_ACP: typingsSlinky.awsSdk.awsSdkStrings.READ_ACP = "READ_ACP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READ_ACP]
  @scala.inline
  implicit def apply(value: String): Permission = value.asInstanceOf[Permission]
}

