package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EBS
  - typingsSlinky.awsSdk.awsSdkStrings.EFS
  - java.lang.String
*/
trait BrokerStorageType extends js.Object

object BrokerStorageType {
  @scala.inline
  def EBS: typingsSlinky.awsSdk.awsSdkStrings.EBS = "EBS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EBS]
  @scala.inline
  def EFS: typingsSlinky.awsSdk.awsSdkStrings.EFS = "EFS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EFS]
  @scala.inline
  implicit def apply(value: String): BrokerStorageType = value.asInstanceOf[BrokerStorageType]
}

