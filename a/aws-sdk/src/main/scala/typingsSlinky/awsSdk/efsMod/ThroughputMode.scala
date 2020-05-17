package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.bursting
  - typingsSlinky.awsSdk.awsSdkStrings.provisioned_
  - java.lang.String
*/
trait ThroughputMode extends js.Object

object ThroughputMode {
  @scala.inline
  def bursting: typingsSlinky.awsSdk.awsSdkStrings.bursting = "bursting".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.bursting]
  @scala.inline
  def provisioned_ : typingsSlinky.awsSdk.awsSdkStrings.provisioned_ = "provisioned".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.provisioned_]
  @scala.inline
  implicit def apply(value: String): ThroughputMode = value.asInstanceOf[ThroughputMode]
}

