package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - typingsSlinky.awsSdk.awsSdkStrings.GZIP
  - typingsSlinky.awsSdk.awsSdkStrings.BZIP2
  - java.lang.String
*/
trait CompressionType extends js.Object

object CompressionType {
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  def GZIP: typingsSlinky.awsSdk.awsSdkStrings.GZIP = "GZIP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GZIP]
  @scala.inline
  def BZIP2: typingsSlinky.awsSdk.awsSdkStrings.BZIP2 = "BZIP2".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BZIP2]
  @scala.inline
  implicit def apply(value: String): CompressionType = value.asInstanceOf[CompressionType]
}

