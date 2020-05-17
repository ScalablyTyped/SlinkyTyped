package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_SHARED
  - typingsSlinky.awsSdk.awsSdkStrings.SHARED_WITH_ME
  - typingsSlinky.awsSdk.awsSdkStrings.SHARED_BY_ME
  - java.lang.String
*/
trait ShareStatus extends js.Object

object ShareStatus {
  @scala.inline
  def NOT_SHARED: typingsSlinky.awsSdk.awsSdkStrings.NOT_SHARED = "NOT_SHARED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_SHARED]
  @scala.inline
  def SHARED_WITH_ME: typingsSlinky.awsSdk.awsSdkStrings.SHARED_WITH_ME = "SHARED_WITH_ME".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SHARED_WITH_ME]
  @scala.inline
  def SHARED_BY_ME: typingsSlinky.awsSdk.awsSdkStrings.SHARED_BY_ME = "SHARED_BY_ME".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SHARED_BY_ME]
  @scala.inline
  implicit def apply(value: String): ShareStatus = value.asInstanceOf[ShareStatus]
}

