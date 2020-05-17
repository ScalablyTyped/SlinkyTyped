package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.RebootIfNeeded
  - typingsSlinky.awsSdk.awsSdkStrings.NoReboot
  - java.lang.String
*/
trait RebootOption extends js.Object

object RebootOption {
  @scala.inline
  def RebootIfNeeded: typingsSlinky.awsSdk.awsSdkStrings.RebootIfNeeded = "RebootIfNeeded".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RebootIfNeeded]
  @scala.inline
  def NoReboot: typingsSlinky.awsSdk.awsSdkStrings.NoReboot = "NoReboot".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NoReboot]
  @scala.inline
  implicit def apply(value: java.lang.String): RebootOption = value.asInstanceOf[RebootOption]
}

