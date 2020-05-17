package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.UNCOMPRESSED
  - typingsSlinky.awsSdk.awsSdkStrings.GZIP
  - typingsSlinky.awsSdk.awsSdkStrings.SNAPPY
  - java.lang.String
*/
trait ParquetCompression extends js.Object

object ParquetCompression {
  @scala.inline
  def UNCOMPRESSED: typingsSlinky.awsSdk.awsSdkStrings.UNCOMPRESSED = "UNCOMPRESSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNCOMPRESSED]
  @scala.inline
  def GZIP: typingsSlinky.awsSdk.awsSdkStrings.GZIP = "GZIP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GZIP]
  @scala.inline
  def SNAPPY: typingsSlinky.awsSdk.awsSdkStrings.SNAPPY = "SNAPPY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SNAPPY]
  @scala.inline
  implicit def apply(value: String): ParquetCompression = value.asInstanceOf[ParquetCompression]
}

