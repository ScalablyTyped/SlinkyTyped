package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.HTTP
  - typingsSlinky.awsSdk.awsSdkStrings.HTTPS
  - typingsSlinky.awsSdk.awsSdkStrings.HTTP_STR_MATCH
  - typingsSlinky.awsSdk.awsSdkStrings.HTTPS_STR_MATCH
  - typingsSlinky.awsSdk.awsSdkStrings.TCP
  - typingsSlinky.awsSdk.awsSdkStrings.CALCULATED
  - typingsSlinky.awsSdk.awsSdkStrings.CLOUDWATCH_METRIC
  - java.lang.String
*/
trait HealthCheckType extends js.Object

object HealthCheckType {
  @scala.inline
  def HTTP: typingsSlinky.awsSdk.awsSdkStrings.HTTP = "HTTP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTP]
  @scala.inline
  def HTTPS: typingsSlinky.awsSdk.awsSdkStrings.HTTPS = "HTTPS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTPS]
  @scala.inline
  def HTTP_STR_MATCH: typingsSlinky.awsSdk.awsSdkStrings.HTTP_STR_MATCH = "HTTP_STR_MATCH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTP_STR_MATCH]
  @scala.inline
  def HTTPS_STR_MATCH: typingsSlinky.awsSdk.awsSdkStrings.HTTPS_STR_MATCH = "HTTPS_STR_MATCH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTPS_STR_MATCH]
  @scala.inline
  def TCP: typingsSlinky.awsSdk.awsSdkStrings.TCP = "TCP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TCP]
  @scala.inline
  def CALCULATED: typingsSlinky.awsSdk.awsSdkStrings.CALCULATED = "CALCULATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CALCULATED]
  @scala.inline
  def CLOUDWATCH_METRIC: typingsSlinky.awsSdk.awsSdkStrings.CLOUDWATCH_METRIC = "CLOUDWATCH_METRIC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CLOUDWATCH_METRIC]
  @scala.inline
  implicit def apply(value: String): HealthCheckType = value.asInstanceOf[HealthCheckType]
}

