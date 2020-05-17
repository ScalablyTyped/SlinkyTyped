package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
  - java.lang.String
*/
trait LoadBalancerTlsCertificateDomainStatus extends js.Object

object LoadBalancerTlsCertificateDomainStatus {
  @scala.inline
  def PENDING_VALIDATION: typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def SUCCESS: typingsSlinky.awsSdk.awsSdkStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCESS]
  @scala.inline
  implicit def apply(value: String): LoadBalancerTlsCertificateDomainStatus = value.asInstanceOf[LoadBalancerTlsCertificateDomainStatus]
}

