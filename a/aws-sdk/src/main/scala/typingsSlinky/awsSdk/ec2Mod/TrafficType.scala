package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACCEPT
  - typingsSlinky.awsSdk.awsSdkStrings.REJECT
  - typingsSlinky.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
trait TrafficType extends js.Object

object TrafficType {
  @scala.inline
  def ACCEPT: typingsSlinky.awsSdk.awsSdkStrings.ACCEPT = "ACCEPT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACCEPT]
  @scala.inline
  def REJECT: typingsSlinky.awsSdk.awsSdkStrings.REJECT = "REJECT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REJECT]
  @scala.inline
  def ALL: typingsSlinky.awsSdk.awsSdkStrings.ALL = "ALL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALL]
  @scala.inline
  implicit def apply(value: java.lang.String): TrafficType = value.asInstanceOf[TrafficType]
}

