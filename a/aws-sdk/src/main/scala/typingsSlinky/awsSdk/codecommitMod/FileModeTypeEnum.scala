package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EXECUTABLE
  - typingsSlinky.awsSdk.awsSdkStrings.NORMAL
  - typingsSlinky.awsSdk.awsSdkStrings.SYMLINK
  - java.lang.String
*/
trait FileModeTypeEnum extends js.Object

object FileModeTypeEnum {
  @scala.inline
  def EXECUTABLE: typingsSlinky.awsSdk.awsSdkStrings.EXECUTABLE = "EXECUTABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXECUTABLE]
  @scala.inline
  def NORMAL: typingsSlinky.awsSdk.awsSdkStrings.NORMAL = "NORMAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NORMAL]
  @scala.inline
  def SYMLINK: typingsSlinky.awsSdk.awsSdkStrings.SYMLINK = "SYMLINK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SYMLINK]
  @scala.inline
  implicit def apply(value: String): FileModeTypeEnum = value.asInstanceOf[FileModeTypeEnum]
}

