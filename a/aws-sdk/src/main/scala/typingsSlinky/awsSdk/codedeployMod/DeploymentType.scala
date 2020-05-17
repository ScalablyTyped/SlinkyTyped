package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PLACE
  - typingsSlinky.awsSdk.awsSdkStrings.BLUE_GREEN
  - java.lang.String
*/
trait DeploymentType extends js.Object

object DeploymentType {
  @scala.inline
  def IN_PLACE: typingsSlinky.awsSdk.awsSdkStrings.IN_PLACE = "IN_PLACE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PLACE]
  @scala.inline
  def BLUE_GREEN: typingsSlinky.awsSdk.awsSdkStrings.BLUE_GREEN = "BLUE_GREEN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BLUE_GREEN]
  @scala.inline
  implicit def apply(value: String): DeploymentType = value.asInstanceOf[DeploymentType]
}

