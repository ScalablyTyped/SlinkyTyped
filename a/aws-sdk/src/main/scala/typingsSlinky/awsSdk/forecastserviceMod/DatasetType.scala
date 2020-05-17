package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TARGET_TIME_SERIES
  - typingsSlinky.awsSdk.awsSdkStrings.RELATED_TIME_SERIES
  - typingsSlinky.awsSdk.awsSdkStrings.ITEM_METADATA
  - java.lang.String
*/
trait DatasetType extends js.Object

object DatasetType {
  @scala.inline
  def TARGET_TIME_SERIES: typingsSlinky.awsSdk.awsSdkStrings.TARGET_TIME_SERIES = "TARGET_TIME_SERIES".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TARGET_TIME_SERIES]
  @scala.inline
  def RELATED_TIME_SERIES: typingsSlinky.awsSdk.awsSdkStrings.RELATED_TIME_SERIES = "RELATED_TIME_SERIES".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RELATED_TIME_SERIES]
  @scala.inline
  def ITEM_METADATA: typingsSlinky.awsSdk.awsSdkStrings.ITEM_METADATA = "ITEM_METADATA".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ITEM_METADATA]
  @scala.inline
  implicit def apply(value: java.lang.String): DatasetType = value.asInstanceOf[DatasetType]
}

