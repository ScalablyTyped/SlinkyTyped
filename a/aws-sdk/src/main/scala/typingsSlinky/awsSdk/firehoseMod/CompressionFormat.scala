package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.UNCOMPRESSED
  - typingsSlinky.awsSdk.awsSdkStrings.GZIP
  - typingsSlinky.awsSdk.awsSdkStrings.ZIP
  - typingsSlinky.awsSdk.awsSdkStrings.Snappy_
  - java.lang.String
*/
trait CompressionFormat extends js.Object

object CompressionFormat {
  @scala.inline
  def UNCOMPRESSED: typingsSlinky.awsSdk.awsSdkStrings.UNCOMPRESSED = "UNCOMPRESSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNCOMPRESSED]
  @scala.inline
  def GZIP: typingsSlinky.awsSdk.awsSdkStrings.GZIP = "GZIP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GZIP]
  @scala.inline
  def ZIP: typingsSlinky.awsSdk.awsSdkStrings.ZIP = "ZIP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ZIP]
  @scala.inline
  def Snappy_ : typingsSlinky.awsSdk.awsSdkStrings.Snappy_ = "Snappy".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Snappy_]
  @scala.inline
  implicit def apply(value: String): CompressionFormat = value.asInstanceOf[CompressionFormat]
}

