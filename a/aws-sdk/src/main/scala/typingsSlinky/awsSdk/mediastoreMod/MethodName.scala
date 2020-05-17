package typingsSlinky.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PUT
  - typingsSlinky.awsSdk.awsSdkStrings.GET
  - typingsSlinky.awsSdk.awsSdkStrings.DELETE
  - typingsSlinky.awsSdk.awsSdkStrings.HEAD
  - java.lang.String
*/
trait MethodName extends js.Object

object MethodName {
  @scala.inline
  def PUT: typingsSlinky.awsSdk.awsSdkStrings.PUT = "PUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PUT]
  @scala.inline
  def GET: typingsSlinky.awsSdk.awsSdkStrings.GET = "GET".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GET]
  @scala.inline
  def DELETE: typingsSlinky.awsSdk.awsSdkStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETE]
  @scala.inline
  def HEAD: typingsSlinky.awsSdk.awsSdkStrings.HEAD = "HEAD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HEAD]
  @scala.inline
  implicit def apply(value: String): MethodName = value.asInstanceOf[MethodName]
}

