package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.DEPRECATED
  - java.lang.String
*/
trait KafkaVersionStatus extends js.Object

object KafkaVersionStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def DEPRECATED: typingsSlinky.awsSdk.awsSdkStrings.DEPRECATED = "DEPRECATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPRECATED]
  @scala.inline
  implicit def apply(value: String): KafkaVersionStatus = value.asInstanceOf[KafkaVersionStatus]
}

