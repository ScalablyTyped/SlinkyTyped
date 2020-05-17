package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CLUSTER
  - typingsSlinky.awsSdk.awsSdkStrings.PARAMETER_GROUP
  - typingsSlinky.awsSdk.awsSdkStrings.SUBNET_GROUP
  - java.lang.String
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  def CLUSTER: typingsSlinky.awsSdk.awsSdkStrings.CLUSTER = "CLUSTER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CLUSTER]
  @scala.inline
  def PARAMETER_GROUP: typingsSlinky.awsSdk.awsSdkStrings.PARAMETER_GROUP = "PARAMETER_GROUP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PARAMETER_GROUP]
  @scala.inline
  def SUBNET_GROUP: typingsSlinky.awsSdk.awsSdkStrings.SUBNET_GROUP = "SUBNET_GROUP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUBNET_GROUP]
  @scala.inline
  implicit def apply(value: java.lang.String): SourceType = value.asInstanceOf[SourceType]
}

