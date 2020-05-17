package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
  - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
trait StatusCode extends js.Object

object StatusCode {
  @scala.inline
  def InProgress_ : typingsSlinky.awsSdk.awsSdkStrings.InProgress_ = "InProgress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InProgress_]
  @scala.inline
  def Succeeded_ : typingsSlinky.awsSdk.awsSdkStrings.Succeeded_ = "Succeeded".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Succeeded_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  implicit def apply(value: String): StatusCode = value.asInstanceOf[StatusCode]
}

