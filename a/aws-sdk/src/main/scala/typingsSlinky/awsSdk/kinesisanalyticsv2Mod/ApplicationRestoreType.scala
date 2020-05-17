package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SKIP_RESTORE_FROM_SNAPSHOT
  - typingsSlinky.awsSdk.awsSdkStrings.RESTORE_FROM_LATEST_SNAPSHOT
  - typingsSlinky.awsSdk.awsSdkStrings.RESTORE_FROM_CUSTOM_SNAPSHOT
  - java.lang.String
*/
trait ApplicationRestoreType extends js.Object

object ApplicationRestoreType {
  @scala.inline
  def SKIP_RESTORE_FROM_SNAPSHOT: typingsSlinky.awsSdk.awsSdkStrings.SKIP_RESTORE_FROM_SNAPSHOT = "SKIP_RESTORE_FROM_SNAPSHOT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SKIP_RESTORE_FROM_SNAPSHOT]
  @scala.inline
  def RESTORE_FROM_LATEST_SNAPSHOT: typingsSlinky.awsSdk.awsSdkStrings.RESTORE_FROM_LATEST_SNAPSHOT = "RESTORE_FROM_LATEST_SNAPSHOT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RESTORE_FROM_LATEST_SNAPSHOT]
  @scala.inline
  def RESTORE_FROM_CUSTOM_SNAPSHOT: typingsSlinky.awsSdk.awsSdkStrings.RESTORE_FROM_CUSTOM_SNAPSHOT = "RESTORE_FROM_CUSTOM_SNAPSHOT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RESTORE_FROM_CUSTOM_SNAPSHOT]
  @scala.inline
  implicit def apply(value: String): ApplicationRestoreType = value.asInstanceOf[ApplicationRestoreType]
}

