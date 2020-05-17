package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OK
  - typingsSlinky.awsSdk.awsSdkStrings.IMPAIRED
  - java.lang.String
*/
trait ElasticGpuStatus extends js.Object

object ElasticGpuStatus {
  @scala.inline
  def OK: typingsSlinky.awsSdk.awsSdkStrings.OK = "OK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OK]
  @scala.inline
  def IMPAIRED: typingsSlinky.awsSdk.awsSdkStrings.IMPAIRED = "IMPAIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IMPAIRED]
  @scala.inline
  implicit def apply(value: java.lang.String): ElasticGpuStatus = value.asInstanceOf[ElasticGpuStatus]
}

