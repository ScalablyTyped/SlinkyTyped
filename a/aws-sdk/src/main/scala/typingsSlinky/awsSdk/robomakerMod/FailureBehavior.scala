package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Fail_
  - typingsSlinky.awsSdk.awsSdkStrings.Continue_
  - java.lang.String
*/
trait FailureBehavior extends js.Object

object FailureBehavior {
  @scala.inline
  def Fail_ : typingsSlinky.awsSdk.awsSdkStrings.Fail_ = "Fail".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Fail_]
  @scala.inline
  def Continue_ : typingsSlinky.awsSdk.awsSdkStrings.Continue_ = "Continue".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Continue_]
  @scala.inline
  implicit def apply(value: String): FailureBehavior = value.asInstanceOf[FailureBehavior]
}

