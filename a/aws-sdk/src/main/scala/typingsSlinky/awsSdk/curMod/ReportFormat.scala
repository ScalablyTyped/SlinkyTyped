package typingsSlinky.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.textORcsv
  - typingsSlinky.awsSdk.awsSdkStrings.Parquet
  - java.lang.String
*/
trait ReportFormat extends js.Object

object ReportFormat {
  @scala.inline
  def textORcsv: typingsSlinky.awsSdk.awsSdkStrings.textORcsv = "textORcsv".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.textORcsv]
  @scala.inline
  def Parquet: typingsSlinky.awsSdk.awsSdkStrings.Parquet = "Parquet".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Parquet]
  @scala.inline
  implicit def apply(value: String): ReportFormat = value.asInstanceOf[ReportFormat]
}

