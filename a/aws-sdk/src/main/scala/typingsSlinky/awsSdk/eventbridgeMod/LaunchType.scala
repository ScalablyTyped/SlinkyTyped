package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EC2
  - typingsSlinky.awsSdk.awsSdkStrings.FARGATE
  - java.lang.String
*/
trait LaunchType extends js.Object

object LaunchType {
  @scala.inline
  def EC2: typingsSlinky.awsSdk.awsSdkStrings.EC2 = "EC2".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EC2]
  @scala.inline
  def FARGATE: typingsSlinky.awsSdk.awsSdkStrings.FARGATE = "FARGATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FARGATE]
  @scala.inline
  implicit def apply(value: java.lang.String): LaunchType = value.asInstanceOf[LaunchType]
}

