package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OPEN_APP
  - typingsSlinky.awsSdk.awsSdkStrings.DEEP_LINK
  - typingsSlinky.awsSdk.awsSdkStrings.URL
  - java.lang.String
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def OPEN_APP: typingsSlinky.awsSdk.awsSdkStrings.OPEN_APP = "OPEN_APP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OPEN_APP]
  @scala.inline
  def DEEP_LINK: typingsSlinky.awsSdk.awsSdkStrings.DEEP_LINK = "DEEP_LINK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEEP_LINK]
  @scala.inline
  def URL: typingsSlinky.awsSdk.awsSdkStrings.URL = "URL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.URL]
  @scala.inline
  implicit def apply(value: String): Action = value.asInstanceOf[Action]
}

