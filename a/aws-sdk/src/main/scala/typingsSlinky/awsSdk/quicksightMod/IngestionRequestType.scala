package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INITIAL_INGESTION
  - typingsSlinky.awsSdk.awsSdkStrings.EDIT
  - typingsSlinky.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH
  - typingsSlinky.awsSdk.awsSdkStrings.FULL_REFRESH
  - java.lang.String
*/
trait IngestionRequestType extends js.Object

object IngestionRequestType {
  @scala.inline
  def INITIAL_INGESTION: typingsSlinky.awsSdk.awsSdkStrings.INITIAL_INGESTION = "INITIAL_INGESTION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INITIAL_INGESTION]
  @scala.inline
  def EDIT: typingsSlinky.awsSdk.awsSdkStrings.EDIT = "EDIT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EDIT]
  @scala.inline
  def INCREMENTAL_REFRESH: typingsSlinky.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH = "INCREMENTAL_REFRESH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH]
  @scala.inline
  def FULL_REFRESH: typingsSlinky.awsSdk.awsSdkStrings.FULL_REFRESH = "FULL_REFRESH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FULL_REFRESH]
  @scala.inline
  implicit def apply(value: java.lang.String): IngestionRequestType = value.asInstanceOf[IngestionRequestType]
}

