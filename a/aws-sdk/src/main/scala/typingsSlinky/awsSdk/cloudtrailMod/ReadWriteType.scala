package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ReadOnly
  - typingsSlinky.awsSdk.awsSdkStrings.WriteOnly
  - typingsSlinky.awsSdk.awsSdkStrings.All_
  - java.lang.String
*/
trait ReadWriteType extends js.Object

object ReadWriteType {
  @scala.inline
  def ReadOnly: typingsSlinky.awsSdk.awsSdkStrings.ReadOnly = "ReadOnly".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ReadOnly]
  @scala.inline
  def WriteOnly: typingsSlinky.awsSdk.awsSdkStrings.WriteOnly = "WriteOnly".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WriteOnly]
  @scala.inline
  def All_ : typingsSlinky.awsSdk.awsSdkStrings.All_ = "All".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.All_]
  @scala.inline
  implicit def apply(value: java.lang.String): ReadWriteType = value.asInstanceOf[ReadWriteType]
}

