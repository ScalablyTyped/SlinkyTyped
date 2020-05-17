package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INBOUND
  - typingsSlinky.awsSdk.awsSdkStrings.OUTBOUND
  - java.lang.String
*/
trait ResolverEndpointDirection extends js.Object

object ResolverEndpointDirection {
  @scala.inline
  def INBOUND: typingsSlinky.awsSdk.awsSdkStrings.INBOUND = "INBOUND".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INBOUND]
  @scala.inline
  def OUTBOUND: typingsSlinky.awsSdk.awsSdkStrings.OUTBOUND = "OUTBOUND".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OUTBOUND]
  @scala.inline
  implicit def apply(value: String): ResolverEndpointDirection = value.asInstanceOf[ResolverEndpointDirection]
}

