package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CSV
  - typingsSlinky.awsSdk.awsSdkStrings.ORC
  - typingsSlinky.awsSdk.awsSdkStrings.Parquet
  - java.lang.String
*/
trait InventoryFormat extends js.Object

object InventoryFormat {
  @scala.inline
  def CSV: typingsSlinky.awsSdk.awsSdkStrings.CSV = "CSV".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CSV]
  @scala.inline
  def ORC: typingsSlinky.awsSdk.awsSdkStrings.ORC = "ORC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ORC]
  @scala.inline
  def Parquet: typingsSlinky.awsSdk.awsSdkStrings.Parquet = "Parquet".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Parquet]
  @scala.inline
  implicit def apply(value: String): InventoryFormat = value.asInstanceOf[InventoryFormat]
}

