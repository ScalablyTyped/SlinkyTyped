package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.MULTIVALUE
  - typingsSlinky.awsSdk.awsSdkStrings.WEIGHTED
  - java.lang.String
*/
trait RoutingPolicy extends js.Object

object RoutingPolicy {
  @scala.inline
  def MULTIVALUE: typingsSlinky.awsSdk.awsSdkStrings.MULTIVALUE = "MULTIVALUE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MULTIVALUE]
  @scala.inline
  def WEIGHTED: typingsSlinky.awsSdk.awsSdkStrings.WEIGHTED = "WEIGHTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WEIGHTED]
  @scala.inline
  implicit def apply(value: String): RoutingPolicy = value.asInstanceOf[RoutingPolicy]
}

