package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
  - typingsSlinky.awsSdk.awsSdkStrings.PER_BROKER
  - typingsSlinky.awsSdk.awsSdkStrings.PER_TOPIC_PER_BROKER
  - java.lang.String
*/
trait EnhancedMonitoring extends js.Object

object EnhancedMonitoring {
  @scala.inline
  def DEFAULT: typingsSlinky.awsSdk.awsSdkStrings.DEFAULT = "DEFAULT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEFAULT]
  @scala.inline
  def PER_BROKER: typingsSlinky.awsSdk.awsSdkStrings.PER_BROKER = "PER_BROKER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PER_BROKER]
  @scala.inline
  def PER_TOPIC_PER_BROKER: typingsSlinky.awsSdk.awsSdkStrings.PER_TOPIC_PER_BROKER = "PER_TOPIC_PER_BROKER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PER_TOPIC_PER_BROKER]
  @scala.inline
  implicit def apply(value: String): EnhancedMonitoring = value.asInstanceOf[EnhancedMonitoring]
}

