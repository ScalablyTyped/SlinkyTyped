package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SINGLE_DIRECTORY
  - typingsSlinky.awsSdk.awsSdkStrings.SUBDIRECTORY_PER_STREAM
  - java.lang.String
*/
trait HlsDirectoryStructure extends js.Object

object HlsDirectoryStructure {
  @scala.inline
  def SINGLE_DIRECTORY: typingsSlinky.awsSdk.awsSdkStrings.SINGLE_DIRECTORY = "SINGLE_DIRECTORY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SINGLE_DIRECTORY]
  @scala.inline
  def SUBDIRECTORY_PER_STREAM: typingsSlinky.awsSdk.awsSdkStrings.SUBDIRECTORY_PER_STREAM = "SUBDIRECTORY_PER_STREAM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUBDIRECTORY_PER_STREAM]
  @scala.inline
  implicit def apply(value: String): HlsDirectoryStructure = value.asInstanceOf[HlsDirectoryStructure]
}

