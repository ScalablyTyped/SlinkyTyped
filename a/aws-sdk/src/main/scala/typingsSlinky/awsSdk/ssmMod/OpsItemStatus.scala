package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Open_
  - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
  - typingsSlinky.awsSdk.awsSdkStrings.Resolved_
  - java.lang.String
*/
trait OpsItemStatus extends js.Object

object OpsItemStatus {
  @scala.inline
  def Open_ : typingsSlinky.awsSdk.awsSdkStrings.Open_ = "Open".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Open_]
  @scala.inline
  def InProgress_ : typingsSlinky.awsSdk.awsSdkStrings.InProgress_ = "InProgress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InProgress_]
  @scala.inline
  def Resolved_ : typingsSlinky.awsSdk.awsSdkStrings.Resolved_ = "Resolved".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Resolved_]
  @scala.inline
  implicit def apply(value: java.lang.String): OpsItemStatus = value.asInstanceOf[OpsItemStatus]
}

