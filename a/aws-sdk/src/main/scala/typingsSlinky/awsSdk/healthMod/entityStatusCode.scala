package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IMPAIRED
  - typingsSlinky.awsSdk.awsSdkStrings.UNIMPAIRED
  - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
trait entityStatusCode extends js.Object

object entityStatusCode {
  @scala.inline
  def IMPAIRED: typingsSlinky.awsSdk.awsSdkStrings.IMPAIRED = "IMPAIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IMPAIRED]
  @scala.inline
  def UNIMPAIRED: typingsSlinky.awsSdk.awsSdkStrings.UNIMPAIRED = "UNIMPAIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNIMPAIRED]
  @scala.inline
  def UNKNOWN: typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN]
  @scala.inline
  implicit def apply(value: String): entityStatusCode = value.asInstanceOf[entityStatusCode]
}

