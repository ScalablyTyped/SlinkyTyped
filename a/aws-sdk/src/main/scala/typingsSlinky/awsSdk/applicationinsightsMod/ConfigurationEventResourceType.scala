package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CLOUDWATCH_ALARM
  - typingsSlinky.awsSdk.awsSdkStrings.CLOUDFORMATION
  - typingsSlinky.awsSdk.awsSdkStrings.SSM_ASSOCIATION
  - java.lang.String
*/
trait ConfigurationEventResourceType extends js.Object

object ConfigurationEventResourceType {
  @scala.inline
  def CLOUDWATCH_ALARM: typingsSlinky.awsSdk.awsSdkStrings.CLOUDWATCH_ALARM = "CLOUDWATCH_ALARM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CLOUDWATCH_ALARM]
  @scala.inline
  def CLOUDFORMATION: typingsSlinky.awsSdk.awsSdkStrings.CLOUDFORMATION = "CLOUDFORMATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CLOUDFORMATION]
  @scala.inline
  def SSM_ASSOCIATION: typingsSlinky.awsSdk.awsSdkStrings.SSM_ASSOCIATION = "SSM_ASSOCIATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SSM_ASSOCIATION]
  @scala.inline
  implicit def apply(value: String): ConfigurationEventResourceType = value.asInstanceOf[ConfigurationEventResourceType]
}

