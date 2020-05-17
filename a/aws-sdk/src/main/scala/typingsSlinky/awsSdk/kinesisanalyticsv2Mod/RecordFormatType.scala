package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.JSON
  - typingsSlinky.awsSdk.awsSdkStrings.CSV
  - java.lang.String
*/
trait RecordFormatType extends js.Object

object RecordFormatType {
  @scala.inline
  def JSON: typingsSlinky.awsSdk.awsSdkStrings.JSON = "JSON".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.JSON]
  @scala.inline
  def CSV: typingsSlinky.awsSdk.awsSdkStrings.CSV = "CSV".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CSV]
  @scala.inline
  implicit def apply(value: String): RecordFormatType = value.asInstanceOf[RecordFormatType]
}

