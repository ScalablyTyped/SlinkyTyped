package typingsSlinky.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ZIP
  - typingsSlinky.awsSdk.awsSdkStrings.GZIP
  - typingsSlinky.awsSdk.awsSdkStrings.Parquet
  - java.lang.String
*/
trait CompressionFormat extends js.Object

object CompressionFormat {
  @scala.inline
  def ZIP: typingsSlinky.awsSdk.awsSdkStrings.ZIP = "ZIP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ZIP]
  @scala.inline
  def GZIP: typingsSlinky.awsSdk.awsSdkStrings.GZIP = "GZIP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GZIP]
  @scala.inline
  def Parquet: typingsSlinky.awsSdk.awsSdkStrings.Parquet = "Parquet".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Parquet]
  @scala.inline
  implicit def apply(value: String): CompressionFormat = value.asInstanceOf[CompressionFormat]
}

