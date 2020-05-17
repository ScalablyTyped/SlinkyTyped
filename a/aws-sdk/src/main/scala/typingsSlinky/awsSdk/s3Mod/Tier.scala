package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Standard_
  - typingsSlinky.awsSdk.awsSdkStrings.Bulk_
  - typingsSlinky.awsSdk.awsSdkStrings.Expedited
  - java.lang.String
*/
trait Tier extends js.Object

object Tier {
  @scala.inline
  def Standard_ : typingsSlinky.awsSdk.awsSdkStrings.Standard_ = "Standard".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Standard_]
  @scala.inline
  def Bulk_ : typingsSlinky.awsSdk.awsSdkStrings.Bulk_ = "Bulk".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Bulk_]
  @scala.inline
  def Expedited: typingsSlinky.awsSdk.awsSdkStrings.Expedited = "Expedited".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Expedited]
  @scala.inline
  implicit def apply(value: String): Tier = value.asInstanceOf[Tier]
}

