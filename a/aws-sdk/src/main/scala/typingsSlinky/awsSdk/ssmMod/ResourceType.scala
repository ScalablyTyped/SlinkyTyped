package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ManagedInstance
  - typingsSlinky.awsSdk.awsSdkStrings.Document_
  - typingsSlinky.awsSdk.awsSdkStrings.EC2Instance
  - java.lang.String
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  def ManagedInstance: typingsSlinky.awsSdk.awsSdkStrings.ManagedInstance = "ManagedInstance".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ManagedInstance]
  @scala.inline
  def Document_ : typingsSlinky.awsSdk.awsSdkStrings.Document_ = "Document".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Document_]
  @scala.inline
  def EC2Instance: typingsSlinky.awsSdk.awsSdkStrings.EC2Instance = "EC2Instance".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EC2Instance]
  @scala.inline
  implicit def apply(value: java.lang.String): ResourceType = value.asInstanceOf[ResourceType]
}

