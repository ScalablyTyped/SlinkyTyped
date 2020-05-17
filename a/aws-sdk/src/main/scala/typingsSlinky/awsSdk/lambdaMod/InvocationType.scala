package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Event_
  - typingsSlinky.awsSdk.awsSdkStrings.RequestResponse
  - typingsSlinky.awsSdk.awsSdkStrings.DryRun
  - java.lang.String
*/
trait InvocationType extends js.Object

object InvocationType {
  @scala.inline
  def Event_ : typingsSlinky.awsSdk.awsSdkStrings.Event_ = "Event".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Event_]
  @scala.inline
  def RequestResponse: typingsSlinky.awsSdk.awsSdkStrings.RequestResponse = "RequestResponse".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RequestResponse]
  @scala.inline
  def DryRun: typingsSlinky.awsSdk.awsSdkStrings.DryRun = "DryRun".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DryRun]
  @scala.inline
  implicit def apply(value: java.lang.String): InvocationType = value.asInstanceOf[InvocationType]
}

