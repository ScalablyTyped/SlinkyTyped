package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ingress
  - typingsSlinky.awsSdk.awsSdkStrings.egress
  - java.lang.String
*/
trait TrafficDirection extends js.Object

object TrafficDirection {
  @scala.inline
  def ingress: typingsSlinky.awsSdk.awsSdkStrings.ingress = "ingress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ingress]
  @scala.inline
  def egress: typingsSlinky.awsSdk.awsSdkStrings.egress = "egress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.egress]
  @scala.inline
  implicit def apply(value: java.lang.String): TrafficDirection = value.asInstanceOf[TrafficDirection]
}

