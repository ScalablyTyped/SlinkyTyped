package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PRIMARY
  - typingsSlinky.awsSdk.awsSdkStrings.SECONDARY
  - java.lang.String
*/
trait ResourceRecordSetFailover extends js.Object

object ResourceRecordSetFailover {
  @scala.inline
  def PRIMARY: typingsSlinky.awsSdk.awsSdkStrings.PRIMARY = "PRIMARY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PRIMARY]
  @scala.inline
  def SECONDARY: typingsSlinky.awsSdk.awsSdkStrings.SECONDARY = "SECONDARY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SECONDARY]
  @scala.inline
  implicit def apply(value: String): ResourceRecordSetFailover = value.asInstanceOf[ResourceRecordSetFailover]
}

